package com.infinitelearning.androiid

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Alat(
    val imgAlat: Int,
    val nameAlat: String,
    val descAlat: String
) :Parcelable
