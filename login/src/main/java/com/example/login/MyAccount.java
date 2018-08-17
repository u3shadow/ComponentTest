package com.example.login;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.example.componentbase.service.IAccountService;


public class MyAccount implements IAccountService {
    @Override
    public boolean isLogin() {
        return true;
    }

    @Override
    public String getAccountId() {
        return "account";
    }

    @Override
    public Fragment newUserFragment(Activity activity, int containerId, FragmentManager manager, Bundle bundle, String tag) {
        return null;
    }
}
