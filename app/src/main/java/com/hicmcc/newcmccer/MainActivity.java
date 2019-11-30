package com.hicmcc.newcmccer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//test
        Button diaryButton = (Button)findViewById(R.id.DiaryButton);
        diaryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toDiary = new Intent(MainActivity.this,  DiaryActivity.class);
                startActivity(toDiary);
            }
        });
    }

}
