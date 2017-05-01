package com.august.mvp.contract;

import com.august.mvp.base.BasePresenterInterface;
import com.august.mvp.base.BaseView;
import com.august.mvp.bean.GirlBean;

import java.util.List;

/**
 * Created by chengxi on 17/5/1.
 */

public interface GirlContract {

    interface View extends BaseView {
        void showGirlList(List<GirlBean> list);


    }

    interface Presenter  extends BasePresenterInterface{

        void loadGirlData();
    }
}
