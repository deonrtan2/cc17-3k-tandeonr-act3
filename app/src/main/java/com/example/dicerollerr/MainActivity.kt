package com.example.mybusinesscard

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)



        val RollButton:Button = findViewById(R.id.RollButton)
        RollButton.setOnClickListener {

            rollDiceMa()
           val RolledView: TextView = findViewById(R.id.RolledView)
            //


            //val toastMa = Toast.makeText(this,"Dice Rolled",Toast.LENGTH_LONG)
        }
    }

    private fun rollDiceMa() {
        val diceMA = DiceMA(6)
        val cubeRoll = diceMA.rollMA()

        val diceImage : ImageView = findViewById(R.id.imageView)
        diceImage.setImageResource(R.drawable.dice_1)

        if (cubeRoll == 1) {
            diceImage.setImageResource(R.drawable.dice_1)
            RolledView.text = "1"
        }

        else if (cubeRoll == 2) {
            diceImage.setImageResource(R.drawable.dice_2)
            RolledView.text = "2"
        }

        else if (cubeRoll == 3) {
            diceImage.setImageResource(R.drawable.dice_3)
            RolledView.text = "3"
        }

        else if (cubeRoll == 4) {
            diceImage.setImageResource(R.drawable.dice_4)
            RolledView.text = "4"
        }

        else if (cubeRoll == 5) {
            diceImage.setImageResource(R.drawable.dice_5)
            RolledView.text = "5"
        }

        else if (cubeRoll == 6) {
            diceImage.setImageResource(R.drawable.dice_6)
            RolledView.text = "6"
        }


        //val textViewMA: TextView = findViewById(R.id.RolledView)
        //textViewMA.text = cubeRoll.toString()
    }



}

class DiceMA(val numSidesMA: Int) {
    fun rollMA(): Int {
        return (1..numSidesMA).random()
    }


}



}