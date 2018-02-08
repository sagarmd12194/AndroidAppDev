package com.example.sagar.loginpage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,dot,Bsub,Badd,Bmul,Bdiv,eq;
EditText T_area;
Double var1,var2,Res;
boolean add,sub,div,mul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b0=(Button)findViewById(R.id.b0);
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b3=(Button)findViewById(R.id.b3);
        b4=(Button)findViewById(R.id.b4);
        b5=(Button)findViewById(R.id.b5);
        b6=(Button)findViewById(R.id.b6);
        b7=(Button)findViewById(R.id.b7);
        b8=(Button)findViewById(R.id.b8);
        b9=(Button)findViewById(R.id.b9);
        Badd=(Button)findViewById(R.id.add);
        Bsub=(Button)findViewById(R.id.sub);
        Bmul=(Button)findViewById(R.id.mul);
        Bdiv=(Button)findViewById(R.id.div);
        dot=(Button)findViewById(R.id.dot);
        eq=(Button)findViewById(R.id.eq);


        T_area=(EditText)findViewById(R.id.text);

        b0.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                T_area.setText(T_area.getText()+"0");
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                T_area.setText(T_area.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                T_area.setText(T_area.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                T_area.setText(T_area.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                T_area.setText(T_area.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                T_area.setText(T_area.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                T_area.setText(T_area.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                T_area.setText(T_area.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                T_area.setText(T_area.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                T_area.setText(T_area.getText()+"9");
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                T_area.setText(T_area.getText()+".");
            }
        });
        Badd.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
               var1=(Double)Double.parseDouble(T_area.getText()+"");
               T_area.setText(null);
               add=true;
            }
        });
       Bsub.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                var1 = (Double) Double.parseDouble(T_area.getText() + "");
                T_area.setText(null);
                sub = true;
            }
        });
       Bmul.setOnClickListener(new View.OnClickListener() {

           @Override
           public void onClick(View view) {
               var1 = (Double) Double.parseDouble(T_area.getText() + "");
               T_area.setText(null);
               mul = true;
           }
        });
        Bdiv.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                var1 = (Double) Double.parseDouble(T_area.getText() + "");
                T_area.setText(null);
                div = true;
            }
        });

        //Perform Operation based on operator that has been chosen(Sag)
        eq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var2=(Double)Double.parseDouble(T_area.getText()+"");
                if(add){
                    Res=var1+var2;
                    T_area.setText(String.valueOf(Res));
                    add=false;
                }
                else  if(sub){
                    Res=var1-var2;
                    T_area.setText(String.valueOf(Res));
                    sub=false;
                }
                else  if(mul){
                    Res=var1*var2;
                    T_area.setText(String.valueOf(Res));
                    mul=false;
                }
                else  if(div){
                    Res=var1/var2;
                    T_area.setText(String.valueOf(Res));
                    div=false;
                }
            }
        });



    }
}
