package com.vscholars.stack2code.aicte_phaseone;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.Toast;

public class Announcements extends AppCompatActivity{

    ListView mainList;
    SharedPreferences sharedPreferences;
    @Override
    public void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.announcements);
        mainList=(ListView)findViewById(R.id.announcements_listview);
        getSupportActionBar().setTitle("AICTE Announcements");
        getSupportActionBar().setIcon(R.drawable.icon_notification);
        sharedPreferences=getSharedPreferences("cache", Context.MODE_PRIVATE);
        String notification=sharedPreferences.getString("notification","null");
        if(notification.equals("null")) {
            Toast.makeText(Announcements.this, "null", Toast.LENGTH_LONG).show();
        }

    }

}