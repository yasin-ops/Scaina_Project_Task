package com.profischnell.scaniaproject.data

import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

@Parcelize
data class CoatOfArms(
    var png: String? = "",
    var svg: String? = ""
) : Parcelable