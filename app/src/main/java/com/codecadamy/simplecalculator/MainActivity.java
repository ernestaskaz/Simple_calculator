package com.codecadamy.simplecalculator;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText firstNumber = findViewById(R.id.number1);
        final EditText secondNumber = findViewById(R.id.number2);
        final RadioGroup operators = findViewById(R.id.operators);
        final RadioButton add = findViewById(R.id.add);
        final RadioButton substract = findViewById(R.id.substraction);
        final RadioButton division = findViewById(R.id.division);
        final RadioButton daugyba = findViewById(R.id.daugyba);
        final Button equals = findViewById(R.id.equals);
        final TextView result = findViewById(R.id.result);

        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = firstNumber.getText().toString();
                String num2 = secondNumber.getText().toString();

                if (num1.isEmpty() || num2.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Enter Numbers", Toast.LENGTH_SHORT).show();
                } else {
                    double firstNumberValue = Double.parseDouble(firstNumber.getText().toString());
                    double secondNumberValue = Double.parseDouble(secondNumber.getText().toString());
                    final int operatorButtonId = operators.getCheckedRadioButtonId();
                    Double answer;


                        if (operatorButtonId == add.getId()) {
                        answer = firstNumberValue + secondNumberValue;

                         } else if (operatorButtonId == substract.getId()) {
                        answer = firstNumberValue - secondNumberValue;

                         } else if (operatorButtonId == division.getId()) {
                        answer = firstNumberValue / secondNumberValue;

                         } else {
                        answer = firstNumberValue * secondNumberValue;

                        }
                            result.setText(answer.toString());

                }
            }

        });

    }
}