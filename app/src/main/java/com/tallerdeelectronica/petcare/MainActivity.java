package com.tallerdeelectronica.petcare;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.DialogFragment;
import androidx.preference.PreferenceManager;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        TextView mWelcomeTextView = findViewById(R.id.welcome_text_view);

        //mConstraintLayout.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
        mWelcomeTextView.setTextColor(getResources().getColor(R.color.white));
    }

    public void petBegin(View v){
        //Intent intent = new Intent(this, PetActivity.class);
        //startActivity(intent);

        DialogFragment newFragment = new ListDialog();
        newFragment.show(getSupportFragmentManager(), "missiles");

    }
}