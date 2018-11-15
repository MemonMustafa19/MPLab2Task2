package com.example.mustafa.mplab2task2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView name, rollno, email;
    ImageView propic;
    String names[] = {"Sanaullah", "Mustafa", "Fida", "Mashal", "Aadil"};
    String rollnos[] = {"F16SW01", "F16SW03", "F16SW31", "F16SW37", "F16SW169"};
    String emails[] = {"sanaullah01@xyz.com", "mustafa03@xyz.com", "fida31@xyz.com", "mashal37@xyz.com", "aadil169@xyz.com"};
    int propics[]= {R.drawable.sm, R.drawable.mm, R.drawable.fhs, R.drawable.mb, R.drawable.ahn};
    int x=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.textView2);
        rollno = findViewById(R.id.textView3);
        email = findViewById(R.id.textView);
        propic = findViewById(R.id.imageView2);

        name.setText(names[0]);
        rollno.setText(rollnos[0]);
        email.setText(emails[0]);
        propic.setImageResource(propics[0]);

    }

    public void onNextClick(View view){
        if (x>=4){
            Toast toast = Toast.makeText(getApplicationContext(), "That's it!", Toast.LENGTH_SHORT);
            toast.show();
        }
        else{
            x++;
            name.setText(names[x]);
            rollno.setText(rollnos[x]);
            email.setText(emails[x]);
            propic.setImageResource(propics[x]);
        }

    }

    public void onBackClick (View view){
        if (x<=0){
            Toast toast = Toast.makeText(getApplicationContext(), "Can't go back!", Toast.LENGTH_SHORT);
            toast.show();
        }
        else{
            x--;
            name.setText(names[x]);
            rollno.setText(rollnos[x]);
            email.setText(emails[x]);
            propic.setImageResource(propics[x]);
        }

    }

}
