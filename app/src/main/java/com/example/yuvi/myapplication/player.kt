package com.example.yuvi.myapplication

import android.os.Parcel
import android.os.Parcelable

/**
 * Created by yuvi on 07-06-2018.
 */
class player( var league:String,var skill:String):Parcelable{
    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readString()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(league)
        parcel.writeString(skill)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<player> {
        override fun createFromParcel(parcel: Parcel): player {
            return player(parcel)
        }

        override fun newArray(size: Int): Array<player?> {
            return arrayOfNulls(size)
        }
    }
}