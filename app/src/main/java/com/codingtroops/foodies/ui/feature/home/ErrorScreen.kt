package com.codingtroops.foodies.ui.feature.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import androidx.compose.ui.Alignment.Companion.Bottom
import androidx.compose.ui.Alignment.Companion.BottomCenter
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
import com.codingtroops.foodies.ui.NavigationKeys
import com.codingtroops.foodies.ui.components.CustomButton2
import com.codingtroops.foodies.ui.components.RowError
import com.codingtroops.foodies.ui.theme.ComposeSampleTheme
import com.codingtroops.foodies.utils.Fonts

@Composable
fun ErrorScreen(navController: NavController? = null) {
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
                .wrapContentWidth()
                .fillMaxHeight()
           , contentAlignment = BottomCenter
        ) {
            Column(
                modifier = Modifier
                    .wrapContentWidth()
                    .wrapContentHeight()
            ) {
                Column(modifier = Modifier
                    .wrapContentWidth()
                    .wrapContentHeight()
                ) {
                    Image(
                        painterResource(id = R.drawable.error1),
                        contentDescription = "Logo",
                        modifier = Modifier
                            .height(80.dp)
                            .width(80.dp)
                            .align(CenterHorizontally)


                    )
                    Spacer(modifier = Modifier.height(20.dp))

                    Text(
                        text = "Under Verification",
                        fontFamily = Fonts.PoppinsBold,
                        fontSize = 16.sp,
                        color = Color(0xffC53F3F),
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center
                    )
                    Spacer(modifier = Modifier.height(40.dp))

                    Box(modifier = Modifier.fillMaxWidth().height(1.dp)
                        .padding(start = 20.dp, end = 20.dp
                        )
                        .background(color = Color(0xffF0F0F0))) {

                    }
                    Spacer(modifier = Modifier.height(40.dp))

                    RowError(number = 1, contentText = "Please upload proper scan copy of license.")
                    Spacer(modifier = Modifier.height(20.dp))
                    RowError(number = 2, contentText = "Please upload proper scan copy of license.")
                    Spacer(modifier = Modifier.height(20.dp))
                    RowError(number = 3, contentText = "Please upload proper scan copy of license.")

                }
                Spacer(modifier = Modifier.height(100.dp))

                Row(modifier = Modifier.fillMaxWidth() ,horizontalArrangement = Arrangement.Center) {
                    CustomButton2(text = "Update", onClick = {
                        navController?.navigate(NavigationKeys.Route.VEH_DETAILS_SCREEN)
                    })

                }
                Spacer(modifier = Modifier.height(150.dp))

            }


        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview9() {
    ComposeSampleTheme {
        ErrorScreen()
    }
}