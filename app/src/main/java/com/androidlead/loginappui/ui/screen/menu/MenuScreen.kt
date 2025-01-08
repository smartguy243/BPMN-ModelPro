package com.androidlead.loginappui.ui.screen.menu

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.androidlead.loginappui.R
import com.androidlead.loginappui.ui.components.ActionButton
import com.androidlead.loginappui.ui.screen.container.NavGraph
import com.androidlead.loginappui.ui.theme.DarkTextColor
import com.androidlead.loginappui.ui.theme.PrimaryPinkBlended
import com.androidlead.loginappui.ui.theme.PrimaryYellow
import com.androidlead.loginappui.ui.theme.PrimaryYellowDark
import com.androidlead.loginappui.ui.theme.PrimaryYellowLight

@Composable
fun MenuScreen(
               onLoginClicked: () -> Unit){

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    0f to PrimaryPinkBlended,
                    0.6f to PrimaryYellowLight,
                    1f to PrimaryYellow
                )
            )
            .systemBarsPadding(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacer(modifier = Modifier.height(15.dp))

        Row (modifier = Modifier.fillMaxWidth()){

            Spacer(modifier = Modifier.width(240.dp))

            ActionButton(
                text = "Logout",
                isNavigationArrowVisible = true,
                onClicked = onLoginClicked,
                colors = ButtonDefaults.buttonColors(
                    containerColor = PrimaryYellowDark,
                    contentColor = DarkTextColor
                ),
                shadowColor = PrimaryYellowDark,
                modifier = Modifier.padding(end = 15.dp)
                                   .height(35.dp)
                                   .shadow(
                        elevation = 24.dp,
                        shape = RoundedCornerShape(percent = 50)
                    ),
            )
        }

        Spacer(modifier = Modifier.height(30.dp))

        Text(
            text = "BPMN ModelPro",
            style = MaterialTheme.typography.headlineLarge,
            fontWeight = FontWeight.Black,
            modifier = Modifier.padding(horizontal = 24.dp),
            color = DarkTextColor
        )

        Spacer(modifier = Modifier.height(15.dp))

        Text(text ="Design smarter processes from your pocket.",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center)

        Spacer(modifier = Modifier.height(25.dp))

        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically) {

            Column(
                modifier = Modifier
                    .size(115.dp)
                    .background(color = Color.LightGray.copy(alpha = 0.3f))
                    .clickable {},
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Image(
                    painter = painterResource(id = R.drawable.bpmn),
                    contentDescription = "Builder",
                    modifier = Modifier.size(62.dp)
                        .padding(top = 15.dp)
                )

                Spacer(modifier = Modifier.height(19.dp))

                Text(text ="Build Model",
                    modifier = Modifier.fillMaxWidth(),
                    fontSize = 14.sp,
                    textAlign = TextAlign.Center)
            }

            Column(
                modifier = Modifier
                    .size(115.dp)
                    .background(Color.LightGray.copy(alpha = 0.3f))
                    .clickable {},
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Image(
                    painter = painterResource(id = R.drawable.loupe),
                    contentDescription = "Search",
                    modifier = Modifier.size(50.dp)
                        .padding(top = 15.dp)
                )

                Spacer(modifier = Modifier.height(30.dp))

                Text(text ="Search",
                    modifier = Modifier.fillMaxWidth(),
                    fontSize = 14.sp,
                    textAlign = TextAlign.Center)
            }

            Column(
                modifier = Modifier
                    .size(115.dp)
                    .background(Color.LightGray.copy(alpha = 0.3f))
                    .clickable { },
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Image(
                    painter = painterResource(id = R.drawable.pencil),
                    contentDescription = "Textes surlignés",
                    modifier = Modifier.size(50.dp)
                        .padding(top = 15.dp)
                )

                Spacer(modifier = Modifier.height(30.dp))

                Text(text ="Edit Model",
                    modifier = Modifier.fillMaxWidth(),
                    fontSize = 14.sp,
                    textAlign = TextAlign.Center)
            }
        }

        Spacer(modifier = Modifier.height(4.dp))

        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically) {

            Column(
                modifier = Modifier
                    .size(115.dp)
                    .background(Color.LightGray.copy(alpha = 0.3f))
                    .clickable { },
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Image(
                    painter = painterResource(id = R.drawable.view),
                    contentDescription = "historique",
                    modifier = Modifier.size(55.dp)
                        .padding(top = 15.dp)
                )

                Spacer(modifier = Modifier.height(25.dp))

                Text(text ="View Model",
                    modifier = Modifier.fillMaxWidth(),
                    fontSize = 14.sp,
                    textAlign = TextAlign.Center)
            }

            Column(
                modifier = Modifier
                    .size(115.dp)
                    .background(Color.LightGray.copy(alpha = 0.3f))
                    .clickable { },
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Image(
                    painter = painterResource(id = R.drawable.settings),
                    contentDescription = "Favorites",
                    modifier = Modifier.size(50.dp)
                        .padding(top = 15.dp)
                )

                Spacer(modifier = Modifier.height(30.dp))

                Text(text ="Settings",
                    modifier = Modifier.fillMaxWidth(),
                    fontSize = 14.sp,
                    textAlign = TextAlign.Center)
            }

            Column(
                modifier = Modifier
                    .size(115.dp)
                    .background(Color.LightGray.copy(alpha = 0.3f))
                    .clickable { },
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Image(
                    painter = painterResource(id = R.drawable.learn),
                    contentDescription = "notes",
                    modifier = Modifier.size(55.dp)
                        .padding(top = 10.dp)
                )

                Spacer(modifier = Modifier.height(25.dp))

                Text(text ="Learn BPMN",
                    modifier = Modifier.fillMaxWidth(),
                    fontSize = 14.sp,
                    textAlign = TextAlign.Center)
            }
        }

        Spacer(modifier = Modifier.height(220.dp))

        Text(text ="La langue n'a pas été sélectionnée   v1.2.0",
            modifier = Modifier.fillMaxWidth(),
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center)

        Spacer(modifier = Modifier.height(10.dp))

        Row(modifier = Modifier
            .padding(horizontal = 110.dp)
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Card(modifier = Modifier.size(40.dp)
                .background(Color.LightGray),
                colors = CardDefaults.cardColors(
                    containerColor = Color.LightGray.copy(alpha = 0.2f)),
                shape = RoundedCornerShape(0.dp)
            ) {

                Image(
                    painter = painterResource(id = R.drawable.world),
                    contentDescription = "languages",
                    modifier = Modifier.size(30.dp)
                        .padding(start = 10.dp, top = 10.dp)
                        .background(Color.LightGray)
                        .clickable { })
            }

            Card(modifier = Modifier.size(40.dp)
                .background(Color.LightGray),
                colors = CardDefaults.cardColors(
                    containerColor = Color.LightGray.copy(alpha = 0.2f)),
                shape = RoundedCornerShape(0.dp)
            ) {

                Image(
                    painter = painterResource(id = R.drawable.moon),
                    contentDescription = "light",
                    modifier = Modifier.size(30.dp)
                        .background(Color.LightGray)
                        .padding(start = 10.dp, top = 10.dp)
                        .clickable { })
            }

            Card(modifier = Modifier.size(40.dp)
                .background(Color.LightGray),
                colors = CardDefaults.cardColors(
                    containerColor = Color.LightGray.copy(alpha = 0.8f)),
                shape = RoundedCornerShape(0.dp)
            ) {

                Image(
                    painter = painterResource(id = R.drawable.info),
                    contentDescription = "infos",
                    modifier = Modifier.size(30.dp)
                        .background(Color.LightGray)
                        .padding(start = 10.dp, top = 10.dp)
                        .clickable { }
                )
            }

        }
    }
}