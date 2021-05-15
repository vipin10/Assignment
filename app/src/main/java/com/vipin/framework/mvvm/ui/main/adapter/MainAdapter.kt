package com.vipin.framework.mvvm.ui.main.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.vipin.framework.mvvm.R
import com.vipin.framework.mvvm.data.model.TaskList
import com.vipin.framework.mvvm.ui.main.view.MapActivity
import kotlinx.android.synthetic.main.item_layout.view.*

class MainAdapter (private val taskList: ArrayList<TaskList>) : RecyclerView.Adapter<MainAdapter.DataViewHolder>() {


        class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(taskListt: TaskList) {
            itemView.textViewUserName.text = taskListt.description
            Glide.with(itemView.imageViewAvatar.context)
                .load(taskListt.imageUrl)
                .into(itemView.imageViewAvatar)

            itemView.container.setOnClickListener {
                it.getContext().startActivity(Intent(it.getContext(), MapActivity::class.java))


            }


    }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        DataViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_layout, parent,
                false
            )
        )

    override fun getItemCount(): Int = taskList.size

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) =
        holder.bind(taskList[position])



    fun addData(list: List<TaskList>) {
        taskList.addAll(list)
    }

}


