package com.android.sooz.friendsapp;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.sooz.friendsapp.models.Friend;

public class FriendActivity extends AppCompatActivity {

    Friend[] friends = {
            new Friend("Little Mac & Big Tony", R.drawable.littlemac_bigtony, getString(R.string.bio_mactony), "@littlemac.bigtony"),
            new Friend( "Tortilla & Chulula", R.drawable.gatos_hermans, getString(R.string.bio_gatos), "@gatos_hermanas"),
            new Friend("Stewie & Simon", R.drawable.stewie_simon, getString(R.string.bio_stewiesimon), "@stewie_and_simon"),
            new Friend("Maple Cat", R.drawable.maplecat, getString(R.string.bio_maple), "@maple.cat"),
            new Friend("Stevie Nicks", R.drawable.stevie_devonrex, getString(R.string.bio_stevie), "@steviethedevonrex")
    };

    //variables for content on each app page/view
    private ImageView picture;
    private TextView name;
    private TextView bio;
    private TextView instaHandle;

    private Button mfriendButton1;
    private Button mfriendButton2;
    private Button mfriendButton3;
    private Button mfriendButton4;
    private Button mfriendButton5;

    private Button backToMain;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friend);

//        Intent intent = getIntent();
////
//        button = findViewById(R.id.friendButton1);
//
//        showFriends();

    }

//
//    //creates list of fir
//    public void showFriends(){
//        int currentIndex = 0;
//
//        Friend friend = friends[currentIndex];
//        name.setText(friend.name);
//        bio.setText(friend.bio);
//        instaHandle.setText(friend.instaHandle);
//
//        Drawable pic = getResources().getDrawable(friend.drawableID);
//        picture.setImageDrawable(pic);
//    }


}
