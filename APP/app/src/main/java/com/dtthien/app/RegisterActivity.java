package com.dtthien.app;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

import java.util.regex.Pattern;

public class RegisterActivity extends AppCompatActivity {

    ImageView img_signup_back;
    Button btn_signup_dangky;
    TextView txt_signup_title;
    TextInputLayout txt_signup_hoten, txt_signup_sdt, txt_signup_email, txt_signup_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_register);

        //region lấy đối tượng view
        img_signup_back = (ImageView)findViewById(R.id.img_signup_back);
        txt_signup_title = (TextView)findViewById(R.id.txt_signup_title);
        txt_signup_hoten = (TextInputLayout)findViewById(R.id.txt_signup_hoten);
        txt_signup_email = (TextInputLayout)findViewById(R.id.txt_signup_email);
        txt_signup_sdt = (TextInputLayout)findViewById(R.id.txt_signup_sdt);
        txt_signup_password = (TextInputLayout)findViewById(R.id.txt_signup_password);
        btn_signup_dangky = (Button)findViewById(R.id.btn_signup_dangky);



    }

    public void callLoginFromRegister() {
        Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    //Hàm quay về màn hình trước
    public void backFromRegister(View view){

        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        Pair[] pairs = new Pair[1];
        pairs[0] = new Pair<View, String>(findViewById(R.id.layout_register), "transition_signup");

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(RegisterActivity.this,pairs);
            startActivity(intent,options.toBundle());
        }else {
            startActivity(intent);
        }
    }

    //endregion
}