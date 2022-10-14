package net.smallacademy.authenticatorapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;

import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;


public class DrawerBaseActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    DrawerLayout drawerLayout;

    @Override
    public void setContentView(View view) {

        drawerLayout=(DrawerLayout) getLayoutInflater().inflate(R.layout.activity_drawer_base, null);
        FrameLayout container =drawerLayout.findViewById(R.id.activitycontainer);
        container.addView(view);
        super.setContentView(drawerLayout);
        Toolbar toolbar =drawerLayout.findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        NavigationView navigationView=drawerLayout.findViewById(R.id.navVIEW);
        navigationView.setNavigationItemSelectedListener(this);
        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.menu_drawer_open,R.string.menu_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        drawerLayout.closeDrawer(GravityCompat.START);
        switch (item.getItemId()){
            case R.id.acc:
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);


                break;
            case R.id.editAcc:
                startActivity(new Intent(getApplicationContext(),EditProfile.class));
                                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);



                break;
            case R.id.Aboutus:
                startActivity(new Intent(getApplicationContext(),aboutus.class));
                                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);


                break;
            case R.id.logout:
                FirebaseAuth.getInstance().signOut();//logout
                startActivity(new Intent(getApplicationContext(),Login.class));

                                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);


                finish();
                break;
            case R.id.exit:
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
                break;


        }


        return false;
    }
    protected void allocateActivityTitle(String titleString){
        if(getSupportActionBar()!=null){
            getSupportActionBar().setTitle(titleString);
        }

    }
}