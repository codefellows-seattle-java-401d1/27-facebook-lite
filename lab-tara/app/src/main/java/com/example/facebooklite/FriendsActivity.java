package com.example.facebooklite;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.facebooklite.models.Friend;

public class FriendsActivity extends AppCompatActivity {
    public static final int REQUEST_CHOOSE_FRIEND = 1;

    private Button mKaty;
    private Button mJustin;
    private Button mBarack;
    private Button mRihanna;
    private Button mTaylor;

    private Button mBack;

    // Create a Friend array
    Friend[] friends = {
            new Friend("placeholdername", "placeholderbio"),
            new Friend("placeholdername", "placeholderbio"),
            new Friend("placeholdername", "placeholderbio"),
            new Friend("placeholdername", "placeholderbio"),
            new Friend("placeholdername", "placeholderbio")
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.friends_activity);

        friends[0].name = getString(R.string.katy_name);
        friends[1].name = getString(R.string.justin_name);
        friends[2].name = getString(R.string.barack_name);
        friends[3].name = getString(R.string.rihanna_name);
        friends[4].name = getString(R.string.taylor_name);

        friends[0].bio = getString(R.string.katy_bio);
        friends[1].bio = getString(R.string.justin_bio);
        friends[2].bio = getString(R.string.barack_bio);
        friends[3].bio = getString(R.string.rihanna_bio);
        friends[4].bio = getString(R.string.taylor_bio);

        mBack = findViewById(R.id.back);
        mBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        mKaty = findViewById(R.id.katy);
        mKaty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FriendsActivity.this, FriendDetailActivity.class);
                intent.putExtra("name", friends[0].name);
                intent.putExtra("bio", friends[0].bio);
                startActivity(intent);
            }
        });

        mJustin = findViewById(R.id.justin);
        mJustin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FriendsActivity.this, FriendDetailActivity.class);
                intent.putExtra("name", friends[1].name);
                intent.putExtra("bio", friends[1].bio);
                startActivity(intent);
            }
        });

        mBarack = findViewById(R.id.barack);
        mBarack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FriendsActivity.this, FriendDetailActivity.class);
                intent.putExtra("name", friends[2].name);
                intent.putExtra("bio", friends[2].bio);
                startActivity(intent);
            }
        });

        mRihanna = findViewById(R.id.rihanna);
        mRihanna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FriendsActivity.this, FriendDetailActivity.class);
                intent.putExtra("name", friends[3].name);
                intent.putExtra("bio", friends[3].bio);
                startActivity(intent);
            }
        });

        mTaylor = findViewById(R.id.taylor);
        mTaylor.setOnClickListener(new View.OnClickListener() {
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




