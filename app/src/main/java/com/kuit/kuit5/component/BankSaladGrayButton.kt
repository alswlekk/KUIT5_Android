package com.kuit.kuit5.component

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit5.ui.theme.BankSaladTheme.typography
import java.util.EventListener

@Composable
fun BankSaladGrayButton(text : String,modifier: Modifier = Modifier, onClick: () -> Unit) {
    Button(
        modifier = Modifier
            .size(58.dp, 38.dp)
            ,
        contentPadding = PaddingValues(0.dp),
        shape = RoundedCornerShape(6.dp),
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFFF3F4F6),
            contentColor = Color(0xFF666668),

            )
    ) {
        Text(text = text, fontSize = 14.sp, fontWeight = FontWeight.SemiBold, style = typography.head_04_SB_14 )
    }
}

@Preview
@Composable
private fun BankSaladGrayButtonPreview() {
    BankSaladGrayButton(text = "송금", onClick = {})
}