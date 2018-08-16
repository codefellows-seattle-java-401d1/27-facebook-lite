package com.example.tyler.a27_facebook_lite;

import android.content.Intent;

public class Friend {

    public String name;
    public String bio;

    public Friend(String name, String bio){
        this.name = name;
        this.bio = bio;
    }

    public void fillIntent(Intent intent){
        intent.putExtra("name", this.name);
        intent.putExtra("bio", this.bio);
    }

    public static Friend fromIntent(Intent intent){
        String name = intent.getStringExtra("name");
        String bio = intent.getStringExtra("bio");

        Friend friend = new Friend(name, bio);
        return friend;
    }
}
