package com.example.facebooklite;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.facebooklite.models.Friend;

public class FriendsActivity extends AppCompatActivity {

    private Button mBrandon;
    private Button mLuther;
    private Button mNick;
    private Button mPaul;
    private Button mTyler;

    // Create a Friend array
    Friend[] friends = {
            new Friend("Brandon", "Brandon's bio"),
            new Friend("Luther", "Luther's bio"),
            new Friend("Nick", "Nick's bio"),
            new Friend("Paul", "Paul's bio"),
            new Friend("Tyler", "Tyler's bio")
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.friends_activity);

        Intent intent = getIntent();

        mBrandon = findViewById(R.id.brandon);
        mLuther = findViewById(R.id.luther);
        mNick = findViewById(R.id.nick);
        mPaul = findViewById(R.id.paul);
        mTyler = findViewById(R.id.tyler);
    }

}
