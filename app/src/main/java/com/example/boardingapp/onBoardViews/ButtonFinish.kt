package com.example.boardingapp.onBoardViews

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.boardingapp.dataStore.StoreBoarding

@Composable
fun ButtonFinish ( currentPage: Int, navController: NavController, store: StoreBoarding ) {
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .padding ( bottom = 20.dp ),
        horizontalArrangement = if ( currentPage != 2 ) Arrangement.SpaceBetween else Arrangement.Center
    ) {
        if ( currentPage == 2 ) {
            OutlinedButton ( onClick = { navController.navigate( "home" ) { popUpTo( 0 ) } } ) {
                Text (
                    text = "Entrar",
                    modifier = Modifier
                        .padding ( horizontal = 40.dp, vertical = 8.dp )
                )
            }
        }
    }
}