package com.example.musisifaforit

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Musisi(
    var Name   : String = "",
    var Genre  : String = "",
    var Album  : String = "",
    var Detail : String = "",
    var Photo  : Int    = 0,
) :Parcelable

