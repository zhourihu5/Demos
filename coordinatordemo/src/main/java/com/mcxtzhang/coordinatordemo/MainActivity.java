package com.mcxtzhang.coordinatordemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.mcxtzhang.zxtcommonlib.recyclerview.CommonAdapter;
import com.mcxtzhang.zxtcommonlib.recyclerview.ViewHolder;

import java.util.ArrayList;
import java.util.List;

import static com.mcxtzhang.coordinatordemo.R.id.rv;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRv = (RecyclerView) findViewById(rv);
        mRv.setLayoutManager(new LinearLayoutManager(this));

        mRv.setAdapter(new CommonAdapter<TestBean>(this, R.layout.item_rv, initDatas()) {
            @Override
            public void convert(ViewHolder holder, TestBean testBean) {
                holder.setText(R.id.tv, testBean.getName());
            }
        });
    }


    public List initDatas() {
        List datas = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            datas.add(new TestBean("http://imgs.ebrun.com/resources/2016_03/2016_03_25/201603259771458878793312_origin.jpg", "张"));
            datas.add(new TestBean("http://p14.go007.com/2014_11_02_05/a03541088cce31b8_1.jpg", "旭童"));
            datas.add(new TestBean("http://news.k618.cn/tech/201604/W020160407281077548026.jpg", "多种type"));
            datas.add(new TestBean("http://www.kejik.com/image/1460343965520.jpg", "多种type"));
            datas.add(new TestBean("http://cn.chinadaily.com.cn/img/attachement/jpg/site1/20160318/eca86bd77be61855f1b81c.jpg", "多种type"));
            datas.add(new TestBean("http://imgs.ebrun.com/resources/2016_04/2016_04_12/201604124411460430531500.jpg", "多种type"));
            datas.add(new TestBean("http://imgs.ebrun.com/resources/2016_04/2016_04_24/201604244971461460826484_origin.jpeg", "多种type"));
            datas.add(new TestBean("http://www.lnmoto.cn/bbs/data/attachment/forum/201408/12/074018gshshia3is1cw3sg.jpg", "多种type"));
        }
        return datas;
    }
}