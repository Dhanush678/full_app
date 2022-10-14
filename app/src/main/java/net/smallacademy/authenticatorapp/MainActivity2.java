package net.smallacademy.authenticatorapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.graphics.drawable.AnimationDrawable;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;


import net.smallacademy.authenticatorapp.databinding.ActivityMain2Binding;

import javax.annotation.Nullable;

public class MainActivity2 extends DrawerBaseActivity {
    BottomNavigationView nav;

    ActivityMain2Binding activityMain2Binding;



    private long pressedTime;
    FirebaseAuth fAuth;
    FirebaseFirestore fStore;
    StorageReference storageReference;
    String userId,name;
    FirebaseUser user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // remove title
        super.onCreate(savedInstanceState);
        activityMain2Binding =ActivityMain2Binding.inflate( getLayoutInflater());
        setContentView(activityMain2Binding.getRoot());
        allocateActivityTitle("MainActivity2");
        ConstraintLayout constraintLayout=findViewById(R.id.layoutMAIN);
        AnimationDrawable animationDrawable=(AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(35000000);
        animationDrawable.setExitFadeDuration(55000000);
        animationDrawable.start();
        ActionBar actionBar;
        actionBar = getSupportActionBar();

        // Define ColorDrawable object and parse color
        // using parseColor method
        // with color hash code as its parameter
        ColorDrawable colorDrawable
                = new ColorDrawable(Color.parseColor("#00ff0000"));

        // Set BackgroundDrawable
        actionBar.setBackgroundDrawable(colorDrawable);


        nav=findViewById(R.id.nav);
        nav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext(),MainActivity2.class));
                        finish();
                        break;
                    case R.id.person:
                        startActivity(new Intent(getApplicationContext(),MainActivity.class));
                        finish();
                        break;
                    case R.id.about:
                        startActivity(new Intent(getApplicationContext(),aboutus.class));
                        finish();
                        break;


                }





                return true;
            }
        });


        final TextView textView=findViewById(R.id.welcome);
        fAuth = FirebaseAuth.getInstance();
        fStore = FirebaseFirestore.getInstance();
        storageReference = FirebaseStorage.getInstance().getReference();
        userId = fAuth.getCurrentUser().getUid();
        user = fAuth.getCurrentUser();


        DocumentReference documentReference = fStore.collection("users").document(userId);
        documentReference.addSnapshotListener(this, new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot documentSnapshot, @Nullable FirebaseFirestoreException e) {
                if(documentSnapshot.exists()){
                    textView.setText(documentSnapshot.getString("fName"));

                }else {
                    Log.d("tag", "onEvent: Document do not exists");
                }
            }
        });

        ImageView colle = findViewById(R.id.person);
        colle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent12 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent12);
                                                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);


            }
        });

        TextView prevqp = findViewById(R.id.previous);
        prevqp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(), prev.class);
                startActivity(intent1);
                                                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);



                finish();
            }
        });


        Button rankbtn = findViewById(R.id.rank);
        rankbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Rank_Predict.class);
                startActivity(intent);
                                                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);




            }
        });

        Button colleBTN = findViewById(R.id.college);
        colleBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(), Instructions.class);

                startActivity(intent1);
                                                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);


                finish();
            }
        });

        Button colleBTN1 = findViewById(R.id.videos);
        colleBTN1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(), subjects1.class);

                startActivity(intent1);
                                                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);


                finish();
            }
        });

        Button button = findViewById(R.id.collegeBTN);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), collegeList.class);

                startActivity(intent);
                                                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);


            }
        });
        Button buttondoc = findViewById(R.id.d);
        buttondoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), aboutkcet2.class);
                startActivity(intent);
                                                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);



            }
        });

        Button buttonmock = findViewById(R.id.mocktest);
        buttonmock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), mocksubjects.class);

                startActivity(intent);
                                                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);


            }
        });



    }


    @Override
    public void onBackPressed() {

        if (pressedTime + 2000 > System.currentTimeMillis()) {
            super.onBackPressed();
            finishAffinity();
            System.exit(0);
            finish();
        } else {
            Toast.makeText(getBaseContext(), "Press back again to exit", Toast.LENGTH_SHORT).show();
        }
        pressedTime = System.currentTimeMillis();
    }


}

