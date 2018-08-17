package com.u3coding.componenttest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()){
            case R.id.login:
               ARouter.getInstance().build("/login/login").withString("share_content", "分享数据").navigation();
                break;
        case R.id.share:
                ARouter.getInstance().build("/share/share").withString("share_content", "分享数据").navigation();
               break;
        }
    }
}
