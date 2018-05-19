package io.keinix.androidarchitectureexample.di;

import android.app.Activity;

import java.util.Map;

import javax.inject.Inject;
import javax.inject.Provider;

import dagger.android.AndroidInjector;

public class ActivityInjector {

    private Map<Class<? extends Activity>, Provider<AndroidInjector<? extends Activity>>> mActivityInjector;

    @Inject
    ActivityInjector(Map<Class<? extends Activity>, Provider<AndroidInjector<? extends Activity>>> activityInjector) {

        mActivityInjector = activityInjector;
    }
}
