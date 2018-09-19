package com.example.panos.friendlist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.example.panos.friendlist.Class.FriendDB;

public class ListActivity extends AppCompatActivity {
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final Intent intent = new Intent(this, com.example.panos.friendlist.DetailActivity.class);
        final FriendDB frienddb = new FriendDB();
        setContentView(R.layout.activity_list);
        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                intent.putExtra("name",frienddb.Friends[0].name);
                intent.putExtra("bio",frienddb.Friends[0].bio);
                startActivity(intent);
            }
        });
        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                intent.putExtra("name",frienddb.Friends[1].name);
                intent.putExtra("bio",frienddb.Friends[1].bio);
                startActivity(intent);
            }
        });
        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                intent.putExtra("name",frienddb.Friends[2].name);
                intent.putExtra("bio",frienddb.Friends[2].bio);
                startActivity(intent);
            }
        });
        button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                intent.putExtra("name",frienddb.Friends[3].name);
                intent.putExtra("bio",frienddb.Friends[3].bio);
                startActivity(intent);
            }
        });
        button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                intent.putExtra("name",frienddb.Friends[4].name);
                intent.putExtra("bio",frienddb.Friends[4].bio);
                startActivity(intent);
            }
        });
    }

}
