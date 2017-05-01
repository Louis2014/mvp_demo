package com.august.mvp.base;

import java.lang.ref.WeakReference;

/**
 * Created by chengxi on 17/5/1.
 */

public class BasePresenter<T> {

    private WeakReference<T> mWeakReference;

    protected WeakReference<T> mTWeakReference;

    public void attachView(T view){
        mTWeakReference=new WeakReference<T>(view);
    }

    public void detachView(){
        if(mTWeakReference!=null){
            mTWeakReference.clear();
        }
    }

    protected T getView(){
        return mTWeakReference.get();
    }

}
