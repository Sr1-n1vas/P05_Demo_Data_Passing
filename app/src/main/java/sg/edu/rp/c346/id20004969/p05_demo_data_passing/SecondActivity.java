package sg.edu.rp.c346.id20004969.p05_demo_data_passing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvAnswer = findViewById(R.id.textView);
        Intent intentReceived = getIntent();
        int value1 = intentReceived.getIntExtra("value", 0);
        char cvalue = intentReceived.getCharExtra("value",'z');
        double dvalue = intentReceived.getDoubleExtra("value",0.0);
        tvAnswer.setText("Integer value received is: " + value1 + "\nChar value received is " + cvalue
                + "\nDouble value received is " + dvalue);








    }
}