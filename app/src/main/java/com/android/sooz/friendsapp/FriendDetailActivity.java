package com.android.sooz.friendsapp;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.android.sooz.friendsapp.models.Friend;

public class FriendDetailActivity extends AppCompatActivity {

    private Button backToMain;
    private Button backFriendsList;


    private TextView name;
    private TextView bio;
    private TextView instaHandle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friend_detail);

        Intent data = getIntent();

        data.getStringExtra("name");
        data.getStringExtra("bio");
        data.getStringExtra("instaHandle");

        name = findViewById(R.id.name);
        name.setText(data.getStringExtra("name"));
        bio = findViewById(R.id.bio);
        bio.setText(data.getStringExtra("bio"));
        instaHandle = findViewById(R.id.instaHandle);
        instaHandle.setText(data.getStringExtra("instaHandle"));

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
}
