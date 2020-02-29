package com.sundar.connect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.net.URL;

public class HindiDashboardActivity extends AppCompatActivity {

    ImageButton btn1,btn2,btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hindidashboard);

        btn1 = (ImageButton) findViewById(R.id.btn1);
        btn2 = (ImageButton) findViewById(R.id.btn2);
        btn3 = (ImageButton) findViewById(R.id.btn3);

      btn1.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent webviewIntent = new Intent(HindiDashboardActivity.this,LoadActivity.class);
              webviewIntent.putExtra("URL","https://www.jagran.com/");
              startActivity(webviewIntent);
          }
      });


      btn2.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {

              Intent webviewIntent = new Intent(HindiDashboardActivity.this,LoadActivity.class);
              webviewIntent.putExtra("URL","https://www.abplive.com/");
              startActivity(webviewIntent);
          }
      });

      btn3.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {

              Intent webviewIntent = new Intent(HindiDashboardActivity.this,LoadActivity.class);
              webviewIntent.putExtra("URL","https://www.livehindustan.com/");
              startActivity(webviewIntent);
          }
      });
    }
}
