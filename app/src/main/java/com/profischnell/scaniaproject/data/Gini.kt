package com.profischnell.scaniaproject.data


import kotlinx.android.parcel.Parcelize
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

@Parcelize
data class Gini(
    @SerializedName("2010")
    var x2010: Double? = 0.0
) : Parcelable