package com.august.mvp.model;

import com.august.mvp.R;
import com.august.mvp.bean.GirlBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chengxi on 17/5/1.
 */

public class GirlModel {

    public List getData(){
        List<GirlBean> data=new ArrayList();
            data.add(new GirlBean(R.mipmap.girl_one,"美女1"));
            data.add(new GirlBean(R.mipmap.girl_two,"美女2"));
            data.add(new GirlBean(R.mipmap.girl_three,"美女3"));
            data.add(new GirlBean(R.mipmap.girl_four,"美女4"));
        return data;
    }
}
