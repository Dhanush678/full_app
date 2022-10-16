package net.smallacademy.authenticatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import net.smallacademy.authenticatorapp.utility.NetworkChangeList;

public class Instructions extends AppCompatActivity {
    NetworkChangeList networkChangeList = new NetworkChangeList();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructions);
        ImageView back5 =findViewById(R.id.back5);
        back5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(intent1);
                overridePendingTransition(R.anim.slide_up, R.anim.slide_down);

                finish();
            }
        });
    }

    public void pressed(View view) {
        Intent intent=new Intent(Instructions.this,predictor.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_up, R.anim.slide_down);

    }
    @Override
    public void onBackPressed() {
        Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_up, R.anim.slide_down);

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