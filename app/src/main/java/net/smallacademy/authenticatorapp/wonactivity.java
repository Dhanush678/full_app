package net.smallacademy.authenticatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.mikhaellopez.circularprogressbar.CircularProgressBar;

public class wonactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wonactivity);

        CircularProgressBar circularProgressBar;
        TextView result_text,ic_exit;
        LinearLayout btn_share;
        int Correct,Wrong;

            circularProgressBar = findViewById(R.id.circularProgressBar);
            result_text = findViewById(R.id.result_text);
            btn_share = findViewById(R.id.btn_share);
            ic_exit=findViewById(R.id.ic_exit);

            Correct=getIntent().getIntExtra("Correct",0);
            Wrong=getIntent().getIntExtra("Wrong",0);

            circularProgressBar.setProgress(Correct);
            result_text.setText((Correct+"/5"));

            ic_exit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(wonactivity.this,MainActivity2.class);
                    startActivity(intent);
                }
            });

            btn_share.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        Intent shareIntent = new Intent(Intent.ACTION_SEND);
                        shareIntent.setType("text/plain");
                        shareIntent.putExtra(Intent.EXTRA_SUBJECT, "My Application Name");
                        String shareMessage = "\nlet me recommend you this application\n\n";
                        shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);
                        startActivity(Intent.createChooser(shareIntent, "choose one"));
                    }catch(Exception e) {
                        //e.toString();
                    }

                }
            });
    }
}