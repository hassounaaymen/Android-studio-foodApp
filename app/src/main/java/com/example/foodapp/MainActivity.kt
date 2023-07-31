package com.example.foodapp


import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.foodapp.adapter.AsiaFoodAdapter
import com.example.foodapp.adapter.PopularFoodAdapter
import com.example.foodapp.model.AsiaFood
import com.example.foodapp.model.PopularFood


class MainActivity : AppCompatActivity() {
    var popularRecycler: RecyclerView? = null
    var asiaRecycler: RecyclerView? = null
    var popularFoodAdapter: PopularFoodAdapter? = null
    var asiaFoodAdapter: AsiaFoodAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // now here we will add some dummy data to out model class
        val popularFoodList: MutableList<PopularFood> = ArrayList<PopularFood>()
        popularFoodList.add(PopularFood("Float Cake Vietnam", "$7.05", R.drawable.popularfood1))
        popularFoodList.add(PopularFood("Chiken Drumstick", "$17.05", R.drawable.popularfood2))
        popularFoodList.add(PopularFood("Fish Tikka Stick", "$25.05", R.drawable.popularfood3))
        popularFoodList.add(PopularFood("Float Cake Vietnam", "$7.05", R.drawable.popularfood1))
        popularFoodList.add(PopularFood("Chiken Drumstick", "$17.05", R.drawable.popularfood2))
        popularFoodList.add(PopularFood("Fish Tikka Stick", "$25.05", R.drawable.popularfood3))
        setPopularRecycler(popularFoodList)
        val asiaFoodList: MutableList<AsiaFood> = ArrayList<AsiaFood>()
        asiaFoodList.add(
            AsiaFood(
                "Chicago Pizza",
                "$20",
                R.drawable.asiafood1,
                "4.5",
                "Briand Restaurant"
            )
        )
        asiaFoodList.add(
            AsiaFood(
                "Straberry Cake",
                "$25",
                R.drawable.asiafood2,
                "4.2",
                "Friends Restaurant"
            )
        )
        asiaFoodList.add(
            AsiaFood(
                "Chicago Pizza",
                "$20",
                R.drawable.asiafood1,
                "4.5",
                "Briand Restaurant"
            )
        )
        asiaFoodList.add(
            AsiaFood(
                "Straberry Cake",
                "$25",
                R.drawable.asiafood2,
                "4.2",
                "Friends Restaurant"
            )
        )
        asiaFoodList.add(
            AsiaFood(
                "Chicago Pizza",
                "$20",
                R.drawable.asiafood1,
                "4.5",
                "Briand Restaurant"
            )
        )
        asiaFoodList.add(
            AsiaFood(
                "Straberry Cake",
                "$25",
                R.drawable.asiafood2,
                "4.2",
                "Friends Restaurant"
            )
        )
        setAsiaRecycler(asiaFoodList)
    }

    private fun setPopularRecycler(popularFoodList: List<PopularFood>) {
        val  popularRecycler = findViewById<RecyclerView>(R.id.popular_recycler)
        val layoutManager: RecyclerView.LayoutManager =
            LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        popularRecycler.setLayoutManager(layoutManager)
        popularFoodAdapter = PopularFoodAdapter(this, popularFoodList);
        popularRecycler.setAdapter(popularFoodAdapter)
    }

    private fun setAsiaRecycler(asiaFoodList: List<AsiaFood>) {
          val asiaRecycler = findViewById<RecyclerView>(R.id.asia_recycler)
        val layoutManager: RecyclerView.LayoutManager =
            LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        asiaRecycler.setLayoutManager(layoutManager)
        asiaFoodAdapter = AsiaFoodAdapter(this, asiaFoodList)
        asiaRecycler.setAdapter(asiaFoodAdapter)
    }
}

