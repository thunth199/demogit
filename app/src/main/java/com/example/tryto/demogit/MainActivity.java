package com.example.tryto.demogit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView abc = (TextView) findViewById(R.id.tvhello);
        abc.setText("Tran Huu ");



    }
}
