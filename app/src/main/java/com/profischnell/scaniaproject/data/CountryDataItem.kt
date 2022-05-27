package com.profischnell.scaniaproject.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CountryDataItem(
    var altSpellings: List<String>? = listOf(),
    var area: Double? = 0.0,
    var borders: List<String>? = listOf(),
    var capital: List<String>? = listOf(),
    var capitalInfo: CapitalInfo? = CapitalInfo(),
    var car: Car? = Car(),
    var cca2: String? = "",
    var cca3: String? = "",
    var ccn3: String? = "",
    var cioc: String? = "",
    var coatOfArms: CoatOfArms? = CoatOfArms(),
    var continents: List<String>? = listOf(),
    var currencies: Currencies? = Currencies(),
    var demonyms: Demonyms? = Demonyms(),
    var fifa: String? = "",
    var flag: String? = "",
    var flags: Flags? = Flags(),
    var gini: Gini? = Gini(),
    var idd: Idd? = Idd(),
    var independent: Boolean? = false,
    var landlocked: Boolean? = false,
    var languages: Languages? = Languages(),
    var latlng: List<Double>? = listOf(),
    var maps: Maps? = Maps(),
    var name: Name? = Name(),
    var population: Int? = 0,
    var postalCode: PostalCode? = PostalCode(),
    var region: String? = "",
    var startOfWeek: String? = "",
    var status: String? = "",
    var subregion: String? = "",
    var timezones: List<String>? = listOf(),
    var tld: List<String>? = listOf(),
    var translations: Translations? = Translations(),
    var unMember: Boolean? = false
) : Parcelable