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
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
import com.androidlead.loginappui.R
import com.androidlead.loginappui.ui.components.ActionButton
import com.androidlead.loginappui.ui.components.LanguageOption
import com.androidlead.loginappui.ui.theme.CharcoalGray
import com.androidlead.loginappui.ui.theme.DarkTextColor
import com.androidlead.loginappui.ui.theme.LightLavender
import com.androidlead.loginappui.ui.theme.MintCream
import com.androidlead.loginappui.ui.theme.SoftBlue

@Composable
fun MenuScreen(onHomeClicked: () -> Unit,
               onLoginClicked: () -> Unit,
               onBuilderClicked: () -> Unit,
               onSettingsClicked: () -> Unit,
               onLearnClicked: () -> Unit,
               onSearchClicked: () -> Unit){
    var showDialog by remember { mutableStateOf(false) }
    var selectedLanguage by remember { mutableStateOf("Русский") }
    var isNightMode by remember { mutableStateOf(false)}

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    0f to LightLavender,
                    0.5f to MintCream,
                    1.3f to SoftBlue
                )
            )
            .systemBarsPadding(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacer(modifier = Modifier.height(15.dp))

        Row(modifier = Modifier.fillMaxWidth()) {

            Spacer(modifier = Modifier.width(240.dp))

            ActionButton(
                text = "Выйти",
                isNavigationArrowVisible = true,
                onClicked = onLoginClicked,
                colors = ButtonDefaults.buttonColors(
                    containerColor = MintCream,
                    contentColor = DarkTextColor
                ),
                shadowColor = DarkTextColor,
                modifier = Modifier.padding(end = 15.dp)
                    .height(35.dp)
                    .shadow(
                        elevation = 24.dp,
                        shape = RoundedCornerShape(percent = 50)
                    ),
            )
        }

        Spacer(modifier = Modifier.height(40.dp))

        Text(
            text = "BPMN ModelPro",
            style = MaterialTheme.typography.headlineLarge,
            fontWeight = FontWeight.Black,
            modifier = Modifier.padding(horizontal = 24.dp),
            color = DarkTextColor
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Создавайте интеллектуальные процессы\nпрямо со своего телефона.",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            color = CharcoalGray
        )

        Spacer(modifier = Modifier.height(30.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Card(
                modifier = Modifier.size(115.dp)
                    .clickable { },
                colors = CardDefaults
                    .cardColors(containerColor = Color.White),
                shape = RoundedCornerShape(30.dp),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 120.dp
                )
            ) {
                Column(
                    modifier = Modifier.fillMaxSize()
                        .clickable { onBuilderClicked() },
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.bpmn),
                        contentDescription = "Builder",
                        modifier = Modifier.size(62.dp)
                            .padding(top = 15.dp)
                    )

                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "Построить модель",
                        modifier = Modifier.fillMaxWidth(),
                        fontSize = 14.sp,
                        textAlign = TextAlign.Center
                    )
                }
            }

            Card(
                modifier = Modifier.size(115.dp)
                    .clickable { },
                colors = CardDefaults
                    .cardColors(containerColor = MintCream),
                shape = RoundedCornerShape(30.dp),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 120.dp
                )
            ) {
                Column(
                    modifier = Modifier
                        .size(115.dp)
                        .clickable {onSearchClicked()},
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Image(
                        painter = painterResource(id = R.drawable.loupe),
                        contentDescription = "Search",
                        modifier = Modifier.size(45.dp)
                            .padding(top = 10.dp)
                    )

                    Spacer(modifier = Modifier.height(15.dp))

                    Text(
                        text = "Поиск",
                        modifier = Modifier.fillMaxWidth(),
                        fontSize = 14.sp,
                        textAlign = TextAlign.Center
                    )
                }
            }

            Card(
                modifier = Modifier.size(115.dp)
                    .clickable { },
                colors = CardDefaults
                    .cardColors(containerColor = Color.White.copy(alpha = 0.9f)),
                shape = RoundedCornerShape(30.dp),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 120.dp
                )
            ) {
                Column(
                    modifier = Modifier.fillMaxSize()
                        .clickable { onBuilderClicked() },
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Image(
                        painter = painterResource(id = R.drawable.pencil),
                        contentDescription = "Textes surlignés",
                        modifier = Modifier.size(50.dp)
                            .padding(top = 15.dp)
                    )

                    Spacer(modifier = Modifier.height(18.dp))

                    Text(
                        text = "Редактировать модель",
                        modifier = Modifier.fillMaxWidth(),
                        fontSize = 14.sp,
                        textAlign = TextAlign.Center
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(4.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Card(
                modifier = Modifier.size(115.dp)
                    .clickable { },
                colors = CardDefaults
                    .cardColors(containerColor = MintCream),
                shape = RoundedCornerShape(30.dp),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 120.dp
                )
            ) {
                Column(
                    modifier = Modifier
                        .size(115.dp)
                        .clickable { onBuilderClicked() },
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Image(
                        painter = painterResource(id = R.drawable.view),
                        contentDescription = "historique",
                        modifier = Modifier.size(55.dp)
                            .padding(top = 15.dp)
                    )

                    Spacer(modifier = Modifier.height(12.dp))

                    Text(
                        text = "Просмотр модели",
                        modifier = Modifier.fillMaxWidth(),
                        fontSize = 14.sp,
                        textAlign = TextAlign.Center
                    )
                }
            }

            Card(
                modifier = Modifier.size(115.dp)
                    .clickable { },
                colors = CardDefaults
                    .cardColors(containerColor = Color.White.copy(alpha = 0.9f)),
                shape = RoundedCornerShape(30.dp),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 120.dp
                )
            ) {
                Column(
                    modifier = Modifier.fillMaxSize()
                        .clickable { onSettingsClicked() },
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Image(
                        painter = painterResource(id = R.drawable.settings),
                        contentDescription = "Favorites",
                        modifier = Modifier.size(45.dp)
                            .padding(top = 6.dp)
                    )

                    Spacer(modifier = Modifier.height(20.dp))

                    Text(
                        text = "Настройки",
                        modifier = Modifier.fillMaxWidth(),
                        fontSize = 14.sp,
                        textAlign = TextAlign.Center
                    )
                }
            }

            Card(
                modifier = Modifier.size(115.dp)
                    .clickable { },
                colors = CardDefaults
                    .cardColors(containerColor = MintCream),
                shape = RoundedCornerShape(30.dp),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 120.dp
                )
            ) {
                Column(
                    modifier = Modifier
                        .size(115.dp)
                        .clickable { onLearnClicked() },
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Image(
                        painter = painterResource(id = R.drawable.learn),
                        contentDescription = "notes",
                        modifier = Modifier.size(55.dp)
                            .padding(top = 10.dp)
                    )

                    Spacer(modifier = Modifier.height(12.dp))

                    Text(
                        text = "Изучать BPMN",
                        modifier = Modifier.fillMaxWidth(),
                        fontSize = 14.sp,
                        textAlign = TextAlign.Center
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(165.dp))

        Text(
            text = "Текующая версия приложения v1.0.0",
            modifier = Modifier.fillMaxWidth(),
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            color = DarkTextColor
        )

        Spacer(modifier = Modifier.height(20.dp))

        Row(
            modifier = Modifier
                .padding(horizontal = 110.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Card(
                modifier = Modifier.size(40.dp)
                    .clickable { showDialog = true },
                colors = CardDefaults.cardColors(containerColor = MintCream),
                shape = RoundedCornerShape(20.dp),
                elevation = CardDefaults.cardElevation(defaultElevation = 15.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.world),
                    contentDescription = "languages",
                    modifier = Modifier.size(30.dp).padding(start = 10.dp, top = 10.dp)
                )
            }

            // Dialog for language selection
            if (showDialog) {
                AlertDialog(
                    onDismissRequest = { showDialog = false },
                    title = { Text("Выберите язык") },
                    text = {
                        Column {
                            LanguageOption("Русский", selectedLanguage) {
                                selectedLanguage = "Русский"
                                showDialog = false
                            }
                            LanguageOption("English", selectedLanguage) {
                                selectedLanguage = "English"
                                showDialog = false
                            }
                        }
                    },
                    confirmButton = {},
                    dismissButton = {}
                )
            }
                Card(
                    modifier = Modifier.size(40.dp)
                        .clickable {
                            isNightMode = !isNightMode
                        },
                    colors = CardDefaults.cardColors(containerColor = MintCream),
                    shape = RoundedCornerShape(20.dp),
                    elevation = CardDefaults.cardElevation(defaultElevation = 15.dp)
                ) {
                    Image(
                        painter = painterResource(id = if (isNightMode) R.drawable.sun else R.drawable.moon),
                        contentDescription = if (isNightMode) "sun" else "light",
                        modifier = Modifier.size(30.dp)
                            .padding(start = 10.dp, top = 10.dp)
                    )
                }


            Card(
                modifier = Modifier.size(40.dp)
                    .clickable { },
                colors = CardDefaults
                    .cardColors(containerColor = MintCream),
                shape = RoundedCornerShape(20.dp),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 15.dp
                )
            ) {

                Image(
                    painter = painterResource(id = R.drawable.info),
                    contentDescription = "infos",
                    modifier = Modifier.size(30.dp)
                        .padding(start = 10.dp, top = 10.dp)
                )
            }
        }
    }
}


