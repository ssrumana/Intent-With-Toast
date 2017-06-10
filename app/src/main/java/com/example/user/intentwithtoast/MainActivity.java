package com.example.user.intentwithtoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button save;
    Button delete;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        save=(Button)findViewById(R.id.savebutton);
        delete=(Button)findViewById(R.id.deletebutton);
        img=(ImageView)findViewById(R.id.imageView);
    }
    public void onClick(View v){
        if(v.getId()==R.id.savebutton){
            Toast.makeText(this,"Save button was click ",Toast.LENGTH_LONG).show();

        }
        if(v.getId()==R.id.deletebutton){
            Toast.makeText(this,"Delete button was click",Toast.LENGTH_SHORT).show();
        }
        if(v.getId()==R.id.imageView){
            Toast.makeText(this, "Image button was click", Toast.LENGTH_LONG).show();
        }
    }
}
