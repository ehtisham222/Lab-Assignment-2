package com.example.toolbar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment3 extends Fragment {
    private TextView tvEmailF,tvNameF;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
       View view=inflater.inflate(R.layout.activity_fragment3,container,false);
       tvEmailF=view.findViewById(R.id.tvemailF);
        tvNameF=view.findViewById(R.id.tvnameF);
        Bundle b=getArguments();
        if(b!=null){
        String emailF=b.getString("email");
        String nameF=b.getString("name");
        tvEmailF.setText(emailF);
        tvNameF.setText(nameF);}
        return view;
    }
}
