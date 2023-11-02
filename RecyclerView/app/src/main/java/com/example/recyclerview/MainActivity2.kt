package com.example.recyclerview

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.databinding.ActivityMainBinding
import com.example.recyclerview.ui.theme.Food
import com.example.recyclerview.ui.theme.FoodAdapter
import com.example.recyclerview.ui.theme.RecyclerViewTheme

class MainActivity2 : ComponentActivity() {
    private lateinit var foodList: ArrayList<Food>
    private lateinit var foodAdapter: FoodAdapter
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        foodList = ArrayList()
        foodAdapter = FoodAdapter(foodList)
        foodListItems()

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.setHasFixedSize(true)
        binding.recyclerView.adapter = foodAdapter
    }

    private fun foodListItems(){
        foodList.add(Food(R.drawable.pizza1,"chicken Pizza"))
        foodList.add(Food(R.drawable.pizza2,"Beef Chicken"))
        foodList.add(Food(R.drawable.noodles1,"normal Pizza"))
        foodList.add(Food(R.drawable.noodles2,"sweet Chicken"))
        foodList.add(Food(R.drawable.paneer,"Mini Pizza"))
        foodList.add(Food(R.drawable.pasta,"Extra Chicken"))
        foodList.add(Food(R.drawable.piza_spagethi,"meat Pizza"))
        foodList.add(Food(R.drawable.pizza12,"vegez Chicken"))
        foodList.add(Food(R.drawable.pizza1,"chicken Pizza"))
        foodList.add(Food(R.drawable.pizza2,"Beef Chicken"))
        foodList.add(Food(R.drawable.noodles1,"normal Pizza"))
        foodList.add(Food(R.drawable.noodles2,"sweet Chicken"))
        foodList.add(Food(R.drawable.paneer,"Mini Pizza"))
        foodList.add(Food(R.drawable.pasta,"Extra Chicken"))
        foodList.add(Food(R.drawable.piza_spagethi,"meat Pizza"))
        foodList.add(Food(R.drawable.pizza12,"vegez Chicken"))
    }

//    @Composable
//    fun Greeting(name: String, modifier: Modifier = Modifier) {
//        Text(
//            text = "Hello $name!",
//            modifier = modifier
//        )
//    }
//
//    @Preview(showBackground = true)
//    @Composable
//    fun GreetingPreview() {
//        RecyclerViewTheme {
//            Greeting("Android")
//        }
//    }
}