package com.kuit.kuit5.ui.home.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit5.R
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors
import com.kuit.kuit5.ui.theme.BankSaladTheme.typography
import com.kuit.kuit5.ui.theme.defaultBankSaladTypography
import com.kuit.kuit5.util.toDecimalFormat
import java.nio.file.Files.size

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(modifier: Modifier = Modifier) {

    val scrollState = rememberScrollState()
    val pagerState = rememberPagerState(pageCount = { 5 })
//    val coroutineScope = rememberCoroutineScope()

    Column(modifier = modifier
        .fillMaxSize()
        .background(colors.gray100)
        ) {
        TopAppBar(
            modifier = Modifier.fillMaxWidth(),
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = colors.gray100
            ),
            title = {
                Icon(painter = painterResource(id = R.drawable.img_home_bank_salad_icon),
                    contentDescription = "bank salad icon",
                    tint = Color.Unspecified,
                    modifier = Modifier.size(24.dp))
            },
            actions = {
                Row(modifier = Modifier.padding(20.dp),
                    horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_assets_bell),
                        contentDescription = "bell icon",
                        tint = Color(color = 0xFF9FA5B0)
                    )
                    Icon(
                        painter = painterResource(id = R.drawable.ic_assets_stack),
                        contentDescription = "stack icon",
                        tint = Color(color = 0xFF9FA5B0)
                    )
                }
            }
        )

        Column(modifier = Modifier
            .fillMaxWidth()
            .verticalScroll(state = scrollState)) {
            HorizontalPager(
                state = pagerState,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp)
            ) { }
        }

//        Text(
//            text = 1000000.toDecimalFormat(),
//            style = typography.head_03_B_16,
//            color = colors.green
//            )
    }
}

@Preview
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}