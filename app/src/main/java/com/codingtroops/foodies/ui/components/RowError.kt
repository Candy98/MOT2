package com.codingtroops.foodies.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.codingtroops.foodies.ui.feature.home.ErrorScreen
import com.codingtroops.foodies.ui.theme.ComposeSampleTheme
import com.codingtroops.foodies.utils.Fonts

@Composable
fun RowError(number:Int=1,contentText:String=""){
    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
        Box (   modifier = Modifier

            .width(20.dp)
            .height(20.dp)
            .clip(shape = RoundedCornerShape(20.dp))
            .background(Color(0xffECEDF2), shape = RoundedCornerShape(20.dp)),
            contentAlignment = Alignment.Center
        ){
            Text(
                text = number.toString(),
                fontFamily = Fonts.Poppins,
                fontSize = 14.sp,
                color = Color(0xffE96A2E),


                )
        }
        Spacer(modifier = Modifier.width(10.dp))
        Text(
            text = contentText,
            fontFamily = Fonts.Poppins,
            fontSize = 12.sp,
            color = Color(0xff2E3E5C),


            )
    }

}
@Preview(showBackground = true)
@Composable
fun DefaultPreview10() {
    ComposeSampleTheme {
        RowError(contentText = "Please upload proper scan copy of license.")
    }
}