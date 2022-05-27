package com.profischnell.scaniaproject.data

import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

@Parcelize
data class CapitalInfo(
    var latlng: List<Double>? = listOf()
) : Parcelable