package com.example.paulsuarez.a27_facebook_lite;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class FriendsActivity extends AppCompatActivity{


    Friend[] friends = {
            new Friend("Alice", "My name is Alice and I'm a great friend"),
            new Friend("Bob", "My name is Bob and I'm a great friend"),
            new Friend("Ted", "My name is Ted and I'm a great friend"),
            new Friend("Joe", "My name is Joe and I'm a great friend"),
            new Friend("Sam", "My name is Sam and I'm a great friend"),
    };

    private TextView name;
    private Button enter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends);

        //friend 1

        name = findViewById(R.id.name1);

        Friend friend1 = friends[0];
        name.setText(friend1.name);


        enter = findViewById(R.id.enter1);

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FriendsActivity.this, FriendDetailActivity.class);
                intent.putExtra("name", friends[0].name);
                intent.putExtra("bio", friends[0].bio);
                startActivity(intent);
            }
        });

        //friend 2

        name = findViewById(R.id.name2);

        Friend friend2 = friends[1];
        name.setText(friend2.name);


        enter = findViewById(R.id.enter2);

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FriendsActivity.this, FriendDetailActivity.class);
                intent.putExtra("name", friends[1].name);
                intent.putExtra("bio", friends[1].bio);
                startActivity(intent);
            }
        });

        //friend 3

        name = findViewById(R.id.name3);

        Friend friend3 = friends[2];
        name.setText(friend3.name);


        enter = findViewById(R.id.enter3);

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FriendsActivity.this, FriendDetailActivity.class);
                intent.putExtra("name", friends[2].name);
                intent.putExtra("bio", friends[2].bio);
                startActivity(intent);
            }
        });

        //friend 4

        name = findViewById(R.id.name4);

        Friend friend4 = friends[3];
        name.setText(friend4.name);


        enter = findViewById(R.id.enter4);

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FriendsActivity.this, FriendDetailActivity.class);
                intent.putExtra("name", friends[3].name);
                intent.putExtra("bio", friends[3].bio);
                startActivity(intent);
            }
        });

        //friend 5

        name = findViewById(R.id.name5);

        Friend friend5 = friends[4];
        name.setText(friend5.name);


        enter = findViewById(R.id.enter5);

        enter.setOnClickListener(new View.OnClickListener() {
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
