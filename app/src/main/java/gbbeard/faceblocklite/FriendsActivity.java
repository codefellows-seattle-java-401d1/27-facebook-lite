package gbbeard.faceblocklite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

import gbbeard.faceblocklite.models.Friend;

public class FriendsActivity extends AppCompatActivity {
    private Button mButton;


    Friend[] friends = {
            new Friend("Joe Peschi",
                    "Short Italian Man"),
            new Friend("Alex P Keaton",
                    "Pretty Sure this is a sitcom character"),
            new Friend("The Rock",
                    "He's a big guy"),
            new Friend("Salad Man",
                    "Man likes his salad"),
            new Friend("Sally Salad", "Loves the salad as well"),
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.friends_activity);

        mButton = findViewById(R.id.friendOne);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FriendsActivity.this, FriendDetailActivity.class);
                startActivity(intent);
            }
        });
    }

}
