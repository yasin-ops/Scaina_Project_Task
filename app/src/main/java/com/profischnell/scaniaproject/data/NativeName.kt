package com.profischnell.scaniaproject.data


import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

@Parcelize
data class NativeName(
    var eng: EngX? = EngX()
) : Parcelable