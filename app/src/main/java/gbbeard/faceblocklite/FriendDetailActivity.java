package gbbeard.faceblocklite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.TextView;

import gbbeard.faceblocklite.models.Friend;

public class FriendDetailActivity extends AppCompatActivity {
    public static final String FRIEND_NAME = "Friend-Name";
    public static final String FRIEND_DESC = "Friend-Desc";
    public TextView name;
    public TextView desc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.friend_detail_activity);
        name = findViewById(R.id.name);
        desc = findViewById(R.id.description);
        showFriend();
    }



    public void showFriend() {
        name.setText(FRIEND_NAME);
        desc.setText(FRIEND_DESC);
    }
}
