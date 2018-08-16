package com.android.sooz.friendsapp;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.sooz.friendsapp.models.Friend;

public class FriendActivity extends AppCompatActivity {

    Friend[] friends = {
            new Friend("Little Mac Big Tony", R.drawable.littlemac_bigtony, "Little Mac is not a video game boxer and Big Tony is not a mobster. Just two boys from the District living with a guy, all thanks to @kittenxlady.", "@littlemac.bigtony"),
            new Friend("Tortilla Chulula", R.drawable.gatos_hermans, "Sister cats // Seattle, WA", "@gatos_hermanas"),
            new Friend("Stewie Simon", R.drawable.stewie_simon, "Stewie - 5 y/o cameo tabby American Shorthair, born with obstructive hypertrophic cardiomyopathy \uD83D\uDC31 Simon - 5 y/o brown tabby American Shorthair", "@stewie_and_simon"),
            new Friend("Maple Cat", R.drawable.maplecat, "Little Maplekins \uD83C\uDF41 \uD83C\uDF41 Mr. Plumpy Bear ✨ Golden British shorthair \uD83C\uDFE1 Los Angeles \uD83C\uDF82 6.21.17 \uD83D\uDC31 Sisters @plumpycats \uD83D\uDCDA We post lots of cute stories \uD83D\uDE4F\uD83C\uDFFB Please credit all reposts facebook.com/themaplecat", "@maple.cat"),
            new Friend("Stevie Nicks", R.drawable.stevie_devonrex, "Stevie Nicks The Devon Rex \uD83D\uDCCDSeattle \uD83C\uDF1C 4.6.18 \uD83D\uDC08 Devon Rex ♀️ \uD83E\uDD26\uD83C\uDFFC\u200D♀️ @sharellkatelynn", "@steviethedevonrex")
    };

    //variables for content on each app page/view
    private ImageView picture;
    private TextView name;
    private TextView bio;
    private TextView instaHandle;

    private Button mfriendButton1;
    private Button mfriendButton2;
    private Button mfriendButton3;
    private Button mfriendButton4;
    private Button mfriendButton5;

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

        mfriendButton1 = findViewById(R.id.friendButton1);
        mfriendButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FriendActivity.this, FriendDetailActivity.class);

                intent.putExtra(friends[0].drawableID);
                intent.putExtra(friends[0].instaHandle);
                intent.putExtra (friends[0].name);
                intent.putExtra(friends[0].bio);

                startActivity(intent);
            }
        });
    }
}

//
//    //creates list of fir
//    public void showFriends(){
//        int currentIndex = 0;
//
//        Friend friend = friends[currentIndex];
//        name.setText(friend.name);
//        bio.setText(friend.bio);
//        instaHandle.setText(friend.instaHandle);
//
//        Drawable pic = getResources().getDrawable(friend.drawableID);
//        picture.setImageDrawable(pic);
//    }


