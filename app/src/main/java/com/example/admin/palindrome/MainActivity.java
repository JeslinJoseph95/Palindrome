package com.example.admin.palindrome;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void button(View view) {
        String reverse = "";
        EditText editText = (EditText) findViewById(R.id.editText);
        String original = editText.getText().toString();
        int size = original.length();
        for ( int i = size - 1; i >= 0; i-- ) {
            reverse = reverse + original.charAt(i);
        }
        if (original.equals(reverse)){
            Toast.makeText(MainActivity.this, "Palindrome", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(MainActivity.this, "Not palindrome", Toast.LENGTH_SHORT).show();
        }
    }
}
