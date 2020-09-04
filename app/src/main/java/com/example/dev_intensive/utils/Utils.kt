package com.example.dev_intensive.utils

object Utils {
    fun parseFullName(fullName:String?):Pair<String?, String?>{
        val parts: List<String>? = fullName?.split(" ")
        val firstName = parts?.getOrNull(0)
        val lastName = parts?.getOrNull(1)
        return firstName to lastName
    }

    fun transliteration(payload: String, divider:String = " ") {
//TODO("not implemented")
    }

    fun toInitials(firstName: String?, lastName: String?) {
//TODO("not implemented")
    }
}