package com.example.daggerroya.ui.auth;

import androidx.lifecycle.ViewModel;

import com.example.daggerroya.di.auth.AuthModule;

import javax.inject.Inject;

public class AuthViewModel extends ViewModel {
    private final AuthModule authModule;

    @Inject
    public AuthViewModel(AuthModule authModule){
        this.authModule=authModule;
    }
}
