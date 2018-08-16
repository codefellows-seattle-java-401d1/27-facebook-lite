package com.example.a27_facebook_lite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.a27_facebook_lite.models.Friends;

public class FriendActivity extends AppCompatActivity {

    public TextView name;
    public Button details;

    Friends[] friends = {
            new Friends("Becky", "Becky is the charge nurse for Auburn Hospital Labor and Delivery ward. She is mom to 5 kids and is active in her church."),
            new Friends("Laura", "Laura is an excellent seamstress and crochet artist and quiltist. She is the mother of 2 boys and has a penchant for photography."),
            new Friends("Rachel", "Rachel is a former assistant dean for Pensacola Christian College and now a teacher at Pensacola Christian Academy. She has her masters in School Administration and Management."),
            new Friends("Sam", "Sam has done practically every office job under the sun and rocks at whatever position she gets into. If you want a lean running office, she is the one to make it happen."),
            new Friends("Gene", "Gene is a former Army Ranger and CEO/Owner of Ranger Industries. His passion for all things military keeps him active in the retired military community."),
            new Friends("Brenda", "Brenda is a music and drama instructor for a private school in Reno, NV. She is living her passion teaching music and drama to the next generation.")
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friend);


       //following Paul's example - I am so lost on this one. Why doesn't it just list them all out like on the previous lab? TODO: Looking into why each has to be specified here.

       //Friend 1:

        name = findViewById(R.id.friend1);
        Friends friend1 = friends[0];
        name.setText(friend1.name);

        details = findViewById(R.id.detailFriend1);
        details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FriendActivity.this, FriendDetailActivity.class);
                intent.putExtra("name", friends[0].name);
                intent.putExtra("bio", friends[0].bio);
                startActivity(intent);
            }
        });


        //Friend 2:

        name = findViewById(R.id.friend2);
        Friends friend2 = friends[1];
        name.setText(friend2.name);

        details = findViewById(R.id.detailFriend2);
        details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FriendActivity.this, FriendDetailActivity.class);
                intent.putExtra("name", friends[1].name);
                intent.putExtra("bio", friends[1].bio);
                startActivity(intent);
            }
        });

        //Friend 3:

        name = findViewById(R.id.friend3);
        Friends friend3 = friends[2];
        name.setText(friend3.name);

        details = findViewById(R.id.detailFriend3);
        details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FriendActivity.this, FriendDetailActivity.class);
                intent.putExtra("name", friends[2].name);
                intent.putExtra("bio", friends[2].bio);
                startActivity(intent);
            }
        });

        //Friend 4:

        name = findViewById(R.id.friend4);
        Friends friend4 = friends[3];
        name.setText(friend4.name);

        details = findViewById(R.id.detailFriend4);
        details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FriendActivity.this, FriendDetailActivity.class);
                intent.putExtra("name", friends[3].name);
                intent.putExtra("bio", friends[3].bio);
                startActivity(intent);
            }
        });

        //Friend 5:

        name = findViewById(R.id.friend5);
        Friends friend5 = friends[4];
        name.setText(friend5.name);

        details = findViewById(R.id.detailFriend5);
        details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FriendActivity.this, FriendDetailActivity.class);
                intent.putExtra("name", friends[4].name);
                intent.putExtra("bio", friends[4].bio);
                startActivity(intent);
            }
        });

    }

}
