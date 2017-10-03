package com.bignerdranch.android.photo;

import android.content.pm.PackageManager;
import android.media.Image;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.*;


public class MainActivity extends AppCompatActivity {
    private ImageButton mPhotoButton;
    private ImageView mPhotoview;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState);
        mPhotoButton = (ImageButton)findViewById(R.id.my_camera);
        mPhotoview = (Image)findViewById(R.id.my_photo);

        return v;
    }

    ;




}
