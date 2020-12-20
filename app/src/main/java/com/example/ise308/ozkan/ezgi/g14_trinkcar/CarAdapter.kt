package com.example.ise308.ozkan.ezgi.g14_trinkcar

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.car_new_page.*



class CarAdapter(
    private val mainActivity: MainActivity,
    private val carList: List<Car>)
    : RecyclerView.Adapter<CarAdapter.ListItemHolder>(){



    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int): ListItemHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.car_list_page, parent, false)

        return ListItemHolder(itemView)

    }
    inner class ListItemHolder(view: View) :
        RecyclerView.ViewHolder(view),
        View.OnClickListener {

        internal var brandName = view.findViewById<TextView>(R.id.brandName)

        internal var modelName = view.findViewById<TextView>(R.id.modelName)

        init {
            view.isClickable = true
            view.setOnClickListener(this)
        }

        override fun onClick(view: View) {
         //   mainActivity.showCar(adapterPosition)
        }

    }

    override fun onBindViewHolder(holder: ListItemHolder, position: Int) {

        val car = carList[position]
        holder.brandName.text = car.brandName

        holder.modelName.text = car.modelName

    }

    override fun getItemCount(): Int {
        if (carList != null) {
            return carList.size
        }
        return -1
    }


}

