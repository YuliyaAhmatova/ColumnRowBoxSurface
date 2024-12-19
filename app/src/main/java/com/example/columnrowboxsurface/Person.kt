package com.example.columnrowboxsurface

class Person (
    val name:String,
    val salary: String
) {
    companion object {
        val persons = mutableListOf(
            Person(
                "Иван",
                "23000"
            ),
            Person(
                "Петр",
                "13000"
            ),
            Person(
                "Анна",
                "45000"
            ),
            Person(
                "Дмитрий",
                "37000"
            ),
            Person(
                "Яна",
                "87000"
            ),
            Person(
                "Иван",
                "23000"
            ),
            Person(
                "Гриша",
                "12000"
            ),
            Person(
                "Игорь",
                "11000"
            ),
            Person(
                "Алексей",
                "19000"
            )
        )
    }
}