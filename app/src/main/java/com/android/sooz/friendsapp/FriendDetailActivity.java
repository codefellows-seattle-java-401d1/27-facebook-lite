package com.android.sooz.friendsapp;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.android.sooz.friendsapp.models.Friend;

public class FriendDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friend_detail);

    }

//    //creates single project page/view within app
//    public void showFriend(){
//
//        //allows user to cycle through friends on a loo
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
