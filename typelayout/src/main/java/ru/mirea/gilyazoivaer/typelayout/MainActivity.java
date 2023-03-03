package ru.mirea.gilyazoivaer.typelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private TextView tvMirea;
private Button btnChangeMireaText;
private int count=0;
    @Override
   /* protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvMirea=findViewById(R.id.textViewMirea);
        btnChangeMireaText=findViewById((R.id.buttonChangeMireaText));
        View.OnClickListener onClickListener=new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMirea.setText(String.format("Click number: %d",count++));
            }
        };
        btnChangeMireaText.setOnClickListener(onClickListener);
    }*/
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
}