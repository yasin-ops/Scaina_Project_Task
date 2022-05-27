package com.profischnell.scaniaproject.data


import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

@Parcelize
data class Demonyms(
    var eng: Eng? = Eng(),
    var fra: Fra? = Fra()
) : Parcelable