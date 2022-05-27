package com.profischnell.scaniaproject.data


import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

@Parcelize
data class Eng(
    var f: String? = "",
    var m: String? = ""
) : Parcelable