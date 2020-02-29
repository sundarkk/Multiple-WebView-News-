package com.sundar.connect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CategoryActivity extends AppCompatActivity {

    Button BtnHindi, BtnEng;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        BtnEng = (Button) findViewById(R.id.BtnEng);
        BtnHindi = (Button) findViewById(R.id.BtnHindi);

        BtnHindi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoryActivity.this, HindiDashboardActivity.class);
                startActivity(intent);
            }
        });

        BtnEng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent2 = new Intent(CategoryActivity.this, EnglishActivity.class);
                startActivity(intent2);

            }
        });

    }
}
