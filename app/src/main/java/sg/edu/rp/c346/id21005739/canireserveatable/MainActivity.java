package sg.edu.rp.c346.id21005739.canireserveatable;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tv1;
    EditText et1;
    EditText et2;
    EditText et3;
    CheckBox cb;
    TextView tv2;
    DatePicker dp;
    TextView tv3;
    TimePicker tp;
    Button btnbook;
    Button btnclear;
    TextView tv4;
    TextView tv5;
    TextView tv6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        tv1 = findViewById(R.id.textView8);
        et1 = findViewById(R.id.editTextTextPersonName7);
        et2 = findViewById(R.id.editTextTextPersonName8);
        et3 = findViewById(R.id.editTextTextPersonName9);
        cb = findViewById(R.id.checkBox);
        tv2 = findViewById(R.id.textView9);
        dp = findViewById(R.id.datePicker);
        tv3 = findViewById(R.id.textView10);
        tp = findViewById(R.id.timePicker);
        btnbook = findViewById(R.id.button);
        btnclear = findViewById(R.id.button2);
        tv4 = findViewById(R.id.textView11);
        tv5 = findViewById(R.id.textView12);
        tv6 = findViewById(R.id.textView13);

        btnbook.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View view) {
                if (cb.isChecked()) {
                    et1.getText().toString();
                    et2.getText().toString();
                    et3.getText().toString();
                    int month = dp.getMonth() + 1;
                    tp.getCurrentHour().toString();
                    tp.getCurrentMinute().toString();
                    String name = et1.getText().toString();
                    String number = et2.getText().toString();
                    String grp = et3.getText().toString();
                    String hour = tp.getCurrentHour().toString();
                    String min = tp.getCurrentMinute().toString();
                    Toast.makeText(MainActivity.this, "Name: " + name + "\nMobile Number: " + number + "\nSize of Grp: " + grp + "\nSmoking area: Yes" + "\nDate of Booking: " + dp.getDayOfMonth() + "/" + month + "/" + dp.getYear() + "\nTime of Booking" + hour + ":" + min, Toast.LENGTH_SHORT).show();
                }
                else {
                    et1.getText().toString();
                    et2.getText().toString();
                    et3.getText().toString();
                    int month = dp.getMonth() + 1;
                    tp.getCurrentHour().toString();
                    tp.getCurrentMinute().toString();
                    String name = et1.getText().toString();
                    String number = et2.getText().toString();
                    String grp = et3.getText().toString();
                    String hour = tp.getCurrentHour().toString();
                    String min = tp.getCurrentMinute().toString();
                    Toast.makeText(MainActivity.this, "Name: " + name + "\nMobile Number: " + number + "\nSize of Grp: " + grp + "\nSmoking area: No" + "\nDate of Booking: " + dp.getDayOfMonth() + "/" + month + "/" + dp.getYear() + "\nTime of Booking" + hour + ":" + min, Toast.LENGTH_SHORT).show();
                }
            }
        });


        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tp.setCurrentHour(19);
                tp.setCurrentMinute(30);
                dp.updateDate(2020, 5, 1);
                et1.getText().clear();
                et2.getText().clear();
                et3.getText().clear();
                cb.setSelected(false);
            }
        });
    }
}