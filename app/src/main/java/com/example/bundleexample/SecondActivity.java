package com.example.bundleexample;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView user,pass;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        user = findViewById(R.id.tx_view1);
        pass=findViewById(R.id.tx_view2);

        Bundle bundle= getIntent().getExtras();
        String data1= bundle.getString("key1", "");
        String data2=bundle.getString("key2","");

        user.setText(data1);
        pass.setText(data2);

    }
}