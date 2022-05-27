package com.profischnell.scaniaproject.data

import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

@Parcelize
data class Name(
    var common: String? = "",
    var nativeName: NativeName? = NativeName(),
    var official: String? = ""
) : Parcelable