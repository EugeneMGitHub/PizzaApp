package com.example.pizzaapp.presentation.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pizzaapp.R
import com.example.pizzaapp.presentation.ui.theme.PizzaAppTheme
import com.example.pizzaapp.util.BanersWithInfo

@Composable
fun BannerItem(
    modifier: Modifier = Modifier,
    banerItem: BanersWithInfo,
    onBanerItemClick: () -> Unit = {}
) {
        Card(
            modifier
                .clickable { onBanerItemClick() }
                .height(120.dp)
                .width(300.dp),
//        colors = CardDefaults.cardColors(
//            containerColor = Color.DarkGray
//        )
        ){

            Image(
                painter = painterResource(id = banerItem.imageResourceId),
                contentDescription = banerItem.banerInfo,
                modifier = Modifier
                    .height(500.dp),
                contentScale = ContentScale.Crop
            )


        }


}


@Preview(showBackground = true)
@Composable
fun BannerItemPreview() {
    PizzaAppTheme {
        BannerItem(
            banerItem =  BanersWithInfo(banerInfo = "FirstBaner", imageResourceId = R.drawable.pizzabannermain)
        )
    }
}