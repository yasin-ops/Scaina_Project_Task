package com.profischnell.scaniaproject.data


import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

@Parcelize
data class Maps(
    var googleMaps: String? = "",
    var openStreetMaps: String? = ""
) : Parcelable