package com.android.sooz.friendsapp;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.android.sooz.friendsapp.models.Friend;

public class FriendDetailActivity extends AppCompatActivity {

    private Button backToMain;
    private Button backFriendsList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friend_detail);

        backFriendsList = findViewById(R.id.backFriendList);
        backFriendsList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FriendDetailActivity.this, FriendActivity.class);
                startActivity(intent);
            }
        });

        backToMain = findViewById(R.id.backToMain);
        backToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FriendDetailActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

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
