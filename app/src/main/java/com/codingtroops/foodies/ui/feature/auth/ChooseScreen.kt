package com.codingtroops.foodies.ui.feature.auth

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.codingtroops.foodies.R
import com.codingtroops.foodies.ui.components.CustomButton
import com.codingtroops.foodies.utils.Fonts

@Composable
fun ChooseScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background)
    ) {
        Box(
            modifier = Modifier
                .wrapContentHeight()
                .fillMaxWidth()
        ) {
            Image(
                painterResource(id = R.drawable.bg_upper_rounded),
                contentDescription = "Logo",

                modifier = Modifier
                    .fillMaxWidth()
                    .width(200.dp)
            )
            Image(
                painterResource(id = R.drawable.logo),
                contentDescription = "Logo",
                modifier = Modifier
                    .height(150.dp)
                    .width(150.dp)
                    .align(Alignment.Center)

            )

        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth()
                .align(Alignment.BottomCenter)

        ) {


            Text(
                text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
                fontFamily = Fonts.Poppins,
                fontSize = 12.sp,
                modifier = Modifier
                    .wrapContentHeight()
                    .width(250.dp)

                ,
                color = Color.White,
                textAlign = TextAlign.Center

            )


                Box(modifier = Modifier.height(10.dp))
                CustomButton(text = "Sign Up", onClick = { println("ButtonClicked!!") })
                Box(modifier = Modifier.height(5.dp))
                CustomButton(text = "Login", onClick = { navController.navigate("login2") })
            Box(modifier = Modifier.height(60.dp))




        }


    }
}