package com.example.alc4phase1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button AboutALCButton;
    Button MyProfileButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initializing views
        AboutALCButton = findViewById(R.id.button_about_alc);
        MyProfileButton = findViewById(R.id.button_my_profile);

        //Attach click listener
        AboutALCButton.setOnClickListener(this);
        MyProfileButton.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        Log.d("TAG","onClick: ");
        Intent intent = new Intent();

        switch (view.getId()){
            case R.id.button_about_alc:
                intent.setClass(this,AboutALCActivity.class);
                break;

            case R.id.button_my_profile:
                intent.setClass(this,MyProfileActivity.class);
                break;

            default:
                Toast.makeText(this,"Error", Toast.LENGTH_LONG).show();
        }

        if(intent.getClass() != null)
            startActivity(intent);
    }
}
