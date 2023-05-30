package com.example.utsakbif_10120056.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.Unbinder;

//30 Mei 2023, 10120056, Chika Rizki Nuraulia, IF2
public abstract class BaseActivity  extends AppCompatActivity {
    protected Unbinder mUnBinder;
    protected abstract int getLayoutView();
    protected abstract void initComponents(Bundle savedInstanceState);

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutView());
        mUnBinder = ButterKnife.bind(this);
        initComponents(savedInstanceState);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mUnBinder.unbind();
    }
}
