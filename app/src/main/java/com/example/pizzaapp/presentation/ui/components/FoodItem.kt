package com.example.pizzaapp.presentation.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Row

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment

import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale

import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.pizzaapp.presentation.ui.theme.PizzaAppTheme
import com.example.pizzaapp.presentation.ui.theme.mainRedColor
import com.example.pizzaapp.util.FoodInfoNetwork


@Composable
fun FoodItem(
    modifier: Modifier = Modifier,
    foodInfo: FoodInfoNetwork
){

    val buttonShape = RoundedCornerShape(10.dp)

    Row(
        modifier = modifier
            .padding(
            top = 20.dp,
            bottom = 20.dp)
            .height(170.dp)
    ){

        AsyncImage(
            model = foodInfo.image,
            contentDescription = null,
            modifier = Modifier
                .size(170.dp)
                .clip(MaterialTheme.shapes.medium),
            contentScale = ContentScale.FillBounds
        )

        Column (
            modifier = Modifier
                .fillMaxHeight()
                .padding(start = 15.dp, top = 0.dp, end = 0.dp)
            ,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = foodInfo.name,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                maxLines = 1,
            )

            val productDescription = "${foodInfo.name} имеет id = ${foodInfo.description} поэтому, если Вам нужно узнать какой Id у блюда..."
            Text(text = productDescription,
                color = Color.Gray,
                maxLines = 4,
                lineHeight = 20.sp,
            )

            Spacer(modifier = Modifier
                .padding(top = 15.dp)
                .weight(1f))

            OutlinedButton(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .align(Alignment.End),
                shape = buttonShape,
                border = BorderStroke(0.8.dp, Color.Red)

            ) {
                Text(
                    text = "от 345 р",
                    color = mainRedColor
                )
            }


        }





    }

}




//@Preview(showBackground = true)
//@Composable
//fun FoodItemPreview() {
//    PizzaAppTheme {
//        FoodItem(
//
//            FoodInfo("Ветчина и грибы", "Ветчина,шампиньоны, увеличинная порция моцареллы, томатный соус",
//                image = R.drawable.pizza1
//            )
//
//
//        )
//    }
//}



@Preview(showBackground = true)
@Composable
fun FoodItemPreview() {
    PizzaAppTheme {
        FoodItem(
            modifier = Modifier,
            FoodInfoNetwork("Ветчина и грибы", "Ветчина,шампиньоны, увеличинная порция моцареллы, томатный соус",
                "https://www.themealdb.com/images/media/meals/adxcbq1619787919.jpg"
            )


        )
    }
}