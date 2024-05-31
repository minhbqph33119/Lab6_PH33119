package com.example.lab6_ph33119

data class Movie(
    val title: String,
    val year: String,
    val posterUrl: String,
    val duration: Double,
    val releaseDate: String
) {
    companion object {
        fun getSampleMovies() = listOf(
            Movie("Mai", "2024", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT2oWo4A-LMn4qjTL2gCBMUDGGYqkNz4B-iPg&s",3.0,"9/3/2024"),
            Movie("Transformers: Rise of the Beasts", "2023 ", "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcT8i-M4gT0XsJbvAVqYB5dHt-_OnH4oeayPwB9bCxBOYWetBtGB",2.1,"12/9/2023"),
            Movie("P.S. I Love You", "2007", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQimtPadGk7w48GNY_eJbhW5aHOEpKrfpC7fW6RYhazRw-Jhled",1.8,"17/5/2007"),
            Movie("The Conjuring", "2013", "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSPN0jFXkjp_5YGSBfMIWZb5VXfoECC9PFWmBci9gc4NhbUUa3m",1.65,"30/10/2013"),
            Movie("F9", "2021", "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcTYZ5ceOIuq4ZfYqJvLts5mfYy-kENSZPy-mXru48VFfvJdW6j6",2.4,"4/8/2021"),
            Movie("Spider-Man", "2002", "https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcRTTQbtas_si2xfv23g_NwoKkO8oU7IxhPqivnafWe58LHi8Tin",2.1,"22/2/2002"),
            Movie("Kung Fu Panda", "2008", "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcTqgWkU4lJ49fP-biZlp_kNAWbfINefWmuBHNrMpTP_KCBMqvyw",1.3,"6/2/2008"),
            Movie("Transformers: Rise of the Beasts", "2023", "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcT8i-M4gT0XsJbvAVqYB5dHt-_OnH4oeayPwB9bCxBOYWetBtGB",2.67,"11/4/2023"),
            Movie("How to Train Your Dragon: The Hidden World", "2019", "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSzxaIK2qzAnjBsSP2wixHgOGU6dujLmwE0rqKb5MljPqZVrEWy",1.92,"27/9/2019"),


        )
    }
}
