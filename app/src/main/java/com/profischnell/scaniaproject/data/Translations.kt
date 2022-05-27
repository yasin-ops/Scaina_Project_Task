package com.profischnell.scaniaproject.data


import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

@Parcelize
data class Translations(
    var ara: Ara? = Ara(),
    var ces: Ces? = Ces(),
    var cym: Cym? = Cym(),
    var deu: Deu? = Deu(),
    var est: Est? = Est(),
    var fin: Fin? = Fin(),
    var fra: FraX? = FraX(),
    var hrv: Hrv? = Hrv(),
    var hun: Hun? = Hun(),
    var ita: Ita? = Ita(),
    var jpn: Jpn? = Jpn(),
    var kor: Kor? = Kor(),
    var nld: Nld? = Nld(),
    var per: Per? = Per(),
    var pol: Pol? = Pol(),
    var por: Por? = Por(),
    var rus: Rus? = Rus(),
    var slk: Slk? = Slk(),
    var spa: Spa? = Spa(),
    var swe: Swe? = Swe(),
    var urd: Urd? = Urd(),
    var zho: Zho? = Zho()
) : Parcelable