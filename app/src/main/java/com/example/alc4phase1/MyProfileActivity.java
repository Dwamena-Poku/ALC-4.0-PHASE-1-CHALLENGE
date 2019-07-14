package com.example.alc4phase1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MyProfileActivity extends AppCompatActivity {

    //declaration
    ImageView myPhoto;
    TextView name;
    TextView track;
    TextView country;
    TextView email;
    TextView phoneNumber;
    TextView slackName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);

        //initialization
        myPhoto = (ImageView) findViewById(R.id.imageView_my_photo);
        name = (TextView) findViewById(R.id.textView_name);
        track = (TextView) findViewById(R.id.textView_track);
        country = (TextView) findViewById(R.id.textView_country);
        email = (TextView) findViewById(R.id.textView_email);
        phoneNumber = (TextView) findViewById(R.id.textView_phone_number);
        slackName = (TextView) findViewById(R.id.textView_slack_userName);

    }
}
