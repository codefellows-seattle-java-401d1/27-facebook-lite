package com.android.sooz.friendsapp.models;

public class Friend {

    public String name;
    public int drawableID;
    public String bio;
    public String instaHandle;

    public Friend(String name, int drawableID, String bio, String instaHandle) {
        this.name = name;
        this.drawableID = drawableID;
        this.bio = bio;
        this.instaHandle = instaHandle;
    }
}
