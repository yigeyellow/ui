package com.example.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.app.Fragment;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;

import static com.example.ui.R.id.button1;

public class Mine_Fragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.mine_fragment,null);
        RelativeLayout relativeLayout=view.findViewById(R.id.relativelayout);
        LinearLayout linearLayout=new LinearLayout(view.getContext());
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        ScrollView scrollView=new ScrollView(view.getContext());
        relativeLayout.addView(scrollView);
        scrollView.addView(linearLayout);
        Button button=new Button(view.getContext());
        linearLayout.addView(button);
        return view;
    }
}
