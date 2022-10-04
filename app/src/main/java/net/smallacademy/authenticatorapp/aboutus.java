package net.smallacademy.authenticatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class aboutus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);
        ImageView tele =findViewById(R.id.teleIMAge);
        ImageView btnew =findViewById(R.id.sharenew);
        TextView btTEXT =findViewById(R.id.shareTEXT);
        ImageView back = findViewById(R.id.back14);
        TextView telenext =findViewById(R.id.teleTEXt);
        ImageView insta=findViewById(R.id.insata);
        TextView instaTEXT=findViewById(R.id.textView_a2);
        ImageView fackBK=findViewById(R.id.face);
        TextView faceBookTEXT=findViewById(R.id.faceTEXT);

        fackBK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(getOpenFacebookIntent());
            }
        });
        faceBookTEXT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(getOpenFacebookIntent());
            }
        });
        instaTEXT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://instagram.com/kcet_complete_guide?igshid=YmMyMTA2M2Y=");


                Intent i= new Intent(Intent.ACTION_VIEW,uri);

                i.setPackage("com.instagram.android");

                try {
                    startActivity(i);
                } catch (ActivityNotFoundException e) {

                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://instagram.com/kcet_complete_guide?igshid=YmMyMTA2M2Y=")));
                }


            }
        });

        insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://instagram.com/kcet_complete_guide?igshid=YmMyMTA2M2Y=");


                Intent i= new Intent(Intent.ACTION_VIEW,uri);

                i.setPackage("com.instagram.android");

                try {
                    startActivity(i);
                } catch (ActivityNotFoundException e) {

                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://instagram.com/kcet_complete_guide?igshid=YmMyMTA2M2Y=")));
                }


            }
        });


        telenext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getTelegramInt(aboutus.this);
            }
        });


        tele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getTelegramInt(aboutus.this);
            }
        });


        btTEXT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Intent.ACTION_SEND);
                myIntent.setType("text/plain");
                String body = "Your body here";
                String sub = "Your Subject";
                myIntent.putExtra(Intent.EXTRA_SUBJECT,sub);
                myIntent.putExtra(Intent.EXTRA_TEXT,body);
                startActivity(Intent.createChooser(myIntent, "Share Using"));
            }
        });

        btnew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Intent.ACTION_SEND);
                myIntent.setType("text/plain");
                String body = "Hey!there w";
                String sub = "Your Subject";
                myIntent.putExtra(Intent.EXTRA_SUBJECT,sub);
                myIntent.putExtra(Intent.EXTRA_TEXT,body);
                startActivity(Intent.createChooser(myIntent, "Share Using"));

            }
        });



        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fin = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(fin);

            }
        });

    }




    private void getTelegramInt(Context context) {

        Intent intent;

        try {
            try {
                context.getPackageManager().getPackageInfo("org.telegram.messenger", 0);
            } catch (PackageManager.NameNotFoundException e) {
                context.getPackageManager().getPackageInfo("org.thunderdog.challegram", 0);
            }
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tg://resolve?domain=+xAWmPUgBE7NmODg9"));
            startActivity(intent);

        } catch (PackageManager.NameNotFoundException e) {
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/+xAWmPUgBE7NmODg9"));
            startActivity(intent);
        }
    }
    public Intent getOpenFacebookIntent() {
        try {
            getPackageManager().getPackageInfo("com.facebook.katana", 0);
            return new Intent(Intent.ACTION_VIEW, Uri.parse("fb://page/100086491630238"));
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/profile.php?id=100086491630238"));
        }
    }
}