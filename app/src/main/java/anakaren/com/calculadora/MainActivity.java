package anakaren.com.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button seven;
    Button nine;
    Button eight;
    Button divide;
    Button four;
    Button six;
    Button five;
    Button multiply;
    Button one;
    Button three;
    Button two;
    Button minus;
    Button equal;
    Button decimal;
    Button zero;
    Button plus;
    Button cos;
    Button allclear;
    Button sin;
    Button exponent;

    double suma;
    double resta;
    double multiplicacion;
    double division;
    double potencia;
    double seno;
    double coseno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seven = findViewById(R.id.button2) ;
        nine = findViewById(R.id.button3);
        eight = findViewById(R.id.button4);
        divide = findViewById(R.id.button5);
        four = findViewById(R.id.button6);
        six = findViewById(R.id.button7);
        five = findViewById(R.id.button8);
        multiply = findViewById(R.id.button9);
        one = findViewById(R.id.button10);
        three = findViewById(R.id.button11);
        two = findViewById(R.id.button12);
        minus = findViewById(R.id.button13);
        equal = findViewById(R.id.button14);
        decimal = findViewById(R.id.button15);
        zero = findViewById(R.id.button16);
        plus = findViewById(R.id.button17);
        cos = findViewById(R.id.button18);
        allclear = findViewById(R.id.button19);
        sin = findViewById(R.id.button20);
        exponent = findViewById(R.id.button21);




    }
}
