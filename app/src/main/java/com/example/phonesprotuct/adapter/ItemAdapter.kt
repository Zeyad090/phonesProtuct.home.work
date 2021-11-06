package com.example.product_recycleview_home_work.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.phonesprotuct.R
import com.example.phonesprotuct.ShowFragment
import com.example.phonesprotuct.ShowFragmentDirections

import javax.sql.DataSource

class SmartPhoneAdapter(private val context: ShowFragment, context1: Context) :
    RecyclerView.Adapter<SmartPhoneAdapter.SmartPhoneViewHolder>() {

    private val dataSource = com.example.phonesprotuct.data.DataSource.smartPhone

    class SmartPhoneViewHolder(view: View?) : RecyclerView.ViewHolder(view!!) {
        val productImage: ImageView? = view?.findViewById(R.id.product_image)
        val productName: TextView? = view?.findViewById(R.id.product_name)
        val productPrice: TextView? = view?.findViewById(R.id.product_price)
        val productIsVip: ImageView? = view?.findViewById(R.id.isVip_icon)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SmartPhoneViewHolder {
        return SmartPhoneViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        )
    }

    @SuppressLint("ResourceAsColor")
    override fun onBindViewHolder(holder: SmartPhoneViewHolder, position: Int) {
        val item = dataSource[position]

        holder.productImage?.setImageResource(item.productImage)
        holder.productName?.text = context?.getString(item.productName)
        holder.productPrice?.text = item.productPrice

        if (item.isVip) {
            holder.productIsVip?.visibility = View.VISIBLE
        }


// stopped her (Perform the Navigation Action**)===================================================================
        holder.productImage?.setOnClickListener {

            val action = ShowFragmentDirections.actionShowFragmentToBuyFragment( phoneInfo= holder.productName?.text.toString(),phoneImage =(item.productImage))
            holder.itemView.findNavController().navigate(action)

        }

    }

    override fun getItemCount(): Int = dataSource.size
}