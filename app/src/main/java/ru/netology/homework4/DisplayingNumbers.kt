package ru.netology.homework4

import android.widget.TextView
import ru.netology.homework4.databinding.ActivityMainBinding
import ru.netology.homework4.dto.Post

fun DisplayingNumbers (number:Long,display:TextView){
    if (number>= 1000) {

        display.text = "%.1f".format(
            (number.toDouble() / 1000)
        ) + "K "
    }
    if (number >= 10_000) {

        display.text = "%.0f".format(
            (number.toDouble() / 1000)
        ) + "K "
    }
    if (number >= 1000_000) {
        display.text = "%.1f".format(
            (number.toDouble() / 1000_000)
        ) + "МЛН "

    }
    if (number >= 1000_000_000) {
        display.text = "%.1f".format(
            (number.toDouble() / 1000_000_000)
        ) + "МЛД"

    }
}