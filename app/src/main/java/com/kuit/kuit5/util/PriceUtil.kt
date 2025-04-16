package com.kuit.kuit5.util

import java.text.DecimalFormat


fun Int.toDecimalFormat() : String {
    val decimalFormat = DecimalFormat("#,###") // 세 자리마다 , 찍기
    return decimalFormat.format(this)
}