package subtask1

import java.time.LocalDate
import java.time.format.DateTimeFormatter

class DateFormatter {

    fun toTextDay(day: String, month: String, year: String): String {
        return try {
            if (month == "2" && day == "29") throw Exception()
            val pattern: String = if (month.length == 1) "dd-M-yyyy" else "dd-MM-yyyy"
            val formatter = DateTimeFormatter.ofPattern(pattern)
            val date = LocalDate.parse("$day-$month-$year", formatter)
            date.format(DateTimeFormatter.ofPattern("dd MMMM, EEEE"))
        } catch (e: Exception) {
            "Такого дня не существует"
        }
    }
}
