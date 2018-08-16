package com.example.facebooklite;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.facebooklite.models.Friend;

public class FriendsActivity extends AppCompatActivity{

    private Button mTyler;
    private Button mPaul;
    private Button mLuther;
    private Button mBrandiboi;
    private Button mTara;
    private Button mBack;

    //Creating an array of Friends named friends.
    Friend[] friends = {
            new Friend("Tyler", "placeholderbio"),
            new Friend("Paul", "placeholderbio"),
            new Friend("Luther", "placeholderbio"),
            new Friend("Brandiboi", "placeholderbio"),
            new Friend("Tara", "placeholderbio")
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.friends_activity);

        // We had to do this because getString doesn't work outside onCreate()
        // This is incredibly hacky and replace with better stuff!
        friends[0].bio = getString(R.string.tyler_bio);
        friends[1].bio = getString(R.string.paul_bio);
        friends[2].bio = getString(R.string.luther_bio);
        friends[3].bio = getString(R.string.brandon_bio);
        friends[4].bio = getString(R.string.tara_bio);
        // What a mess


        mBack = findViewById(R.id.back);
        mTyler = findViewById(R.id.tyler);
        mPaul = findViewById(R.id.paul);
        mLuther = findViewById(R.id.luther);
        mBrandiboi = findViewById(R.id.brandiboi);
        mTara = findViewById(R.id.tara);

        mBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        mTyler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FriendsActivity.this, FriendDetailActivity.class);
                intent.putExtra("name", friends[0].name);
                intent.putExtra("bio", friends[0].bio);
                startActivity(intent);
            }
        });

        mPaul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FriendsActivity.this, FriendDetailActivity.class);
                intent.putExtra("name", friends[1].name);
                intent.putExtra("bio", friends[1].bio);
                startActivity(intent);
            }
        });

        mLuther.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FriendsActivity.this, FriendDetailActivity.class);
                intent.putExtra("name", friends[2].name);
                intent.putExtra("bio", friends[2].bio);
                startActivity(intent);
            }
        });

        mBrandiboi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FriendsActivity.this, FriendDetailActivity.class);
                intent.putExtra("name", friends[3].name);
                intent.putExtra("bio", friends[3].bio);
                startActivity(intent);
            }
        });

        mTara.setOnClickListener(new View.OnClickListener() {
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
