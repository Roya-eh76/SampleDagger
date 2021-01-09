package com.example.daggerroya.di;

import com.example.daggerroya.di.auth.AuthViewModelsModule;
import com.example.daggerroya.ui.auth.AuthActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {

    @ContributesAndroidInjector(
            modules = {AuthViewModelsModule.class})
    abstract AuthActivity authActivity();
}
