package com.profischnell.scaniaproject.data

import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

@Parcelize
data class Car(
    var side: String? = "",
    var signs: List<String>? = listOf()
) : Parcelable