package com.example.myanimelist

import android.os.Parcelable
import android.provider.ContactsContract.DisplayPhoto
import kotlinx.parcelize.Parcelize

@Parcelize

data class animes(
    var judul: String = "",
    var genre: String = "",
    var informasi : String = "",
    var detail: String = "",
    var photo: Int = 0

) : Parcelable
