package com.example.daggerroya.di;

import com.example.daggerroya.ui.AuthActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {

    @ContributesAndroidInjector
    abstract AuthActivity authActivity();
}
