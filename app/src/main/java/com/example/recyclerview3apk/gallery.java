package com.example.recyclerview3apk;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class gallery  extends AppCompatActivity {

    ImageView imageView;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gallery);

        imageView=findViewById(R.id.founder_iv);
        textView=findViewById(R.id.founder_tv);

//        String imageview = getIntent().getStringExtra("image_name");
//        String  textview = getIntent().getStringExtra("text_name");

//        imageView.setImageResource(R.drawable.facebook);
//        textView.setText("FACEBOOK");
//        imageView.setImageResource(R.drawable.instagram);
//        textView.setText("Instagram");
//        imageView.setImageResource(R.drawable.linkedin);
//        textView.setText("Linkedin");

        imageView.setImageResource(getIntent().getIntExtra("image_name",0));
        textView.setText(getIntent().getStringExtra("text_name"));
    }
}
