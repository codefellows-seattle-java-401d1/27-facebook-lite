package com.android.sooz.friendsapp.models;

public class Friend {

    public String name;
//    pictures seem to be causing errors in building list
//    public int drawableID;
    public String bio;
    public String instaHandle;

    public Friend(String name, String bio, String instaHandle) {
        this.name = name;
//        this.drawableID = drawableID;
        this.bio = bio;
        this.instaHandle = instaHandle;
    }
}
