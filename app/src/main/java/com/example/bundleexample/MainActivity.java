package com.example.bundleexample;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText username,password;
    Button sendData;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username=findViewById(R.id.et_data1);
        password=findViewById(R.id.et_data2);
        sendData=findViewById(R.id.bt_button1);

        sendData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data1=username.getText().toString();
                String data2=password.getText().toString();

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("key1", data1);
                bundle.putString("key2", data2);
                intent.putExtras(bundle);


                startActivity(intent);
            }
        });

    }
}