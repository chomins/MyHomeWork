package com.example.MyHomework;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    ArrayList list=new ArrayList();
    EditText textID;
    EditText textPW;
    User us= new User();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("홈 화면");


        textID=(EditText) findViewById(R.id.textID);
        textPW=(EditText) findViewById(R.id.textPW);
        Button btnLogin=(Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {

                try {
                    BufferedReader br = new BufferedReader(new FileReader(getFilesDir()+"test.txt"));
                    String line="";

                    while ((line=br.readLine())!=null){
                        list.add(line);
                    }
                    br.close();
                    for (int i=0; i<list.size(); i++){
                        String info=(String)list.get(i);
                        String [] infos=info.split(",");
                        us.setUserName(infos[0]);
                        us.setUserID(infos[1]);
                        us.setUserPW(infos[2]);
                    }

                }
                catch (FileNotFoundException e){
                    e.printStackTrace();
                }
                catch (IOException e){
                    e.printStackTrace();
                }


                if(textID.getText().toString().equals(us.getUserID()))//회원정보가 일치하는지 if문을 통해서 확인합니다. 성공할 시 로그인화면으로 진입합니다.
                {
                    if(textPW.getText().toString().equals(us.getUserPW())) {
                        Intent intent = new Intent(getApplicationContext(), ThirdActivity.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(), "로그인 성공",Toast.LENGTH_SHORT).show();
                    }
                }
                else{ //회원 정보가 없을 시 로그인 실패를 알립니다.
                    Toast.makeText(getApplicationContext(), "로그인에 실패했습니다.",Toast.LENGTH_SHORT).show();
                }
            }
        });

        Button btnSign_in=(Button) findViewById(R.id.btnSignin);
        btnSign_in.setOnClickListener(new View.OnClickListener() {
            @Override //회원가입 창으로 넘어갑니다.
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), SecondActivity.class);
                startActivity(intent);
            }
        });
    }
}
