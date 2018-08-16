package com.example.casey.databindexample;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
//import android.databinding.
import android.view.Menu;
import android.view.MenuItem;
import android.net.Uri;

import com.example.casey.databindexample.databinding.ActivityMainBinding;
import com.example.casey.databindexample.models.Boat;

public class MainActivity extends AppCompatActivity implements BoatFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }


    @Override
    public void onFragmentInteraction(Uri uri) {

    }

}
