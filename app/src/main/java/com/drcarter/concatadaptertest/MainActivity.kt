package com.drcarter.concatadaptertest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.ConcatAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.drcarter.concatadaptertest.adapter.AnimalAdapter
import com.drcarter.concatadaptertest.adapter.FruitAdapter
import com.drcarter.concatadaptertest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val fruits = listOf("사과", "배", "포도", "망고", "체리", "수박", "참외")
    private val animals = listOf("강아지", "고양이", "곰", "사자", "호랑이", "낙타", "기린")

    private lateinit var binding: ActivityMainBinding

    private val fruitAdapter: FruitAdapter by lazy {
        FruitAdapter()
    }

    private val animalAdapter: AnimalAdapter by lazy {
        AnimalAdapter()
    }

    private val concatAdapter: ConcatAdapter by lazy {
        ConcatAdapter(fruitAdapter, animalAdapter)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.run {

            recyclerview.run {
                layoutManager = LinearLayoutManager(this@MainActivity)
                adapter = concatAdapter
            }

            buttonFruitAdd.setOnClickListener {
                fruitAdapter.addItem(fruits.shuffled()[0])
            }
            buttonAnimalAdd.setOnClickListener {
                animalAdapter.addItem(animals.shuffled()[0])
            }

        }
    }
}