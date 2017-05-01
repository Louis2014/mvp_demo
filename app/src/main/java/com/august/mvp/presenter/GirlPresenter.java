package com.august.mvp.presenter;

import com.august.mvp.base.BasePresenter;
import com.august.mvp.bean.GirlBean;
import com.august.mvp.contract.GirlContract;
import com.august.mvp.model.GirlModel;

import java.util.List;

/**
 * Created by chengxi on 17/5/1.
 */

public class GirlPresenter extends BasePresenter<GirlContract.View> implements GirlContract.Presenter{


    private  GirlModel girlModel;
    private List<GirlBean> list;
    @Override
    public void fetch() {
        girlModel=new GirlModel();
    }


    @Override
    public void loadGirlData() {
        list=girlModel.getData();
        getView().showGirlList(list);
    }
}
