/*
* Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
  Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock.
  Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.
*/

fun main() {
    val time = "11:00:00PM"
    val arrTime = time.split(":")

    var hours = arrTime[0].toInt()
    val minutes = arrTime[1]
    val seconds = arrTime[2].substring(0..1)

    if (hours == 12) {
        if (arrTime[2].contains("AM")) {
            hours = 0
        }
    } else if (arrTime[2].contains("PM")) {
        hours += 12
    }

    println("${hours.toString().padStart(2, '0')}:$minutes:$seconds")
}