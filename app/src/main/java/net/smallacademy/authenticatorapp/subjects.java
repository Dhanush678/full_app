package net.smallacademy.authenticatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import net.smallacademy.authenticatorapp.utility.NetworkChangeList;

public class subjects extends AppCompatActivity {
    NetworkChangeList networkChangeList = new NetworkChangeList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subjects);
        ImageView back3=findViewById(R.id.back5);
        back3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();

            }
        });

        //Mathematics
        Button button22 = findViewById(R.id.button22);
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url1 = getIntent().getStringExtra("pdf_url1");
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("pdf_url",url1);
                startActivity(intent);
            }
        });

        //PHYSICS
        Button button23 = findViewById(R.id.button23);
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url2 = getIntent().getStringExtra("pdf_url2");
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("pdf_url",url2);
                startActivity(intent);
            }
        });

        //CHEMMISTRY
        Button button24 = findViewById(R.id.button24);
        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url3 = getIntent().getStringExtra("pdf_url3");
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("pdf_url",url3);
                startActivity(intent);
            }
        });

        //BIOLOGY
        Button button25 = findViewById(R.id.button25);
        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url4 = getIntent().getStringExtra("pdf_url4");
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("pdf_url",url4);
                startActivity(intent);
            }
        });

        //KEY ANSWERS
        Button button26 = findViewById(R.id.button26);
        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url5 = getIntent().getStringExtra("pdf_url5");
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("pdf_url",url5);
                startActivity(intent);
            }
        });
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
