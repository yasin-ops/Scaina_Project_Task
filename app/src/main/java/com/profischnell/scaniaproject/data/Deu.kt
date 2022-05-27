package com.profischnell.scaniaproject.data


import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

@Parcelize
data class Deu(
    var common: String? = "",
    var official: String? = ""
) : Parcelable