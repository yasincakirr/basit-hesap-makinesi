package com.yasincakir.basithesapmakinas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText number1Text;
    EditText number2Text;
    TextView textView2;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

             number1Text=findViewById(R.id.number1Text);
             number2Text=findViewById(R.id.number2Text);
             textView2=findViewById(R.id.textView2);
        }



            public void sum(View view){

           //String mystring =number1Text.getText().toString();

                if(number1Text.getText().toString().matches("")||number2Text.getText().toString().matches("")){

                    textView2.setText("Sayi girsene pic");

                }

                else{
                    int number1=Integer.parseInt(number1Text.getText().toString());
                    int number2=Integer.parseInt(number2Text.getText().toString());

                    int sonuc=number1+number2;

                    textView2.setText("Sonuc= "+sonuc);
                }



            }

            public void deduct(View view){



                if(number1Text.getText().toString().matches("")||number2Text.getText().toString().matches("")){

                    textView2.setText("Sayi girsene pic");

                }

                else{
                    int number1=Integer.parseInt(number1Text.getText().toString());
                    int number2=Integer.parseInt(number2Text.getText().toString());

                    int sonuc=number1-number2;
                    textView2.setText("Sonuc "+sonuc);
                }


            }

            public void multiply(View view){

                if(number1Text.getText().toString().matches("")||number2Text.getText().toString().matches("")){

                    textView2.setText("Sayi girsene pic");

                }

                else{
                    int number1=Integer.parseInt(number1Text.getText().toString());
                    int number2=Integer.parseInt(number2Text.getText().toString());

                    int sonuc=number1*number2;
                    textView2.setText("sonuc "+sonuc);


                }


            }

            public void divide(View view){

                if(number1Text.getText().toString().matches("")||number2Text.getText().toString().matches("")){

                    textView2.setText("Sayi girsene pic");

                }


                else{
                    int number1=Integer.parseInt(number1Text.getText().toString());
                    int number2=Integer.parseInt(number2Text.getText().toString());



                    int sonuc=number1/number2;
                    textView2.setText("sonuc "+sonuc);

                }



            }

}