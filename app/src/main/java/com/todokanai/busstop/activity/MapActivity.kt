package com.todokanai.busstop.activity

import android.os.Bundle
import android.widget.Button
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.FragmentContainerView
import com.todokanai.busstop.R
import com.todokanai.busstop.viewmodel.MapViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MapActivity : AppCompatActivity() {

    private val viewModel: MapViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)

        val sizeBtn = findViewById<Button>(R.id.sizeBtn)
        val startBtn = findViewById<Button>(R.id.startBtn)
        val endBtn = findViewById<Button>(R.id.endBtn)
        val startEndConstraint = findViewById<ConstraintLayout>(R.id.startEndConstraint)
        val startEndParams = startEndConstraint.layoutParams

        val listView = findViewById<FragmentContainerView>(R.id.busArriveContainerView)
        val listViewParams = listView.layoutParams
        fun listSizeDown() {
            listViewParams.height = 0
            listView.layoutParams = listViewParams
        }

        fun listSizeUp() {
            listViewParams.height = 750
            listView.layoutParams = listViewParams
        }

        fun sideSizeDown(){
            startEndParams.width = 0
            startEndConstraint.layoutParams = startEndParams
        }
        fun sideSizeUp(){
            startEndParams.width = 300
            startEndConstraint.layoutParams = startEndParams
        }

        sizeBtn.setOnClickListener {
            listSizeDown()

        }

        endBtn.setOnClickListener {
            listSizeUp()
        }

        startBtn.setOnClickListener {
            if(startEndConstraint.width == 0){
                sideSizeUp()
            } else{
                sideSizeDown()
            }
        }




    }
}