package com.example.musicmenu;

import android.os.Parcel;
import android.os.Parcelable;

public class Music implements Parcelable {

    private String name, artist;
    private double length;
    private int imageResourceID;

    //code -> generate to get the constructor and get/set methods
    //hold shift you can click on first and last element and it will select
    //everything in between

    public Music(String name, String artist, double length, int imageResourceID) {
        this.name = name;
        this.artist = artist;
        this.length = length;
    }

    // this code is needed for the Food class to work with Parcelable
    // only changes needed here are to change the name from food to
    // whatever class you are using
    public static final Parcelable.Creator<Music> CREATOR = new
            Parcelable.Creator<Music>() {

                @Override
                public Music createFromParcel(Parcel parcel) {
                    return new Music(parcel);
                }

                @Override
                public Music[] newArray(int size) {
                    return new Music[0];
                }
            };
    /** This is a "constructor" of sorts that is needed with the Parceable interface to
     * tell the intent how to create a Food object when it is received from the intent
     * basically it is setting each instance variable as a String or Int
     * if the instance variables were objects themselves you would need to do more complex * code.  We need to read in the String, double, and int data.
     *
     * @param parcel    the parcel that is received from the intent
     */
    // to avoid errors keep the order of the parameters that you are setting the same in all
    // of these methods it should match what you have in your original constructor
    public Music(Parcel parcel) {
        name = parcel.readString();
        artist = parcel.readString();
        length = parcel.readDouble();
        imageResourceID = parcel.readInt();
    }
    /**
     * This is what is used when we send the Food object through an intent
     * It is also a method that is part of the Parceable interface and is needed
     * to set up the object that is being sent.  Then, when it is received, the
     * other Food constructor that accepts a Parcel reference can "unpack it"
     *
     */
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(artist);
        dest.writeDouble(length);
        dest.writeInt(imageResourceID);
    }
    // A default constructor is required for the Parceable interface to work
    // if you don't have a default constructor without parameters, the code wont run
    public Music() {
        name = "";
        artist = "";
        length = 0;
        imageResourceID = 0;
    }

    /**
     * This method is required for the Parceable interface.  As of now, this method * is in the default state and doesn't really do anything.
     *
     * If your Parcelable class will have child classes, you'll need to
     * take some extra care with the describeContents() method. This would
     * let you identify the specific child class that should be created by
     * the Parcelable.Creator. You can read more about how this works on
     *  Stack Overflow with this link.
     *           https://stackoverflow.com/questions/4778834/purpose-of-describecontents-of-parcelable-interface
     * @return
     */

    @Override
    public int describeContents() {
        return 0;
    }



    //this tells you how to display this object
    //when you print a food object, the toString method is called automatically
    public String toString(){
        String str = "";

        return str;
    }
    public static final Music[] country = {
            new Music("The Kind of Love We Make", "Luke Combs", 3.44, R.drawable.lukecombs),
            new Music("Wasted On You", "Morgan Wallen", 2.58, R.drawable.wastedonyou),
            new Music("You Proof", "Morgan Wallen", 2.37, R.drawable.youproof)
    };
    public static final Music[] hipHop = {
            new Music("Super Freaky Girl", "Nicki Minaj", 2.50, R.drawable.nickiminaj),
            new Music("Wait For You", "Future feat.Drake", 3.09, R.drawable.waitforyou),
            new Music("Vegas", "Doja Cat", 3.02, R.drawable.vegas)
    };
    public static final Music[] pop = {
            new Music("As It Was", "Harry Styles", 2.47, R.drawable.harrystyles),
            new Music("Bad Habit", "Steve Lacy", 3.52, R.drawable.stevelacy),
            new Music("Sunroof", "Nicky youre & dazy", 2.43, R.drawable.sunroof)
    };

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public int getImageResourceID() {
        return imageResourceID;
    }
    public void setImageResourceID(int imageResourceID) {
        this.imageResourceID = imageResourceID;
    }
}
