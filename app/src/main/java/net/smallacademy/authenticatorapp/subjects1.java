package net.smallacademy.authenticatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import net.smallacademy.authenticatorapp.utility.NetworkChangeList;

public class subjects1 extends AppCompatActivity {

    NetworkChangeList networkChangeList = new NetworkChangeList();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subjects1);
        ImageView back12 =findViewById(R.id.back12);
        back12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(intent);
                finish();

            }
        });

    }

    public void openactivity_v1(View view){
        Intent intent = new Intent(this, puc.class);
        intent.putExtra("subject1","Mathematics");
        startActivity(intent);
    }
    public void openactivity_v2(View view){
        Intent intent = new Intent(this, puc.class);
        intent.putExtra("subject1","Physics");
        startActivity(intent);
    }
    public void openactivity_v3(View view){
        Intent intent = new Intent(this, puc.class);
        intent.putExtra("subject1","Chemistry");
        startActivity(intent);
    }
    public void openactivity_v4(View view){
        Intent intent = new Intent(this, puc.class);
        intent.putExtra("subject1","Biology");
        startActivity(intent);
    }
    @Override
    public void onBackPressed() {
        Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
        startActivity(intent);
        finish();

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