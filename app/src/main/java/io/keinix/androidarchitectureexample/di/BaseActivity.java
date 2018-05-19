package io.keinix.androidarchitectureexample.di;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import java.util.UUID;

public class BaseActivity extends AppCompatActivity {

    private String mInstanceId;

    public static final String BUNDLE_KEY_INSTANCE_ID = "BUNDLE_KEY_INSTANCE_ID";

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        if (savedInstanceState != null) {
            mInstanceId = savedInstanceState.getString(BUNDLE_KEY_INSTANCE_ID);
        } else {
            mInstanceId = UUID.randomUUID().toString();
        }
        Injector.inject(this);
        super.onCreate(savedInstanceState, persistentState);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(BUNDLE_KEY_INSTANCE_ID, mInstanceId);
    }

    public String getInstanceId() {
        return mInstanceId;
    }
}
