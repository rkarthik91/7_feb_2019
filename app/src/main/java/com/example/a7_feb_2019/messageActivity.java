package com.example.a7_feb_2019;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class messageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        Intent intent=  getIntent();
        String message=intent.getStringExtra("EXTRA_MESSAGE");
        TextView view=findViewById(R.id.textView);
        view.setText(message);
    }
}
