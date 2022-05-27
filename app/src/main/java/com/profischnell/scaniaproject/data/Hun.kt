package com.profischnell.scaniaproject.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Hun(
    var common: String? = "",
    var official: String? = ""
) : Parcelable