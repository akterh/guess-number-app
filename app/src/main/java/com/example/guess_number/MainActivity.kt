package com.example.guess_number

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    var number:Int = 5
    lateinit var qsnTextView: TextView
    lateinit var resultTextView :TextView
    lateinit var resetView: Button
    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        qsnTextView = findViewById(R.id.qsn_text)
        resultTextView = findViewById(R.id.result_text)
        resetView = findViewById(R.id.btn_reset)
        //qsnTexValue.text = resources.getString(R.string.qsn_str) + number.toString()
        printQsnView()




    }
    fun clickedUpward(view: View){
        if (number==3){
           guessedNumber(4)
        }else if (number == 5){
           guessedNumber(8)
        }else if ( number ==8){
           guessedNumber(9)
        }else if (number == 9){
          guessedNumber(10)
        }else{
            ajairaClick()
        }

    }
    fun clickedDownward(view: View){
        if(number == 5){
          guessedNumber(3)
        }else if (number == 3){
           guessedNumber(2)
        }else if (number == 2){
           guessedNumber(1)
        }else if (number ==8){
          guessedNumber(7)
        }else if (number == 7){
        guessedNumber(6)
        } else{
            ajairaClick()

        }

    }
    fun clickedSuccess(view: View){
        qsnTextView.visibility = View.INVISIBLE
        resultTextView.visibility = View.VISIBLE
        output()

    }
    fun clickedReset(view: View){
        qsnTextView.visibility = View.VISIBLE
        resultTextView.visibility = View.INVISIBLE
      guessedNumber(5)


    }
    fun printQsnView(){
        qsnTextView.text = String.format(resources.getString(R.string.qsn_str),number)
    }
    fun ajairaClick(){
        qsnTextView.text = resources.getString(R.string.str_faul)
    }
    fun output(){
        resultTextView.text = String.format(resources.getString(R.string.result_str),number)
    }
    fun guessedNumber(myNumber:Int){
        number = myNumber

        printQsnView()

    }

}