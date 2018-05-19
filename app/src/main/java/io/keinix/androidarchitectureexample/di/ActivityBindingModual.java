package io.keinix.androidarchitectureexample.di;

import android.app.Activity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import io.keinix.androidarchitectureexample.home.MainActivity;
import io.keinix.androidarchitectureexample.home.MainActivityComponent;

@Module (subcomponents = {
        MainActivityComponent.class
})
public abstract class ActivityBindingModual {

    @Binds @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> provideMainActivityInjector(MainActivityComponent.Builder builder);
}
