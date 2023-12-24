package com.example.movieapp.screens.home

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.movieapp.model.Movie
import com.example.movieapp.model.getMovies
import com.example.movieapp.navigation.MovieScreens
import com.example.movieapp.widgets.MovieRow

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController : NavController){
    Scaffold(
        topBar = {
            TopAppBar(
                modifier = Modifier
                    .height(60.dp)
                    .padding(vertical = 6.dp, horizontal = 9.dp)
                    .clip(shape = RoundedCornerShape(16.dp))
                    .border(
                        width = 2.dp,
                        color = Color.DarkGray,
                        shape = RoundedCornerShape(16.dp)
                    )
                    .background(color = Color.Transparent)
                    .shadow(4.dp),
                navigationIcon = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector = Icons.Default.Menu,
                            contentDescription = "Menu",
                            tint = Color.Black
                        )
                    }
                },
                actions = {
                    IconButton(
                        modifier = Modifier
                            .fillMaxHeight(),
                        onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector = Icons.Default.Add,
                            contentDescription = "Menu",
                            tint = Color.Black
                        )
                    }
                    IconButton(
                        modifier = Modifier
                            .fillMaxHeight(),
                        onClick = { /*TODO*/ }
                    ) {
                        Icon(
                            imageVector = Icons.Default.AccountCircle,
                            contentDescription = "Menu",
                            tint = Color.Black
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.LightGray,
                    titleContentColor = Color.Black,
                ),
                title = {
                    Row(
                        modifier = Modifier
                            .fillMaxHeight(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Movie",
                            softWrap = true,
                            style = TextStyle(
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Medium
                            )
                        )
                    }
                }
            )
        },
        bottomBar = {
            BottomAppBar(
                modifier = Modifier
                    .height(40.dp)
                    .padding(horizontal = 0.dp, vertical = 0.dp),
//                    .clip(shape = RoundedCornerShape(12.dp)),
                containerColor = Color.LightGray,
                contentColor = Color(0xFF000000)
            ) {
                Row (
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Text(
                        modifier = Modifier
                            .fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        text = "Navigation",
                        softWrap = true,
                        style = TextStyle(
                            fontSize = 20.sp,
                            fontWeight = FontWeight.W500
                        )
                    )
                }
            }
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {},
                modifier = Modifier
                    .size(45.dp),
                containerColor = Color.LightGray,
                contentColor = Color(0xFF000000)
            ) {
                Icon(imageVector = Icons.Default.Add, contentDescription = "Add")
            }
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding),
            // verticalArrangement = Arrangement.spacedBy(1.dp)
        ) {
//            content()
            MainContent(navController = navController)
        }
    }
}

@Composable
fun MainContent(
    navController: NavController,
    movieList: List<Movie> = getMovies()
) {
    Row(
        modifier = Modifier
    ) {
        LazyRow(
            modifier = Modifier
        ) {
            items(items = movieList) {
                MovieRow(movie = it){movieName->
                    Log.d("movie", "movie : $movieName")
                    navController.navigate(route = MovieScreens.DetailsScreen.name+"/$movieName")
                }
            }
        }
    }
    Column(
        modifier = Modifier
            .background(Color.Gray)
    ) {
        LazyColumn {
            items(items = movieList) {
                MovieRow(movie = it){movieName->
                    navController.navigate(route = MovieScreens.DetailsScreen.name+"/$movieName")
                }
            }
        }
    }
}