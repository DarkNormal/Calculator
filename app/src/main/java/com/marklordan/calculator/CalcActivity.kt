package com.marklordan.calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_calc.*


class CalcActivity : AppCompatActivity() {

    val OPERATOR_DIVIDE = "division"
    val OPERATOR_MULTIPLY = "multiplication"
    val OPERATOR_SUBTRACTION = "subtraction"
    val OPERATOR_ADDITION = "addition"
    val maxLength = 9
    var runningNumber = "0"
    var displayedEquation = ""
    var resultHasEmptyVal = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calc)

        val resultsTextView = findViewById(R.id.resultsTextView) as TextView
        resultsTextView.text = runningNumber

        val button1 = findViewById(R.id.button1) as Button
        button1.setOnClickListener { onNumberPressed(button1.text.toString())}
        val button2 = findViewById(R.id.button2) as Button
        button2.setOnClickListener { onNumberPressed(button2.text.toString())}
        val button3 = findViewById(R.id.button3) as Button
        button3.setOnClickListener { onNumberPressed(button3.text.toString())}
        val button4 = findViewById(R.id.button4) as Button
        button4.setOnClickListener { onNumberPressed(button4.text.toString())}
        val button5 = findViewById(R.id.button5) as Button
        button5.setOnClickListener { onNumberPressed(button5.text.toString())}
        val button6 = findViewById(R.id.button6) as Button
        button6.setOnClickListener { onNumberPressed(button6.text.toString())}
        val button7 = findViewById(R.id.button7) as Button
        button7.setOnClickListener { onNumberPressed(button7.text.toString())}
        val button8 = findViewById(R.id.button8) as Button
        button8.setOnClickListener { onNumberPressed(button8.text.toString())}
        val button9 = findViewById(R.id.button9) as Button
        button9.setOnClickListener { onNumberPressed(button9.text.toString())}
        val button0 = findViewById(R.id.button0) as Button
        button0.setOnClickListener { onNumberPressed(button0.text.toString())}
        val buttonClear = findViewById(R.id.buttonClear) as Button
        buttonClear.setOnClickListener {
            displayedEquation = "0"
            runningNumber = "0"
            resultsTextView.text = displayedEquation
            resultHasEmptyVal = true

        }
        val buttonEquals = findViewById(R.id.buttonEquals) as Button
        buttonEquals.setOnClickListener { calculateExpression()}

        val buttonDivide = findViewById(R.id.buttonDivide) as ImageButton
        buttonDivide.setOnClickListener { onOperatorPressed(OPERATOR_DIVIDE) }
        val buttonMultiply = findViewById(R.id.buttonMultiply) as ImageButton
        val buttonSubtract = findViewById(R.id.buttonSubtract) as ImageButton
        val buttonAddition = findViewById(R.id.buttonAddition) as ImageButton
    }

    fun onNumberPressed(pressedNum: String){
        if(resultHasEmptyVal){
            runningNumber = ""
            displayedEquation = ""
            resultHasEmptyVal = false
        }
        if (runningNumber.length < maxLength){
            runningNumber += pressedNum
            displayedEquation += pressedNum
            resultsTextView.text = (displayedEquation)
        }

    }

    fun onOperatorPressed(op : String){
        var operator = ""
        when (op) {
            OPERATOR_DIVIDE -> {
                operator = " \u00F7 "
            }
            OPERATOR_MULTIPLY -> {
                operator = " \u00D7 "
            }
            OPERATOR_SUBTRACTION -> {
                operator = " - "
            }
            OPERATOR_ADDITION -> {
                operator = " + "
            }
        }
        runningNumber = ""
        displayedEquation += operator
        resultsTextView.text = (displayedEquation)
    }

    fun calculateExpression(){
        println("Not implemented yet!")
    }
}
