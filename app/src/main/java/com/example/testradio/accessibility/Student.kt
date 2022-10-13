package com.example.testradio.accessibility

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Student(val id: Int, var name: String) : Parcelable
