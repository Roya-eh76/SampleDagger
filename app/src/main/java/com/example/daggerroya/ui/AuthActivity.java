package com.example.daggerroya.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import com.bumptech.glide.RequestManager;
import com.example.daggerroya.R;
import com.example.daggerroya.databinding.ActivityAuthBinding;
import com.example.daggerroya.di.DaggerAppComponent;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;

public class AuthActivity extends DaggerAppCompatActivity {
    private ActivityAuthBinding binding;

    @Inject
     Drawable logo;

    @Inject
     RequestManager requestManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_auth);

        setLogo();
    }

    private void setLogo() {
        requestManager
                .load(logo)
                .into(binding.loginLogo);
    }
}