package veed.sm.taxiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;

public class ChooseModActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_mod);

    }

    public void goToPassengerSignIn(View view) {
        startActivity(new Intent(ChooseModActivity.this, PassengerSignInActivity.class));
    }

    public void goToDriverSignIn(View view) {
        startActivity(new Intent(ChooseModActivity.this,DriverSignInActivity.class));
    }
}