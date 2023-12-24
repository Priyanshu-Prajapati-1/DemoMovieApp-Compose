package com.example.movieapp.model

data class Movie(
    val id: String,
    val title: String,
    val year: String,
    val genre: String,
    val director: String,
    val actors: String,
    val plot: String,
    val poster: String,
    val images: List<String>,
    val rating: String
)

fun getMovies(): List<Movie> {
    return listOf(
        Movie(
            id = "tt0499541",
            title = "Avatar 1",
            year = "2009",
            genre = "Action, Adventure, Fantasy",
            director = "James Cameron",
            actors = "Sam Worthington, Zoe Saldana",
            plot = "A paraplegic marine dispatched to the moon Pandora on a unique mission becomes",
            poster = "https://picsum.photos/id/10/200/200",
            images = listOf(
                "https://picsum.photos/id/20/300/200",
                "https://picsum.photos/id/21/300/200",
                "https://picsum.photos/id/22/300/200",
                "https://picsum.photos/id/23/300/200",
                "https://picsum.photos/id/24/300/200",
            ),
            rating = "1.0"
        ),
        Movie(
            id = "tt0499542",
            title = "Avatar 2",
            year = "2009",
            genre = "Action, Adventure, Fantasy",
            director = "James Cameron",
            actors = "Sam Worthington, Zoe Saldana",
            plot = "A paraplegic marine dispatched to the moon Pandora on a unique mission becomes",
            poster = "https://picsum.photos/id/11/200/200",
            images = listOf(
                "https://picsum.photos/id/25/300/200",
                "https://picsum.photos/id/26/300/200",
                "https://picsum.photos/id/27/300/200",
                "https://picsum.photos/id/28/300/200",
                "https://picsum.photos/id/29/300/200",
            ),
            rating = "2.0"
        ),
        Movie(
            id = "tt0499543",
            title = "Avatar 3",
            year = "2009",
            genre = "Action, Adventure, Fantasy",
            director = "James Cameron",
            actors = "Sam Worthington, Zoe Saldana",
            plot = "A paraplegic marine dispatched to the moon Pandora on a unique mission becomes",
            poster = "https://picsum.photos/id/12/200/200",
            images = listOf(
                "https://picsum.photos/id/30/300/200",
                "https://picsum.photos/id/31/300/200",
                "https://picsum.photos/id/32/300/200",
                "https://picsum.photos/id/33/300/200",
                "https://picsum.photos/id/34/300/200",
            ),
            rating = "3.0"
        ),
        Movie(
            id = "tt0499544",
            title = "Avatar 4",
            year = "2009",
            genre = "Action, Adventure, Fantasy",
            director = "James Cameron",
            actors = "Sam Worthington, Zoe Saldana",
            plot = "A paraplegic marine dispatched to the moon Pandora on a unique mission becomes",
            poster = "https://picsum.photos/id/13/200/200",
            images = listOf(
                "https://picsum.photos/id/35/300/200",
                "https://picsum.photos/id/36/300/200",
                "https://picsum.photos/id/37/300/200",
                "https://picsum.photos/id/38/300/200",
                "https://picsum.photos/id/39/300/200",
            ),
            rating = "4.0"
        ),
        Movie(
            id = "tt0499545",
            title = "Avatar 5",
            year = "2009",
            genre = "Action, Adventure, Fantasy",
            director = "James Cameron",
            actors = "Sam Worthington, Zoe Saldana",
            plot = "A paraplegic marine dispatched to the moon Pandora on a unique mission becomes",
            poster = "https://picsum.photos/id/14/200/200",
            images = listOf(
                "https://picsum.photos/id/40/300/200",
                "https://picsum.photos/id/41/300/200",
                "https://picsum.photos/id/42/300/200",
                "https://picsum.photos/id/43/300/200",
                "https://picsum.photos/id/44/300/200",
            ),
            rating = "5.0"
        ),
        Movie(
            id = "tt0499546",
            title = "Avatar 6",
            year = "2009",
            genre = "Action, Adventure, Fantasy",
            director = "James Cameron",
            actors = "Sam Worthington, Zoe Saldana",
            plot = "A paraplegic marine dispatched to the moon Pandora on a unique mission becomes",
            poster = "https://picsum.photos/id/15/200/200",
            images = listOf(
                "https://picsum.photos/id/50/300/200",
                "https://picsum.photos/id/51/300/200",
                "https://picsum.photos/id/52/300/200",
                "https://picsum.photos/id/53/300/200",
                "https://picsum.photos/id/54/300/200",
            ),
            rating = "6.0"
        ),
        Movie(
            id = "tt0499547",
            title = "Avatar 7",
            year = "2009",
            genre = "Action, Adventure, Fantasy",
            director = "James Cameron",
            actors = "Sam Worthington, Zoe Saldana",
            plot = "A paraplegic marine dispatched to the moon Pandora on a unique mission becomes",
            poster = "https://picsum.photos/id/16/200/200",
            images = listOf(
                "https://picsum.photos/id/60/300/200",
                "https://picsum.photos/id/61/300/200",
                "https://picsum.photos/id/62/300/200",
                "https://picsum.photos/id/63/300/200",
                "https://picsum.photos/id/64/300/200",
            ),
            rating = "7.0"
        ),
        Movie(
            id = "tt0499548",
            title = "Avatar 8",
            year = "2009",
            genre = "Action, Adventure, Fantasy",
            director = "James Cameron",
            actors = "Sam Worthington, Zoe Saldana",
            plot = "A paraplegic marine dispatched to the moon Pandora on a unique mission becomes",
            poster = "https://picsum.photos/id/17/200/200",
            images = listOf(
                "https://picsum.photos/id/70/300/200",
                "https://picsum.photos/id/71/300/200",
                "https://picsum.photos/id/72/300/200",
                "https://picsum.photos/id/73/300/200",
                "https://picsum.photos/id/74/300/200",
            ),
            rating = "8.0"
        ),
        Movie(
            id = "tt0499549",
            title = "Avatar 9",
            year = "2009",
            genre = "Action, Adventure, Fantasy",
            director = "James Cameron",
            actors = "Sam Worthington, Zoe Saldana",
            plot = "A paraplegic marine dispatched to the moon Pandora on a unique mission becomes",
            poster = "https://picsum.photos/id/18/200/200",
            images = listOf(
                "https://picsum.photos/id/80/300/200",
                "https://picsum.photos/id/81/300/200",
                "https://picsum.photos/id/82/300/200",
                "https://picsum.photos/id/83/300/200",
                "https://picsum.photos/id/84/300/200",
            ),
            rating = "9.0"
        ),
        Movie(
            id = "tt0499550",
            title = "Avatar 10",
            year = "2009",
            genre = "Action, Adventure, Fantasy",
            director = "James Cameron",
            actors = "Sam Worthington, Zoe Saldana",
            plot = "A paraplegic marine dispatched to the moon Pandora on a unique mission becomes",
            poster = "https://picsum.photos/id/19/200/200",
            images = listOf(
                "https://picsum.photos/id/90/300/200",
                "https://picsum.photos/id/91/300/200",
                "https://picsum.photos/id/92/300/200",
                "https://picsum.photos/id/93/300/200",
                "https://picsum.photos/id/94/300/200",
            ),
            rating = "10.0"
        ),
    )
}
