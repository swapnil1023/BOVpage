package com.example.bovpage;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView tarrif;
    ImageView call1;
    ImageView call2;
    ImageView call3;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        call1 = findViewById(R.id.call1);
        call2 = findViewById(R.id.call2);
        call3 = findViewById(R.id.call3);
        tarrif = findViewById(R.id.tarrifImageView);
        tarrif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
               /* Intent intent = new Intent(Intent.ACTION_OPEN_DOCUMENT);
                Uri uri = Uri.parse("@drawable/bov_tarrif");
                intent.addCategory(Intent.CATEGORY_OPENABLE);
                intent.setType("image/*");
                intent.setData(uri);
                startActivity(intent);*/
                Intent intent = new Intent(Intent.ACTION_VIEW);
                Uri uri = Uri.parse("http://www.iitbbs.ac.in/transportation-fle/transport_1562285200.pdf");
                intent.setData(uri);
                startActivity(intent);
            }
        });

        call1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                makeCall("9022043998");
            }
        });
        call2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                makeCall("9611526651");
            }
        });
        call3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                makeCall("9853340919");
            }
        });
    }

    private void makeCall(String num){

        String phone = "tel:" + num;
        Intent i = new Intent(Intent.ACTION_DIAL);
        i.setData(Uri.parse(phone));
        startActivity(i);
    }
}
