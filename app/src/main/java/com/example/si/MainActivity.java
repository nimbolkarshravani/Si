package com.example.si;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    double si,i,j,k;
    EditText e1;
    EditText e2;
    EditText e3,e4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        button=findViewById(R.id.button);
        e1=findViewById(R.id.editText);
        e2=findViewById(R.id.editText2);
        e3=findViewById(R.id.editText3);

        e4 = findViewById(R.id.editText4);





        button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Toast.makeText(MainActivity.this, "calculating..", Toast.LENGTH_SHORT).show();


        try {
            String s1 = e1.getText().toString();
            i = Double.parseDouble(s1);
            String s2 = e2.getText().toString();
            j = Double.parseDouble(s2);
            String s3 = e3.getText().toString();
            k = Double.parseDouble(s3);
        }
        catch (Exception e)
        {
            Toast.makeText(MainActivity.this, "error..", Toast.LENGTH_SHORT).show();

        }
        si = i * j * k / 100;
        e4.setText(si+" ");

    }
});

    }
}
