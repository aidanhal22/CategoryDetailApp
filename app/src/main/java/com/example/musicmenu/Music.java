package com.example.musicmenu;

public class Music {

    private String genre, name, artist;
    private double length;

    //code -> generate to get the constructor and get/set methods
    //hold shift you can click on first and last element and it will select
    //everything in between

    public Music(String genre, String name, String artist, double length) {
        this.genre = genre;
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
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

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
}
