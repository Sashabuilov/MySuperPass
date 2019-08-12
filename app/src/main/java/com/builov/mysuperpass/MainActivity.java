package com.builov.mysuperpass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText etLogin;
    Button button_add;
    DataAdapter myAdapter;
    List<model> loginpassword = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();

        button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setNewData();
            }
        });

    }

    private void setNewData(){
        String login = etLogin.getText().toString();
        loginpassword.add(new model(login));
        showAll();
    }


    private void showAll(){

        if (myAdapter==null) {
            final RecyclerView recyclerView = findViewById(R.id.list_holder);
            myAdapter = new DataAdapter(loginpassword,getApplicationContext());
            recyclerView.setAdapter(myAdapter);
        } else {
            myAdapter.notifyDataSetChanged();
        }
    }


    private void initUI() {
        button_add = findViewById(R.id.button_add);
        etLogin = findViewById(R.id.etLogin);
    }
}
