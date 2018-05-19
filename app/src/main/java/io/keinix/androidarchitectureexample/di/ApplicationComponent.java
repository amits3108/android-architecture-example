package io.keinix.androidarchitectureexample.di;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component (modules = {
        ApplicationModule.class
})
public interface ApplicationComponent {
}
