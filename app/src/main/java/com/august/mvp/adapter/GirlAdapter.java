package com.august.mvp.adapter;

import android.content.Context;

import com.august.mvp.R;
import com.august.mvp.base.CommonAdapter;
import com.august.mvp.base.ViewHolder;
import com.august.mvp.bean.GirlBean;

import java.util.List;

/**
 * Created by chengxi on 17/5/1.
 */

public class GirlAdapter extends CommonAdapter<GirlBean> {


    public GirlAdapter(Context context, List<GirlBean> mDatas, int itemLayoutId) {
        super(context, mDatas, itemLayoutId);
    }

    @Override
    public void convert(ViewHolder helper, GirlBean item) {
        helper.setImageResource(R.id.img_girl,item.getImage());
        helper.setText(R.id.girl_name,item.getName());

    }
}
