package net.smallacademy.authenticatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class mocksubjects extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mocksubjects);
        button = findViewById(R.id.button);
        button = findViewById(R.id.button2);
        button = findViewById(R.id.button3);
        button = findViewById(R.id.button4);

        ImageView back2 =findViewById(R.id.back_mock);
        back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(intent);
                finish();

            }
        });
    }
    public void openactivityA(View view) {
        Intent intent = new Intent(this, mock2.class);
        intent.putExtra("pdf_url1","phy_set1");
        intent.putExtra("subject","Physics");

        startActivity(intent);
    }

    public void openactivityB(View view) {
        Intent intent = new Intent(this, mock2.class);
        intent.putExtra("pdf_url1","chem_set1");
        intent.putExtra("subject","Chemistry");
        startActivity(intent);
    }

    public void openactivityC(View view) {
        Intent intent = new Intent(this, mock2.class);
        intent.putExtra("pdf_url1","mat_set1");
        intent.putExtra("subject","Mathematics");
        startActivity(intent);
    }

    public void openactivityD(View view) {
        Intent intent = new Intent(this, mock2.class);
        intent.putExtra("pdf_url1","bio_set1");
        intent.putExtra("subject","Biology");
        startActivity(intent);
    }
}
