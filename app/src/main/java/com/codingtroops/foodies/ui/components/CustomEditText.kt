package com.codingtroops.foodies.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedButton
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.codingtroops.foodies.R
import com.codingtroops.foodies.ui.theme.ComposeSampleTheme
import com.codingtroops.foodies.utils.Fonts

@Composable
fun CustomEditText(text:String,type:KeyboardType=KeyboardType.Text) {

    val textValue = remember {
        mutableStateOf("")
    }

    OutlinedTextField(
        label = {
            Text(
                text = text,
                style = TextStyle(
                    color = Color(0xFF404444),
                    fontFamily = Fonts.Poppins

                )
            )
        },

        placeholder = {
            Text(
                text = text,
                style = TextStyle(
                    color = Color(0xFFC1C1C1),
                    textAlign = TextAlign.Center,
                    fontFamily = Fonts.Poppins
                )
            )
        },
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor =Color(0xFFE96A2E),
            unfocusedBorderColor = Color(0xFFC1C1C1),
            focusedLabelColor = Color(0xFFC1C1C1),
            cursorColor =Color(0xFFE96A2E)
        ),

        keyboardOptions = KeyboardOptions.Default.copy(keyboardType =type),
        value = textValue.value,
        onValueChange = { textValue.value = it },
        modifier = Modifier.fillMaxWidth()
    )

}
@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    ComposeSampleTheme {
        CustomEditText(text = "Test")
    }
}