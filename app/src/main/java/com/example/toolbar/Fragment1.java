package com.example.toolbar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class Fragment1 extends Fragment {
    private TextView tvEmail,tvPass;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view=inflater.inflate(R.layout.activity_fragment1,container,false);
    tvEmail=view.findViewById(R.id.tvemail);
    tvPass=view.findViewById(R.id.tvpass);
   Bundle bundle=getActivity().getIntent().getExtras();
   if(bundle!=null){
    String email=bundle.getString("email");
    String pass=bundle.getString("name");
    tvEmail.setText(email);
    tvPass.setText(pass);
   }
        return view;
    }
}
