package com.profischnell.scaniaproject.data


import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

@Parcelize
data class XCD(
    var name: String? = "",
    var symbol: String? = ""
) : Parcelable