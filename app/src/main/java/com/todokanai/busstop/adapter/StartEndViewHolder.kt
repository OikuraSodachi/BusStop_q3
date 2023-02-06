package com.todokanai.busstop.adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.todokanai.busstop.R

class StartEndViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView){

    var nodeId : String? = null
    private val stationName = itemView.findViewById<TextView>(R.id.stationName)

    init {
        itemView.setOnClickListener {
            nodeId?.let {
                setItem(it)

            }
        }
    }

    fun setItem(nodeId: String){
        stationName.text = nodeId
        // 대충 함수 내용

        this.nodeId = nodeId
    }
}