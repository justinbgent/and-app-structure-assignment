package com.lambdaschool.android.organization.util

import java.text.SimpleDateFormat
import java.util.*

class DateUtils {
    companion object {
        fun formatDate(date: Date): String {
            val format = SimpleDateFormat("dd/MM/yyy")
            return format.format(date)
        }

        // TODO: Other date formatting util methods here...

        fun formatDateWithDay(date: Date): String {
            val format = SimpleDateFormat("E dd/MM/yyy")
            return format.format(date)
        }
    }
}

//Initiate justin-gent branch