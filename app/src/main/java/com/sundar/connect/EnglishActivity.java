package com.sundar.connect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.net.URL;

public class EnglishActivity extends AppCompatActivity {

    ImageButton btn4,btn5,btn6;

   // String[] urls = new String[2];


/*
    https://www.indiatvnews.com/
    https://www.hindustantimes.com/
    https://www.indiatoday.in/*/



    /*URL4 = "https://www.indiatvnews.com/";
    URL5 = "https://www.hindustantimes.com/";
    URL6 = "https://www.indiatoday.in/";


*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english);

        btn4 = (ImageButton) findViewById(R.id.btn4);
        btn5 = (ImageButton) findViewById(R.id.btn5);
        btn6 = (ImageButton) findViewById(R.id.btn6);

/*

        urls[0]="https://www.indiatvnews.com/";
        urls[1]="https://www.hindustantimes.com/";
        urls[2]="https://www.indiatoday.in/";
*/



        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent webviewIntent = new Intent(EnglishActivity.this,LoadActivity.class);
                webviewIntent.putExtra("URL","https://www.hindustantimes.com/");
                startActivity(webviewIntent);




/*
                Intent webviewIntent = new Intent(EnglishActivity.this,LoadActivity.class);
                webviewIntent.putExtra("link", urls[0]);
                startActivity(webviewIntent);*/

            }
        });


        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent webviewIntent = new Intent(EnglishActivity.this,LoadActivity.class);
                webviewIntent.putExtra("URL","https://www.indiatvnews.com/");
                startActivity(webviewIntent);

            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent webviewIntent = new Intent(EnglishActivity.this,LoadActivity.class);
                webviewIntent.putExtra("URL","https://www.indiatoday.in/");
                startActivity(webviewIntent);

            }
        });



    }
}
