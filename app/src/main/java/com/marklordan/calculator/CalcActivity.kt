package com.marklordan.calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton

class CalcActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calc)

        val button1 = findViewById(R.id.button1) as Button
        val button2 = findViewById(R.id.button2) as Button
        val button3 = findViewById(R.id.button3) as Button
        val button4 = findViewById(R.id.button4) as Button
        val button5 = findViewById(R.id.button5) as Button
        val button6 = findViewById(R.id.button6) as Button
        val button7 = findViewById(R.id.button7) as Button
        val button8 = findViewById(R.id.button8) as Button
        val button9 = findViewById(R.id.button9) as Button
        val button0 = findViewById(R.id.button0) as Button
        val buttonClear = findViewById(R.id.buttonClear) as Button
        val buttonEquals = findViewById(R.id.buttonEquals) as Button

        val buttonDivide = findViewById(R.id.buttonDivide) as ImageButton
        val buttonMultiply = findViewById(R.id.buttonMultiply) as ImageButton
        val buttonSubtract = findViewById(R.id.buttonSubtract) as ImageButton
        val buttonAddition = findViewById(R.id.buttonAddition) as ImageButton
    }
}
