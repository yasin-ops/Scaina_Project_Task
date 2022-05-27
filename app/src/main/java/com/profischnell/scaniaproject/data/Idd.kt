package com.profischnell.scaniaproject.data

import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

@Parcelize
data class Idd(
    var root: String? = "",
    var suffixes: List<String>? = listOf()
) : Parcelable