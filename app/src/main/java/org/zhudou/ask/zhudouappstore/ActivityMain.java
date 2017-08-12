package org.zhudou.ask.zhudouappstore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ActivityMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //设置欢迎界面
        //更信后，展示欢迎界面
        Intent intent=new Intent(ActivityMain.this,ActivityLoading.class);
        Bundle bundle=new Bundle();
        bundle.putString("from","ActivityMain");
        intent.putExtras(bundle);
        startActivity(intent);
        //设置载入数据等待界面
    }
}
