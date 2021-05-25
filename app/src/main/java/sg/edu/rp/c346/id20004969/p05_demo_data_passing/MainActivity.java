package sg.edu.rp.c346.id20004969.p05_demo_data_passing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnPassInteger;
    Button btnPassCharacter;
    TextView doublePassing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPassInteger = findViewById(R.id.btnPassIntger);
        btnPassCharacter = findViewById(R.id.btnPassChar);
        doublePassing = findViewById(R.id.txtView);

        btnPassInteger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,
                        SecondActivity.class);
                intent.putExtra("value",1);
                startActivity(intent);
            }
        });

        btnPassCharacter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("value",'a');
                startActivity(intent);
            }
        });

        doublePassing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("value",99.99);
                startActivity(intent);
            }
        });
    }
}