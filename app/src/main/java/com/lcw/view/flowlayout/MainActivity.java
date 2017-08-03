package com.lcw.view.flowlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FlowLayout flowLayout= (FlowLayout) findViewById(R.id.fl_main_tags);
        List<String> tagList= Arrays.asList("中国","日本","法国","美国","泰国","印度尼西亚","菲律宾","雅典");
        flowLayout.addFlowLayoutTag(tagList,R.layout.item_flowlayout_tv);

    }
}
