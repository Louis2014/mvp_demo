package com.august.mvp.view.activities;

import android.widget.ListView;

import com.august.mvp.R;
import com.august.mvp.adapter.GirlAdapter;
import com.august.mvp.base.BaseActivity;
import com.august.mvp.bean.GirlBean;
import com.august.mvp.contract.GirlContract;
import com.august.mvp.presenter.GirlPresenter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity<GirlContract.View, GirlPresenter> implements GirlContract.View {


    private ListView mListView;
    private List<GirlBean> mList=new ArrayList<>();
    private GirlAdapter girlAdapter;

    @Override
    protected int setLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected GirlPresenter createPresenter() {
        return new GirlPresenter();
    }

    @Override
    protected void start() {
        presenter.fetch();
        mListView = (ListView) findViewById(R.id.girl_list);
        girlAdapter = new GirlAdapter(this, mList, R.layout.item_girl);
        mListView.setAdapter(girlAdapter);
        presenter.loadGirlData();
    }


    @Override
    public void showGirlList(List<GirlBean> list) {
        mList.addAll(list);
        girlAdapter.notifyDataSetChanged();
    }


}
