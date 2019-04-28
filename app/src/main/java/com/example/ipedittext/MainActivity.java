package com.example.ipedittext;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText loginUser;
    EditText loginPass;
    IPEditText ipEditText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        loginUser = (EditText)findViewById(R.id.user);
        loginPass = (EditText)findViewById(R.id.password);
        ipEditText = (IPEditText)findViewById(R.id.ip_text);
        Button btnLogin = (Button)findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(this);
        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null){
            actionBar.hide();
        }
        getConfigInfo();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_login:
                saveConfigInfo();
                Toast.makeText(this, "保存成功", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    /**
     * 保存登录信息至本地
     */
    private void saveConfigInfo(){
        ShareUtils.putString(Constant.loginUserKey, loginUser.getText().toString());
        ShareUtils.putString(Constant.loginPasswordKey, loginPass.getText().toString());
        ShareUtils.putString(Constant.ipKey, ipEditText.getIpText());
    }

    /**
     * 从本地获取登录信息
     */
    private void getConfigInfo(){
        loginUser.setText(Constant.loginUser);
        loginPass.setText(Constant.loginPassword);
        ipEditText.setIpText(Constant.loginIp);
    }
}
