package com.codingtroops.foodies.ui.feature.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.codingtroops.foodies.R
import com.codingtroops.foodies.ui.components.CustomButton2
import com.codingtroops.foodies.ui.feature.auth.AddVehicleDetailsScreen
import com.codingtroops.foodies.ui.theme.ComposeSampleTheme
import com.codingtroops.foodies.utils.Fonts

@Composable
fun DashboardScreen(navController: NavController? = null) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)

    ) {
        Box(
            modifier = Modifier
                .wrapContentHeight()
                .fillMaxWidth(),


            ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(130.dp)
                    .background(color = Color.Black)
                    .graphicsLayer {
                        shadowElevation = 8.dp.toPx()
                        shape = CutCornerShape(32.dp)
                        clip = true
                    },

                )
            Box(
                modifier = Modifier
                    .height(130.dp)
                    .wrapContentWidth()
                    .padding(start = 20.dp, end = 20.dp),
                contentAlignment = Alignment.CenterStart


            ) {
                Column(
                    modifier = Modifier
                        .wrapContentWidth()
                ) {
                    Text(
                        text = "Welcome,",
                        fontFamily = Fonts.Poppins,
                        fontSize = 14.sp,
                        color = Color.White,
                    )
                    Text(
                        text = "John Doe",
                        fontFamily = Fonts.PoppinsBold,
                        fontSize = 24.sp,
                        color = Color.White,


                        )
                }


            }
        }
        Box(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(),
            Center
        ) {
            Column {
                Image(
                    painterResource(id = R.drawable.error),
                    contentDescription = "Logo",
                    modifier = Modifier
                        .height(60.dp)
                        .width(60.dp)
                        .align(CenterHorizontally)


                )
                Spacer(modifier = Modifier.height(20.dp))

                Text(
                    text = "Under Verification",
                    fontFamily = Fonts.PoppinsBold,
                    fontSize = 16.sp,
                    color = Color(0xff000000),
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
                Text(
                    text = "You can get access once your\ndocuments have been verified.",
                    fontFamily = Fonts.Poppins,
                    fontSize = 12.sp,
                    color = Color(0xff404444),
                    modifier = Modifier.fillMaxWidth(),

                    textAlign = TextAlign.Center


                    )

            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview8() {
    ComposeSampleTheme {
        DashboardScreen()
    }
}