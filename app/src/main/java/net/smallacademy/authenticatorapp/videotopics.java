package net.smallacademy.authenticatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class videotopics extends AppCompatActivity {
    TextView textView;
    TextView button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12,button13,button14,button15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videotopics);
        textView=findViewById(R.id.heading);
        button1=findViewById(R.id.button_t1);
        button2=findViewById(R.id.button_t2);
        button3=findViewById(R.id.button_t3);
        button4=findViewById(R.id.button_t4);
        button5=findViewById(R.id.button_t5);
        button6=findViewById(R.id.button_t6);
        button7=findViewById(R.id.button_t7);
        button8=findViewById(R.id.button_t8);
        button9=findViewById(R.id.button_t9);
        button10=findViewById(R.id.button_t10);
        button11=findViewById(R.id.button_t11);
        button12=findViewById(R.id.button_t12);
        button13=findViewById(R.id.button_t13);
        button14=findViewById(R.id.button_t14);
        button15=findViewById(R.id.button_t15);




        String h1 = getIntent().getStringExtra("heading1");
        textView.setText(h1);
        String t1 = getIntent().getStringExtra("topic1");
        button1.setText(t1);
        String t2 = getIntent().getStringExtra("topic2");
        button2.setText(t2);
        String t3 = getIntent().getStringExtra("topic3");
        button3.setText(t3);
        String t4 = getIntent().getStringExtra("topic4");
        button4.setText(t4);
        String t5 = getIntent().getStringExtra("topic5");
        button5.setText(t5);
        String t6 = getIntent().getStringExtra("topic6");
        button6.setText(t6);
        String t7 = getIntent().getStringExtra("topic7");
        button7.setText(t7);
        String t8 = getIntent().getStringExtra("topic8");
        button8.setText(t8);
        String t9 = getIntent().getStringExtra("topic9");
        button9.setText(t9);
        String t10 = getIntent().getStringExtra("topic10");
        button10.setText(t10);
        String t11 = getIntent().getStringExtra("topic11");
        button11.setText(t11);
        String t12 = getIntent().getStringExtra("topic12");
        button12.setText(t12);
        String t13 = getIntent().getStringExtra("topic13");
        button13.setText(t13);
        String t14 = getIntent().getStringExtra("topic14");
        button14.setText(t14);
        String t15 = getIntent().getStringExtra("topic15");
        button15.setText(t15);

    }
    public void video1(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("video_id","https://www.careers360.com/colleges/university-visvesvaraya-college-of-engineering-bangalore/amp");
        startActivity(intent);
    }

}