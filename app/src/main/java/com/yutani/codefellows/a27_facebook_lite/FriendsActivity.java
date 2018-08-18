package com.yutani.codefellows.a27_facebook_lite;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.yutani.codefellows.a27_facebook_lite.model.Friend;

public class FriendsActivity extends AppCompatActivity {
    Friend[] friends = {
            new Friend("Paul", "placeholder"),
            new Friend("Tyler", "placeholder"),
            new Friend("Nick", "placeholder"),
            new Friend("Tara", "placeholder"),
            new Friend("Jean", "placeholder")
    };

    private Button mGoHomeBtn;

    private Button mFriend1Btn;
    private Button mFriend2Btn;
    private Button mFriend3Btn;
    private Button mFriend4Btn;
    private Button mFriend5Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends);

        mGoHomeBtn = findViewById(R.id.go_back_btn);

        mFriend1Btn = findViewById(R.id.friend_1_btn);
        mFriend2Btn = findViewById(R.id.friend_2_btn);
        mFriend3Btn = findViewById(R.id.friend_3_btn);
        mFriend4Btn = findViewById(R.id.friend_4_btn);
        mFriend5Btn = findViewById(R.id.friend_5_btn);

        friends[0].bio = getString(R.string.paul_bio);
        friends[1].bio = getString(R.string.tyler_bio);
        friends[2].bio = getString(R.string.nick_bio);
        friends[3].bio = getString(R.string.tara_bio);
        friends[4].bio = getString(R.string.jean_bio);

        mGoHomeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        mFriend1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FriendsActivity.this, FriendDetailActivity.class);
                intent.putExtra("name", friends[0].name);
                intent.putExtra("bio", friends[0].bio);

                startActivity(intent);
            }
        });

        mFriend2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FriendsActivity.this, FriendDetailActivity.class);
                intent.putExtra("name", friends[1].name);
                intent.putExtra("bio", friends[1].bio);

                startActivity(intent);
            }
        });

        mFriend3Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FriendsActivity.this, FriendDetailActivity.class);
                intent.putExtra("name", friends[2].name);
                intent.putExtra("bio", friends[2].bio);

                startActivity(intent);
            }
        });

        mFriend4Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FriendsActivity.this, FriendDetailActivity.class);
                intent.putExtra("name", friends[3].name);
                intent.putExtra("bio", friends[3].bio);

                startActivity(intent);
            }
        });

        mFriend5Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FriendsActivity.this, FriendDetailActivity.class);
                intent.putExtra("name", friends[4].name);
                intent.putExtra("bio", friends[4].bio);

                startActivity(intent);
            }
        });
    }
}
