package com.example.a27_facebook_lite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.a27_facebook_lite.models.Friends;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public TextView name1;
    public TextView name2;
    public TextView name3;
    public TextView name4;
    public TextView name5;
    public Button seeFriends;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name1 = findViewById(R.id.friend1);
        name2 = findViewById(R.id.friend2);
        name3 = findViewById(R.id.friend3);
        name4 = findViewById(R.id.friend4);
        name5 = findViewById(R.id.friend5);

        seeFriends = findViewById(R.id.seeFriends);

        //followed Paul's repo as an example
        seeFriends.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FriendActivity.class);
                startActivity(intent);
            }
        });
    }
}
