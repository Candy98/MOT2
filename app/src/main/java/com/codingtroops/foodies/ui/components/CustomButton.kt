package com.codingtroops.foodies.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.codingtroops.foodies.utils.Fonts

@Composable
fun CustomButton(text:String, onClick: (() -> Unit)? = null){
    OutlinedButton(
        onClick = { onClick?.invoke()},
        border = BorderStroke(1.dp, Color.White),
        shape = RoundedCornerShape(50),
        colors = ButtonDefaults.outlinedButtonColors(
            backgroundColor = Color(0xFF0D0D0D),
            contentColor = Color.White
        ),
        modifier = Modifier.width(230.dp)
    ) {
        Text(text = text, fontFamily = Fonts.Poppins, fontSize = 14.sp, modifier = Modifier.align(CenterVertically).padding(4.dp))
    }
}