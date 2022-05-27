package com.profischnell.scaniaproject.data

import kotlinx.android.parcel.Parcelize
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

@Parcelize
data class Currencies(
    @SerializedName("XCD")
    var xCD: XCD? = XCD()
) : Parcelable