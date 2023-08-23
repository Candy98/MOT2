package com.codingtroops.foodies.ui.feature.auth

import android.provider.ContactsContract.CommonDataKinds.Email
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Alignment.Companion.CenterStart
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.NavController
import coil.compose.rememberImagePainter
import com.codingtroops.foodies.R
import com.codingtroops.foodies.ui.components.CustomButton2
import com.codingtroops.foodies.ui.components.CustomEditText
import com.codingtroops.foodies.ui.feature.categories.FoodCategoriesContract
import com.codingtroops.foodies.ui.feature.categories.FoodCategoriesScreen
import com.codingtroops.foodies.ui.theme.ComposeSampleTheme
import com.codingtroops.foodies.utils.Fonts

@Composable
fun LoginScreen(navController: NavController? = null) {
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
                    .height(200.dp)
                    .background(color = Color.Black)
                    .graphicsLayer {
                        shadowElevation = 8.dp.toPx()
                        shape = CutCornerShape(32.dp)
                        clip = true
                    },

                )
            Box(
                modifier = Modifier
                    .height(200.dp)
                    .wrapContentWidth()
                    .padding(start = 20.dp, end = 20.dp),
                contentAlignment = CenterStart


            ) {
                Column(
                    modifier = Modifier
                        .wrapContentWidth()
                ) {
                    Text(
                        text = "Login",
                        fontFamily = Fonts.PoppinsBold,
                        fontSize = 24.sp,
                        color = Color.White,
                    )
                    Text(
                        text = "Lorem Ipsum is simply dummy text of the \nprinting and typesetting industry. ",
                        fontFamily = Fonts.Poppins,
                        fontSize = 14.sp,
                        color = Color.White,


                        )
                }


            }
        }
        Column(
            modifier = Modifier
                .padding(start = 20.dp, end = 20.dp)
                .fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(30.dp))
            CustomEditText(text = "Username", type = KeyboardType.Email)
            Spacer(modifier = Modifier.height(8.dp))
            CustomEditText(text = "Password", type = KeyboardType.Password)
            Spacer(modifier = Modifier.height(30.dp))
            CustomButton2(text = "Login", onClick = {})
            Spacer(modifier = Modifier.height(30.dp))
            Text(
                text = "Forgot Password?",
                fontFamily = Fonts.Poppins,
                fontSize = 14.sp,
                color = Color(0xff404444),


                )
            ClickableText(
                text = AnnotatedString("Don’t have an account? Create an account"),
                onClick = {
                    navController?.navigate("registration")
                },
                style = TextStyle(
                    color = Color(0xff404444),
                    fontSize = 14.sp,
                    fontFamily = Fonts.Poppins
                )




                )

        }

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeSampleTheme {
        LoginScreen()
    }
}