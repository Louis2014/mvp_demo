package com.august.mvp.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by chengxi on 17/5/1.
 */

public abstract class BaseActivity<V,T extends BasePresenter<V>> extends AppCompatActivity {


    protected abstract int setLayoutId();

    protected abstract T createPresenter();

    public T presenter;

    protected  abstract void start();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(setLayoutId());
        presenter = createPresenter();
        presenter.attachView((V)this);
        start();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.detachView();
    }
}
