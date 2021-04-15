package com.example.toolbar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment2 extends Fragment {
    private EditText etEmail,etName;
    private Button btnSend;
    private Fragment3 fragment3;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view=inflater.inflate(R.layout.activity_fragment2,container,false);
        etEmail=view.findViewById(R.id.etEmailF);
        etName=view.findViewById(R.id.etNameF);
        btnSend=view.findViewById(R.id.btnSendFragment);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user_email=etEmail.getText().toString();
                String user_name=etName.getText().toString();
                fragment3=new Fragment3();
                Bundle bd=new Bundle();
                bd.putString("email",user_email);
                bd.putString("name",user_name);
                fragment3.setArguments(bd);

                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.third_frag,fragment3).commit();

            }
        });
;        return view;
    }
}
