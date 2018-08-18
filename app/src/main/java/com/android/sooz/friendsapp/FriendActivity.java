package com.android.sooz.friendsapp;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.sooz.friendsapp.models.Friend;

public class FriendActivity extends AppCompatActivity {

    Friend[] friends = {
            new Friend("Little Mac Big Tony", "Little Mac is not a video game boxer and Big Tony is not a mobster. Just two boys from the District living with a guy, all thanks to @kittenxlady.", " Find us at @littlemac.bigtony"),
            new Friend("Tortilla Chulula", "Sister cats // Seattle, WA", " Find us @gatos_hermanas"),
            new Friend("Stewie Simon","Stewie - 5 y/o cameo tabby American Shorthair, born with obstructive hypertrophic cardiomyopathy \uD83D\uDC31 Simon - 5 y/o brown tabby American Shorthair", "Find us @stewie_and_simon"),
            new Friend("Maple Cat",  "Little Maplekins \uD83C\uDF41 \uD83C\uDF41 Mr. Plumpy Bear ✨ Golden British shorthair \uD83C\uDFE1 Los Angeles \uD83C\uDF82 6.21.17 \uD83D\uDC31 Sisters @plumpycats \uD83D\uDCDA We post lots of cute stories \uD83D\uDE4F\uD83C\uDFFB Please credit all reposts facebook.com/themaplecat", "Find me @maple.cat"),
            new Friend("Stevie Nicks", "Stevie Nicks The Devon Rex \uD83D\uDCCDSeattle \uD83C\uDF1C 4.6.18 \uD83D\uDC08 Devon Rex ♀️ \uD83E\uDD26\uD83C\uDFFC\u200D♀️ @sharellkatelynn", "Find me @steviethedevonrex")
    };

    //variables for content on each app page/view

    private TextView name;
    private TextView bio;
    private TextView instaHandle;

    //seems to be breaking application so shelving concept for now
    private ImageView picture;

    private Button mfriendChoice;

    private Button backToMain;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friend);

        backToMain = findViewById(R.id.backToMain);
        backToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FriendActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        //friend 1

        Friend friend1 = friends[0];

        //use to test routing by looking for this in log cat when button is clicked
        //keeping in for testing
        //Log.d("friend1","Hi my name is "+ friend1.name +".");

        mfriendChoice = findViewById(R.id.friendButton1);

        mfriendChoice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FriendActivity.this, FriendDetailActivity.class);

                intent.putExtra("name", friends[0].name);
                intent.putExtra("bio", friends[0].bio);
                intent.putExtra("instaHandle", friends[0].instaHandle);

                startActivity(intent);
            }
        });

        //friend 2

        Friend friend2 = friends[1];

        //use to test routing by looking for this in log cat when button is clicked
        //keeping in for testing
        //Log.d("friend2","Hi my name is "+ friend2.name +".");

        mfriendChoice = findViewById(R.id.friendButton2);

        mfriendChoice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FriendActivity.this, FriendDetailActivity.class);

                intent.putExtra("name", friends[1].name);
                intent.putExtra("bio", friends[1].bio);
                intent.putExtra("instaHandle", friends[1].instaHandle);

                startActivity(intent);
            }
        });
    }
}



