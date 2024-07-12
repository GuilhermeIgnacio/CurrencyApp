package util

import kotlinx.datetime.Clock
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime

fun calculateExchangeRate(source: Double, target: Double): Double {
    return target / source
}

fun convert(amount: Double, exchangeRate: Double): Double {
    return amount * exchangeRate
}

fun displayCurrentTime(): String {
    val currentTimeStamp = Clock.System.now()
    val date = currentTimeStamp.toLocalDateTime(TimeZone.currentSystemDefault())

    //Format the LocalDate into the desired representation
    val dayOfTheMonth = date.dayOfMonth

    val month = date.month.toString().lowercase().replaceFirstChar {
        if (it.isLowerCase()) it.titlecase() else it.toString()
    }
    val year = date.year

    //Determine the suffix for the day of the month
    val suffix = when {
        dayOfTheMonth in 11..13 -> "th"
        dayOfTheMonth % 10 == 1 -> "st"
        dayOfTheMonth % 10 == 2 -> "nd"
        dayOfTheMonth % 10 == 3 -> "rd"
        else -> "th"
    }

    //Format the date in the desired representation
    return "$dayOfTheMonth$suffix $month, $year"

}