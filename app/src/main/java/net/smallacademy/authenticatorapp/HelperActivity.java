package net.smallacademy.authenticatorapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
public class HelperActivity extends Activity {
    String prevStarted = "no";
    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences sharedpreferences = getSharedPreferences(getString(R.string.app_name), Context.MODE_PRIVATE);
        if (sharedpreferences.getBoolean(prevStarted, false)) {
            SharedPreferences.Editor editor = sharedpreferences.edit();
            editor.putBoolean(prevStarted, Boolean.FALSE);
            editor.apply();
            Intent intent = new Intent(this,introActivity.class);

            startActivity(intent);
            overridePendingTransition(R.anim.slide_up, R.anim.slide_down);


        } else {
            moveToSecondary();
        }
    }

 protected void onCreate(Bundle savedInstanceState) {
     super.onCreate(savedInstanceState);


 } public void moveToSecondary(){
        // use an intent to travel from one activity to another.
        Intent intent = new Intent(this,Register.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
    }

}