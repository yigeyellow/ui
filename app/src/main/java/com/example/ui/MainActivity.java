package com.example.ui;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Fragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView1=findViewById(R.id.text1);
        TextView textView2=findViewById(R.id.text2);
        TextView textView3=findViewById(R.id.text3);
        textView1.setOnClickListener(l);
        textView2.setOnClickListener(l);
        textView3.setOnClickListener(l);

    }
    View.OnClickListener l=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            FragmentManager fragmentManager=getFragmentManager();
            FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
            Fragment fragment=null;
            switch(view.getId()){
                case R.id.text1:
                    fragment=new Community_Fragment();
                    //fragment=new free();
                    break;
                case R.id.text2:
                    fragment=new Map_Fragment();
                    break;
                case R.id.text3:
                    fragment=new Mine_Fragment();
                    break;
                default:
                    break;
            }
            fragmentTransaction.replace(R.id.fragment,fragment);
            fragmentTransaction.commit();
        }
    };
}