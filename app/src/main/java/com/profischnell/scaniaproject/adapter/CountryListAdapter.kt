package com.profischnell.scaniaproject.adapter

import android.app.Activity
import android.net.Uri
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.github.twocoffeesoneteam.glidetovectoryou.GlideToVectorYou
import com.profischnell.scaniaproject.MainActivity
import com.profischnell.scaniaproject.R
import com.profischnell.scaniaproject.data.CountryDataItem
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.country_list_row.view.*
import kotlin.math.log10

class CountryListAdapter(
    private val activity: Activity,
    private val listener: ItemClickListener
) : RecyclerView.Adapter<CountryListAdapter.MyViewHolder>() {

    private var countryList: List<CountryDataItem>? = null

    fun setCountryList(countryList: List<CountryDataItem>?) {
        this.countryList = countryList
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.country_list_row,
            parent, false
        )
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        countryList?.get(position)?.let {
            holder.bind(it, activity)

        }
    }

    override fun getItemCount(): Int {
        return if (countryList == null)
            0
        else countryList?.size!!
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val img_flag = view.img_flag
        val tv_flage_Name = view.tv_flage_Name
        //val tv_capital = view.tv_capital
        //  val tvRegion = view.tvRegion

        fun bind(data: CountryDataItem, activity: Activity) {

            tv_flage_Name.text = data.name?.common + "(" + data.cca2 + ")"
//    NO NEEd
//            if (data.capital != null && data?.capital?.isNotEmpty() == true) {
//                tvCapital.text = "Captial :" + data?.capital?.toTypedArray().contentToString()
//                // val city = "Captial :" + data.capital.toTypedArray().contentToString()
//            }
////            else{
////                tvCapital.visibility=View.GONE;
////            }
//            tvRegion.text = "Region: " + data.region

            GlideToVectorYou.justLoadImage(activity, Uri.parse(data.flags?.svg), img_flag)
            itemView.setOnClickListener { listener.onItemClick(data) }
        }
    }

    interface ItemClickListener {
        fun onItemClick(data: CountryDataItem)
    }
}





