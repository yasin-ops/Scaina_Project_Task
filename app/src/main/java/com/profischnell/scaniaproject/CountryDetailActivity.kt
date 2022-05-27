package com.profischnell.scaniaproject

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.github.twocoffeesoneteam.glidetovectoryou.GlideToVectorYou
import com.profischnell.scaniaproject.data.CountryDataItem
import kotlinx.android.synthetic.main.country_detail_layout.*
import kotlinx.android.synthetic.main.detail_action_bar.*


class CountryDetailActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_country_detail)

        val countryDataItem = intent.getParcelableExtra<CountryDataItem>(COUNTRY_DATA)
        d_country_Name.text = countryDataItem?.name?.common
        d_letter_country_Code.text = countryDataItem?.cca2
        d_country_Region.text = countryDataItem?.region
        val captialName:String = countryDataItem?.capital?.toTypedArray().contentToString().drop(1).dropLast(1)
if(captialName!=""){
    d_country_Capital.text=captialName
}
        else{
            d_country_Capital.text="Missing"
        }
//          //GlideToVectorYou.justLoadImage( Uri.parse(countryDataItem?.flags?.svg))
        val uri: String = countryDataItem?.flags?.svg.toString()
        Log.e("Yes", uri)
        GlideToVectorYou
            .init()
            .with(this).load(Uri.parse(uri), d_flag_Image)

//
        custom_ActionBar_ImageView.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }


    }
}