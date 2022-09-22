package com.example.musicmenu;

public class Music {

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
