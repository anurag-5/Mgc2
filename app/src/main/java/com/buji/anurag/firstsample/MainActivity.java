package com.buji.anurag.firstsample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2,et3,et4;
    Button bt1;
    String name,rNo,aNo,cn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText)findViewById(R.id.e1);
        et2=(EditText)findViewById(R.id.e2);
        et3=(EditText)findViewById(R.id.e3);
        et4=(EditText)findViewById(R.id.e4);
        bt1=(Button)findViewById(R.id.b1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name=et1.getText().toString();
                rNo=et2.getText().toString();
                aNo=et3.getText().toString();
                cn=et4.getText().toString();
                Toast.makeText(getApplicationContext(),name+" "+rNo+" "+aNo+" "+cn,Toast.LENGTH_LONG).show();
            }
        });
    }
}
