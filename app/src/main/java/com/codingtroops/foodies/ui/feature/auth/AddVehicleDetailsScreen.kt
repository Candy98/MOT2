package com.codingtroops.foodies.ui.feature.auth

import android.provider.ContactsContract.CommonDataKinds.Email
import androidx.compose.foundation.BorderStroke
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
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
import com.codingtroops.foodies.ui.NavigationKeys
import com.codingtroops.foodies.ui.components.CustomButton2
import com.codingtroops.foodies.ui.components.CustomEditText
import com.codingtroops.foodies.ui.components.DropDownMenu
import com.codingtroops.foodies.ui.feature.categories.FoodCategoriesContract
import com.codingtroops.foodies.ui.feature.categories.FoodCategoriesScreen
import com.codingtroops.foodies.ui.theme.ComposeSampleTheme
import com.codingtroops.foodies.utils.Fonts

@Composable
fun AddVehicleDetailsScreen(navController: NavController? = null) {
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
                    .clip(shape = RoundedCornerShape(10.dp))


            )
            Column(modifier = Modifier.padding(start = 20.dp)) {
                Spacer(modifier = Modifier.height(20.dp))

                Image(
                    painterResource(id = R.drawable.group),
                    contentDescription = "Logo",
                    modifier = Modifier
                        .height(18.dp)
                        .width(18.dp)


                )
            }

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
                    Spacer(modifier = Modifier.height(20.dp))

                    Text(
                        text = "Add Vehicle details",
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
                .fillMaxWidth()
                .verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(20.dp))
            DropDownMenu(listOf("Type1", "Type2"), "Type")
            Spacer(modifier = Modifier.height(8.dp))
            CustomEditText(text = "Make", type = KeyboardType.Email)
            Spacer(modifier = Modifier.height(8.dp))
            CustomEditText(text = "Model", type = KeyboardType.Text)
            Spacer(modifier = Modifier.height(8.dp))
            DropDownMenu(listOf("2000", "2001"), "Year")
            Spacer(modifier = Modifier.height(8.dp))
            CustomEditText(text = "License Number", type = KeyboardType.Number)
            Spacer(modifier = Modifier.height(8.dp))

            Spacer(modifier = Modifier.height(4.dp))
            Column {
                Text(
                    text = "Upload License Image",
                    fontFamily = Fonts.PoppinsBold,
                    fontSize = 14.sp,
                    color = Color(0xff404444),
                )
                Box(
                    modifier = Modifier
                        .border(1.dp, Color(0xffC1C1C1), shape = RoundedCornerShape(6.dp))
                        .height(130.dp)
                        .fillMaxWidth(),

                    ) {
                    Image(
                        painterResource(id = R.drawable.upload),
                        contentDescription = "Logo",
                        modifier = Modifier
                            .height(30.dp)
                            .width(30.dp)
                            .align(Center)


                    )

                }
            }
            Spacer(modifier = Modifier.height(8.dp))

            Spacer(modifier = Modifier.height(4.dp))
            Column {
                Text(
                    text = "Upload Vehicle Image",
                    fontFamily = Fonts.PoppinsBold,
                    fontSize = 14.sp,
                    color = Color(0xff404444),
                )
                Box(
                    modifier = Modifier
                        .border(1.dp, Color(0xffC1C1C1), shape = RoundedCornerShape(6.dp))
                        .height(130.dp)
                        .fillMaxWidth(),

                    ) {
                    Image(
                        painterResource(id = R.drawable.upload),
                        contentDescription = "Logo",
                        modifier = Modifier
                            .height(30.dp)
                            .width(30.dp)
                            .align(Center)


                    )

                }
            }
            Spacer(modifier = Modifier.height(8.dp))
            CustomEditText(text = "Registration Number", type = KeyboardType.Email)
            Spacer(modifier = Modifier.height(8.dp))

            Spacer(modifier = Modifier.height(4.dp))
            Column {
                Text(
                    text = "Upload Registration Document Image",
                    fontFamily = Fonts.PoppinsBold,
                    fontSize = 14.sp,
                    color = Color(0xff404444),
                )
                Box(
                    modifier = Modifier
                        .border(1.dp, Color(0xffC1C1C1), shape = RoundedCornerShape(6.dp))
                        .height(130.dp)
                        .fillMaxWidth(),

                    ) {
                    Image(
                        painterResource(id = R.drawable.upload),
                        contentDescription = "Logo",
                        modifier = Modifier
                            .height(30.dp)
                            .width(30.dp)
                            .align(Center)


                    )

                }
            }
            Spacer(modifier = Modifier.height(30.dp))

            CustomButton2(text = "Sign Up", onClick = {
            navController?.navigate(NavigationKeys.Route.HOME_SCREEN)
            }

            )
            Spacer(modifier = Modifier.height(30.dp))

        }

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview4() {
    ComposeSampleTheme {
        AddVehicleDetailsScreen()
    }
}