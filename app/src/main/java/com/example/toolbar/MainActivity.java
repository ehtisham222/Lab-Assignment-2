package com.example.toolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private EditText etemail,etpass;
    private Button sendBtn;
    private Fragment1 fragment1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initWidgets();

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        //FragmentTransaction fragmentManager=getSupportFragmentManager().beginTransaction();
       // FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();

        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user_email=etemail.getText().toString();
                String user_name=etpass.getText().toString();
                fragment1=new Fragment1();
                Bundle bundle=new Bundle();
                bundle.putString("email",user_email);
                bundle.putString("name",user_name);
                fragment1.setArguments(bundle);
                //getSupportFragmentManager().beginTransaction().replace(R.id.first_frag,fragment1).commit();
                Intent intent=new Intent(MainActivity.this,FragmentActivity.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }

    private void initWidgets() {
        toolbar=findViewById(R.id.toolBar);
        etemail=findViewById(R.id.etEmail);
        etpass=findViewById(R.id.etName);
        sendBtn=findViewById(R.id.btnSend);

    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu_ex,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.item1){
            Toast.makeText(this,"Item No 1",Toast.LENGTH_SHORT).show();
        }
        else if(item.getItemId()==R.id.item2){
            Toast.makeText(this,"Help",Toast.LENGTH_SHORT).show();
        }
        else if(item.getItemId()==R.id.item3){
            Toast.makeText(this,"Share",Toast.LENGTH_SHORT).show();
        }
        else if(item.getItemId()==R.id.blt){
            Toast.makeText(this,"Bluetooth",Toast.LENGTH_SHORT).show();
        }
        else if(item.getItemId()==android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}