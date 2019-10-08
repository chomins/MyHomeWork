package com.example.MyHomework;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

public class SecondActivity extends Activity {

    EditText name;
    EditText id;
    EditText pw;
    RadioButton rb_yes;

    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        setTitle("회원가입 화면");
        name=(EditText) findViewById(R.id.name);
        id=(EditText) findViewById(R.id.textID);
        pw=(EditText) findViewById(R.id.textPW);
        rb_yes=(RadioButton) findViewById(R.id.radioButton);
        Button btn_complete=(Button) findViewById(R.id.btnComplete);
        btn_complete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { //회원 가입정보를 파일에 저장
                if(rb_yes.isChecked()) {
                    try {
                        BufferedWriter bw = new BufferedWriter(new FileWriter(getFilesDir() + "test.txt"));
                        bw.write(name.getText().toString());
                        bw.write(",");
                        bw.write(id.getText().toString());
                        bw.write(",");
                        bw.write(pw.getText().toString());
                        bw.write(",");
                        bw.close();
                        Toast.makeText(getApplicationContext(), "회원가입완료", Toast.LENGTH_SHORT).show();
                        User us = new User(); //user수가 늘어났으니까 user 숫자를 증가시킵니다.
                        finish();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else {
                    Toast.makeText(getApplicationContext(), "동의 부탁드립니다...", Toast.LENGTH_SHORT).show();
                }
            }
        });




    }
}


