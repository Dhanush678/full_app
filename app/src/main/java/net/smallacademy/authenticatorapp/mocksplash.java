package net.smallacademy.authenticatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.os.Handler;

import net.smallacademy.authenticatorapp.utility.NetworkChangeList;

public class mocksplash extends AppCompatActivity {
    NetworkChangeList networkChangeList = new NetworkChangeList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mocksplash);

        new Handler().postDelayed(new Runnable() {
        @Override
        public void run() {
         String url11 = getIntent().getStringExtra("pdf_url11");
         Intent intent = new Intent(mocksplash.this, mockquestions.class);
         intent.putExtra("pdf_url111", url11);
         startActivity(intent);
         }
         }, 1500);
    }
    @Override
    protected void onStart() {
        IntentFilter filter =new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION);
        registerReceiver(networkChangeList,filter);

        super.onStart();
    }

    @Override
    protected void onStop() {
        unregisterReceiver(networkChangeList);
        super.onStop();
    }
}