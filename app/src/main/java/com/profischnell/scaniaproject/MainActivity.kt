package com.profischnell.scaniaproject

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.profischnell.scaniaproject.adapter.CountryListAdapter
import com.profischnell.scaniaproject.data.CountryDataItem
import com.profischnell.scaniaproject.viewmodel.MainActivityViewModel
import kotlinx.android.synthetic.main.activity_main.*

const val COUNTRY_DATA = "COUNTRY_DATA"

class MainActivity : AppCompatActivity(), CountryListAdapter.ItemClickListener {
    lateinit var recylerAdapter: CountryListAdapter
    private var progressBar: ProgressBar? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViewModel()
        initRecylerView()
    }


    private fun initRecylerView() {
        countryListRecylerView.layoutManager = LinearLayoutManager(this)
        recylerAdapter = CountryListAdapter(this, this)
        countryListRecylerView.adapter = recylerAdapter
        countryListRecylerView.setHasFixedSize(true)
    }

    private fun initViewModel() {
        val viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        viewModel.getLiveDataObserver().observe(this, Observer {
            if (it != null) {
                loading_view.visibility = View.GONE
                try_Again_btn.visibility = View.GONE
                recylerAdapter.setCountryList(it)
                recylerAdapter.notifyDataSetChanged()
            } else {
                try_Again_btn.visibility = View.VISIBLE

                countryListRecylerView.visibility = View.GONE
                loading_view.visibility = View.GONE
                try_Again_btn.setOnClickListener(View.OnClickListener {
                    val intent = Intent(this, MainActivity::class.java)

                    startActivity(intent)
                })


            }
        })
        viewModel.makeAPICall()
    }

    override fun onItemClick(data: CountryDataItem) {
        val intent = Intent(this, CountryDetailActivity::class.java)
        intent.putExtra(COUNTRY_DATA, data)
        startActivity(intent)
    }
}