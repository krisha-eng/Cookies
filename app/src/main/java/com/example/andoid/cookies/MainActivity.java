package com.example.android.cookies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void eatCookie(View view) {
        // TODO: Find a reference to the ImageView in the layout. Change the image.

        changeTextView();
        changeImageView();
    }

    private void changeTextView()
    {
        TextView t1=(TextView) findViewById(R.id.status_text_view);
        t1.setText("I'm full");
    }

    private void changeImageView()
    {
        ImageView i1= (ImageView) findViewById(R.id.android_cookie_image_view);
        i1.setImageResource(R.drawable.after_cookie);
    }
}
