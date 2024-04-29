package com.example.latihansharedpreferences

import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

@Parcelize
data class UserModel (
    var name: String? = null,
    var email: String? = null,
    var age: Int = 0,
    var phoneNumber: String? = null,
    var isLove: Boolean = false
) : Parcelable