package com.codingtroops.foodies.ui.feature.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.codingtroops.foodies.R
import com.codingtroops.foodies.ui.theme.ComposeSampleTheme
import com.codingtroops.foodies.utils.Fonts

@Composable
fun HomeScreen(navController: NavController? = null) {
    Column(modifier = Modifier.background(color = Color.White)) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.35f)
                .clip(shape = RoundedCornerShape(bottomStart = 20.dp, bottomEnd = 20.dp))
                .background(
                    Color(0xff0D0D0D),
                    shape = RoundedCornerShape(bottomStart = 20.dp, bottomEnd = 20.dp)
                ),
            contentAlignment = Alignment.CenterStart
        ) {

            Row() {
                Spacer(modifier = Modifier.width(8.dp))
                Box(
                    modifier = Modifier
                        .fillMaxHeight()
                        .weight(0.18f),
                    contentAlignment = Alignment.CenterStart,
                ) {

                    Image(
                        painterResource(id = R.drawable.group),
                        contentDescription = "Logo",
                        modifier = Modifier
                            .wrapContentHeight()


                    )
                }
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight(), contentAlignment = Alignment.CenterStart
                ) {
                    Column(
                        modifier = Modifier


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

                Box(
                    modifier = Modifier
                        .fillMaxHeight()
                        .weight(0.4f), contentAlignment = Alignment.CenterEnd
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentHeight()
                    ) {

                        Spacer(modifier = Modifier.width(8.dp))
                        Image(
                            painterResource(id = R.drawable.error1),
                            contentDescription = "Logo",
                            modifier = Modifier.height(80.dp)


                        )
                    }

                }

            }

        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            Column {

            }
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {

        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview10() {
    ComposeSampleTheme {
        HomeScreen()
    }
}