package com.example.a7_feb_2019;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendmessage(View view)
    {
        EditText text=findViewById(R.id.mytextText);
        String message=text.getText().toString();


        Intent intent=new Intent(this,messageActivity.class);
        intent.putExtra("EXTRA_MESSAGE",message);
        startActivity(intent);

    }
}
