package com.kuit.kuit5.ui.home.component

import android.R.attr.text
import android.R.attr.top
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit5.R
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors
import com.kuit.kuit5.ui.theme.BankSaladTheme.typography

@Composable
fun HomeBannerItem(infoText: String, mainText : String,bannerIcon : Int,modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(
            modifier = modifier.padding(start = 16.dp,top = 12.dp, bottom = 14.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        )
        {
            Text(
                text = infoText,
                style = typography.caption_01_R_10,
                color = colors.gray500,
                fontSize = 10.sp
            )

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = mainText,
                    style = typography.head_04_SB_14,
                    fontSize = 14.sp,
                    color = colors.black
                )
                Spacer(modifier = modifier.width(2.dp))
                Icon(
                    painter = painterResource(id = R.drawable.ic_asset_right_arrow),
                    contentDescription = "home banner right arrow icon",
                    tint = colors.black,
                )
            }

        }
        Icon(
            painter = painterResource(id = bannerIcon),
            contentDescription = "home banner icon",
            tint = colors.black,
            modifier = modifier
                .padding(end = 16.dp)
                .width(40.dp)
        )
    }
}

@Preview
@Composable
private fun HomeBannerItemPreview() {
    HomeBannerItem("3월에만 받을 수 있는","최대 17만원 용돈 받기",
        R.drawable.img_home_bank_salad_icon,
        modifier = Modifier.fillMaxWidth()
    )
}