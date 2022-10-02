package net.smallacademy.authenticatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class mock2 extends AppCompatActivity {
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mock2);
        button = findViewById(R.id.button5);
        textView=findViewById(R.id.subject);
        String url2 = getIntent().getStringExtra("subject");
        textView.setText(url2);


    }
    public void openactivity1(View view) {
        String url1 = getIntent().getStringExtra("pdf_url1");
        Intent intent = new Intent(this, mocksplash.class);
        intent.putExtra("pdf_url11",url1);
        startActivity(intent);
    }

}