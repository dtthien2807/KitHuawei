package com.dtthien.app;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class LoginActivity extends AppCompatActivity {

    Button btn_dangnhap, btn_dangky;
    TextInputLayout txt_login_sdt, txt_login_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_login);

        //thuộc tính view
        txt_login_sdt = (TextInputLayout)findViewById(R.id.txt_login_sdt);
        txt_login_password = (TextInputLayout)findViewById(R.id.txt_login_password);
        btn_dangnhap = (Button)findViewById(R.id.btn_dangnhap);
        btn_dangky = (Button)findViewById(R.id.btn_dangky);

           //khởi tạo kết nối csdl

            }

            //Hàm quay lại màn hình chính
            public void backFromLogin(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                //tạo animation cho thành phần
                Pair[] pairs = new Pair[1];
                pairs[0] = new Pair<View, String>(findViewById(R.id.layoutwelcome), "transition_login");

                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(LoginActivity.this, pairs);
                    startActivity(intent, options.toBundle());
                } else {
                    startActivity(intent);
                }
            }

            //Hàm chuyển qua trang đăng ký
            public void callRegisterFromLogin(View view) {
                Intent intent = new Intent(getApplicationContext(), RegisterActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            }

            //endregion

    }