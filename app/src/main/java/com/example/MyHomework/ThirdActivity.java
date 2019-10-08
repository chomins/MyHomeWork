package com.example.MyHomework;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ThirdActivity extends Activity {

    EditText First_num;
    EditText Second_num;
    TextView Result_num;
    Button btn_plus;
    Button btn_sub;
    Button btn_multi;
    Button btn_divide;

    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.third);
        setTitle("로그인 화면");

        First_num=(EditText) findViewById(R.id.first_num);
        Second_num=(EditText) findViewById(R.id.second_num);
        Result_num=(TextView) findViewById(R.id.Result);
        btn_plus= (Button) findViewById(R.id.btn_plus);
        btn_sub= (Button) findViewById(R.id.btn_minus);
        btn_multi= (Button) findViewById(R.id.btn_multiply);
        btn_divide= (Button) findViewById(R.id.btn_divide);

        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1=First_num.getText().toString();
                String num2=Second_num.getText().toString();

                int sum=Integer.parseInt(num1)+Integer.parseInt(num2);

                Result_num.setText(sum+" 입니다.");
            }
        });

        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1=First_num.getText().toString();
                String num2=Second_num.getText().toString();

                int sub=Integer.parseInt(num1)-Integer.parseInt(num2);

                Result_num.setText(sub+" 입니다.");
            }
        });

        btn_multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1=First_num.getText().toString();
                String num2=Second_num.getText().toString();

                int multi=Integer.parseInt(num1)*Integer.parseInt(num2);

                Result_num.setText(multi+" 입니다.");
            }
        });

        btn_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1=First_num.getText().toString();
                String num2=Second_num.getText().toString();

                int divide=Integer.parseInt(num1)/Integer.parseInt(num2);

                Result_num.setText(divide+" 입니다.");
            }
        });

    }
}


