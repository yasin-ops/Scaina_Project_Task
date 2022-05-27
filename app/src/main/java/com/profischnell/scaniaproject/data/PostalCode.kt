package com.profischnell.scaniaproject.data


import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

@Parcelize
data class PostalCode(
    var format: String? = "",
    var regex: String? = ""
) : Parcelable