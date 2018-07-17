package edu.wit.mobileapp.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class settings extends MainActivity {
    Button save;
    EditText name;
    EditText age;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        name=(EditText)findViewById(R.id.namePlainText);
        age=(EditText)findViewById(R.id.agePlainText);
        save=(Button)findViewById(R.id.button_save);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                String nameMessage=name.getText().toString();
                String ageMessage=age.getText().toString();
                Intent intent=new Intent();
                intent.putExtra("nMess",nameMessage);
                intent.putExtra("aMess",ageMessage);
                setResult(2,intent);
                finish();//finishing activity
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.second, menu);
        return true;
    }
}