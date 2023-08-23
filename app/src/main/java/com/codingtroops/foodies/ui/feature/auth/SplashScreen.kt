package com.codingtroops.foodies.ui.feature.auth

import android.os.CountDownTimer
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import coil.annotation.ExperimentalCoilApi
import com.codingtroops.foodies.R

@ExperimentalCoilApi
@Composable
fun SplashScreen(navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.secondary)
    ) {
        Image(
            painterResource(id = R.drawable.logo),
            contentDescription = "Logo",
            modifier = Modifier
                .height(150.dp)
                .width(150.dp)
                .align(Alignment.Center)

        )
        Button(
            onClick = { navController.navigate("login") },
            modifier = Modifier.align(Alignment.BottomCenter)
        ) {

        }
    }
    callLoginScreen(navController)
}

fun callLoginScreen(navController: NavHostController) {
    object : CountDownTimer(3000, 1000) {
        override fun onTick(p0: Long) {


        }

        override fun onFinish() {
        }

    }

}
