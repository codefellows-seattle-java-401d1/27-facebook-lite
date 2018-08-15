package com.android.sooz.friendsapp;

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
            new Friend("Little Mac & Big Tony", R.drawable.littlemac_bigtony, "Little Mac is not a video game boxer and Big Tony is not a mobster. Just two boys from the District living with a guy, all thanks to @kittenxlady.", "@littlemac.bigtony"),
            new Friend( "Tortilla & Chulula", R.drawable.gatos_hermans, "Sister cats // Seattle, WA", "@gatos_hermanas"),
            new Friend("Stewie & Simon", R.drawable.stewie_simon, "Stewie - 5 y/o cameo tabby American Shorthair, born with obstructive hypertrophic cardiomyopathy \uD83D\uDC31 Simon - 5 y/o brown tabby American Shorthair \uD83D\uDC31", "@stewie_and_simon"),
            new Friend("Maple Cat", R.drawable.maplecat, "Little Maplekins \uD83C\uDF41\n" +
                    "\uD83C\uDF41 Mr. Plumpy Bear\n" +
                    "✨ Golden British shorthair\n" +
                    "\uD83C\uDFE1 Los Angeles\n" +
                    "\uD83C\uDF82 6.21.17\n" +
                    "\uD83D\uDC31 Sisters @plumpycats\n" +
                    "\uD83D\uDCDA We post lots of cute stories\n" +
                    "\uD83D\uDE4F\uD83C\uDFFB Please credit all reposts\n" +
                    "facebook.com/themaplecat", "@maple.cat"),
            new Friend("Stevie Nicks", R.drawable.stevie_devonrex, "Stevie Nicks The Devon Rex\n" +
                    "\uD83D\uDCCDSeattle \uD83C\uDF1C 4.6.18 \uD83D\uDC08 Devon Rex ♀️ \uD83E\uDD26\uD83C\uDFFC\u200D♀️ @sharellkatelynn", "@steviethedevonrex")
    };

    //variables for content on each app page/view
    private ImageView picture;
    private TextView name;
    private TextView bio;
    private TextView instaHandle;

    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friend);
//
        button = findViewById(R.id.friendButton1);

        showFriends();

    }


    //creates single project page/view within app
    public void showFriends(){
        int currentIndex = 0;

        Friend friend = friends[currentIndex];
        name.setText(friend.name);
        bio.setText(friend.bio);
        instaHandle.setText(friend.instaHandle);

        Drawable pic = getResources().getDrawable(friend.drawableID);
        picture.setImageDrawable(pic);
    }


}
