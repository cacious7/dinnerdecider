
package com.avodev.dinnerdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf("Chinese", "Hamburger", "Pizza", "MacDonals", "Nandos")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideBtn.setOnClickListener{
            //create an object of type Random and initialize
            val random = Random()
            val randomIndex = random.nextInt(foodList.count())
            selectedFoodText.text = foodList[randomIndex]
        }

        addFoodBtn.setOnClickListener{
            val newFood = addFoodInputText.text.toString()
            foodList.add(newFood)
            addFoodInputText.text.clear()
            println(foodList)
        }

    }
}
