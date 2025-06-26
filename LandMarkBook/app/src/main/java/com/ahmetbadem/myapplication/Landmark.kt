package com.ahmetbadem.myapplication

import java.io.Serializable

data class Landmark(val name: String, val country: String, val image: Int) : Serializable {
}