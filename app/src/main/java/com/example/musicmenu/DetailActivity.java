package com.example.musicmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        try {
            // This gets the particular Detailed object we are displaying
            // In this case, it is a Food object.
            Music myMusic = intent.getParcelableExtra(CategoryActivity.DETAIL_CHOICE);

            // This page will display the specific Detailed data for what your app is showing.
            // Get references to the xml views for name, price, desc, and photo

            // Finish this code to match your xml file.  These names are what I used.
            TextView title = findViewById(R.id.title);
            TextView artist = findViewById(R.id.artist);
            TextView desc = findViewById(R.id.descTextView);
            ImageView photo = findViewById(R.id.photoImageView);

            // set values on the screen based on the object that was passed to this Detail activity
            title.setText(myMusic.getName());
            artist.setText("$"+myMusic.getPrice());
            desc.setText(myFood.getDesc());

            if (myMusic.getImageResourceID() == 0) {
                // set a default pic or decide what to do in this case.
            }
            else {
                photo.setImageResource(myMusic.getImageResourceID());
            }
        }
        catch (Exception e) {
            Log.i("Aidan", "Music app not working!");
        }
    }

}