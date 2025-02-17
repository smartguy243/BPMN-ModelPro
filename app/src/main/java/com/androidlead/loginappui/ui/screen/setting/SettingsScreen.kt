package com.androidlead.loginappui.ui.screen.setting

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.androidlead.loginappui.R
import com.androidlead.loginappui.components.ActionButton
import com.androidlead.loginappui.components.InputField
import com.androidlead.loginappui.ui.theme.DarkTextColor
import com.androidlead.loginappui.ui.theme.Lavender
import com.androidlead.loginappui.ui.theme.LightGray
import com.androidlead.loginappui.ui.theme.LightLavender
import com.androidlead.loginappui.ui.theme.MintCream
import com.androidlead.loginappui.ui.theme.SoftBlue

@Composable
fun SettingsScreen(onBuilderClicked: () -> Unit,
                   onLoginClicked: () -> Unit) {
    Scaffold(topBar = { TopAppBarCompose() },
        bottomBar = {
            BottomAppBarCompose(onBuilderClicked, onLoginClicked)
        }
    ) { innerPadding ->

        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .padding(innerPadding)
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

            InputField(
                leadingIconRes = R.drawable.icon_search,
                placeholderText = "Поиск",
                modifier = Modifier.padding(horizontal = 20.dp)
                                   .height(50.dp)
            )

            Spacer(
                modifier = Modifier
                    .padding(bottom = 15.dp)
            )

            Card(
                elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
                modifier = Modifier
                    .padding(start = 20.dp, end = 20.dp),
                colors = CardDefaults.cardColors(MintCream)
            ) {

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 20.dp, end = 20.dp, bottom = 9.dp)
                ) {

                    Row(
                        modifier = Modifier
                            .padding(top = 6.dp, bottom = 5.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.ic_person),
                            contentDescription = "profil",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clip(CircleShape)
                                .padding(top = 3.dp)
                                .size(50.dp),
                            alignment = Alignment.CenterStart
                        )

                        Column(verticalArrangement = Arrangement.Center) {
                            Text(
                                text = "Иван Иванович",
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier
                                    .padding(top = 18.dp, start = 10.dp),
                                fontSize = 20.sp,
                                color = DarkTextColor
                            )
                        }
                        Image(
                            modifier = Modifier
                                .padding(start= 30.dp, top = 16.dp)
                                .size(35.dp),
                            painter = painterResource(id = R.drawable.icon_qr_code_scanner),
                            contentDescription = "icon_scanner",
                            alignment = Alignment.Center
                        )

                    }

                    HorizontalDivider(thickness = 1.dp)

                    Row(
                        modifier = Modifier
                            .padding(top = 8.dp, end = 5.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {

                        Card(
                            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
                            colors = CardDefaults.cardColors(MintCream),
                            shape = RoundedCornerShape(4.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.avatar),
                                contentDescription = "avatar",
                                modifier = Modifier
                                    .background(Color.Black.copy(alpha = 0.7f))
                            )
                        }
                        Text(
                            text = "Управление учётной записью",
                            modifier = Modifier
                                .padding(start = 15.dp),
                            color = DarkTextColor
                        )

                        Image(
                            painter = painterResource(id = R.drawable.arrow),
                            contentDescription = "arrow",
                            colorFilter = ColorFilter.tint(Color.Gray.copy(alpha = 0.7f)),
                            modifier = Modifier
                                .padding(top = 6.dp, start = 172.dp)
                                .background(Color.Black.copy(alpha = 0.7f))
                        )
                    }
                }

            }

// first Column

            Spacer(
                modifier = Modifier
                    .padding(bottom = 20.dp)
            )

            Card(
                elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
                modifier = Modifier
                    .padding(start = 20.dp, end = 20.dp),
                colors = CardDefaults.cardColors(MintCream)
            ) {

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 20.dp, end = 20.dp, bottom = 9.dp)
                ) {
//                    Row(
//                        modifier = Modifier
//                            .padding(top = 8.dp, end = 5.dp),
//                        horizontalArrangement = Arrangement.SpaceBetween
//                    ) {
//
//                        Card(
//                            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
//                            colors = CardDefaults.cardColors(Color.White),
//                            shape = RoundedCornerShape(4.dp)
//                        ) {
//                            Image(
//                                painter = painterResource(id = R.drawable.star),
//                                contentDescription = "star",
//                                modifier = Modifier
//                                    .background(Color.Black.copy(alpha = 0.7f))
//                            )
//                        }
//                        Text(
//                            text = "Messages importants",
//                            modifier = Modifier
//                                .padding(start = 15.dp),
//                            color = DarkTextColor
//                        )
//
//                        Image(
//                            painter = painterResource(id = R.drawable.arrow),
//                            contentDescription = "arrow",
//                            colorFilter = ColorFilter.tint(Color.Gray.copy(alpha = 0.7f)),
//                            modifier = Modifier
//                                .padding(top = 6.dp, start = 56.dp)
//                        )
//
//                    }
//
//                    Spacer(
//                        modifier = Modifier
//                            .padding(bottom = 10.dp)
//                    )
//
//                    HorizontalDivider(thickness = 1.dp)
//
//                    Row(
//                        modifier = Modifier
//                            .padding(top = 8.dp, end = 5.dp),
//                        horizontalArrangement = Arrangement.SpaceBetween
//                    ) {
//
//                        Card(
//                            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
//                            colors = CardDefaults.cardColors(Color.White),
//                            shape = RoundedCornerShape(4.dp)
//                        ) {
//                            Image(
//                                painter = painterResource(id = R.drawable.computer),
//                                contentDescription = "computer",
//                                modifier = Modifier
//                                    .background(Color.Black.copy(alpha = 0.7f))
//                            )
//                        }
//                        Text(
//                            text = "Appareils connectés",
//                            modifier = Modifier
//                                .padding(start = 15.dp),
//                            color = DarkTextColor
//                        )
//
//                        Image(
//                            painter = painterResource(id = R.drawable.arrow),
//                            contentDescription = "arrow",
//                            colorFilter = ColorFilter.tint(Color.Gray.copy(alpha = 0.7f)),
//                            modifier = Modifier
//                                .padding(top = 6.dp, start = 65.dp)
//                        )
//
//                    }
//                    Spacer(
//                        modifier = Modifier
//                            .padding(bottom = 10.dp)
//                    )
//
//                    HorizontalDivider(thickness = 1.dp)

                    Row(
                        modifier = Modifier
                            .padding(top = 8.dp, end = 5.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {

                        Card(
                            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
                            colors = CardDefaults.cardColors(Color.White),
                            shape = RoundedCornerShape(4.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.key_24),
                                contentDescription = "key",
                                modifier = Modifier
                                    .rotate(90f)
                                    .background(Color.Black.copy(alpha = 0.7f))
                            )
                        }
                        Text(
                            text = "Контроль доступа",
                            modifier = Modifier
                                .padding(start = 15.dp),
                            color = DarkTextColor
                        )

                        Image(
                            painter = painterResource(id = R.drawable.arrow),
                            contentDescription = "arrow",
                            colorFilter = ColorFilter.tint(Color.Gray.copy(alpha = 0.7f)),
                            modifier = Modifier
                                .padding(top = 6.dp, start = 76.dp)
                        )


                    }

                    Spacer(
                        modifier = Modifier
                            .padding(bottom = 10.dp)
                    )

                    HorizontalDivider(thickness = 1.dp)

                    Row(
                        modifier = Modifier
                            .padding(top = 8.dp, end = 5.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {

                        Card(
                            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
                            colors = CardDefaults.cardColors(Color.White),
                            shape = RoundedCornerShape(4.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.lock),
                                contentDescription = "lock",
                                modifier = Modifier
                                    .background(Color.Black.copy(alpha = 0.7f))
                            )
                        }
                        Text(
                            text = "Конфиденциальность",
                            modifier = Modifier
                                .padding(start = 15.dp),
                            color = DarkTextColor
                        )

                        Image(
                            painter = painterResource(id = R.drawable.arrow),
                            contentDescription = "arrow",
                            colorFilter = ColorFilter.tint(Color.Gray.copy(alpha = 0.7f)),
                            modifier = Modifier
                                .padding(top = 6.dp, start = 46.dp)
                        )
                    }

                    Spacer(
                        modifier = Modifier
                            .padding(bottom = 10.dp)
                    )

                    HorizontalDivider(thickness = 1.dp)

                    Row(
                        modifier = Modifier
                            .padding(top = 8.dp, end = 5.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {

                        Card(
                            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
                            colors = CardDefaults.cardColors(Color.White),
                            shape = RoundedCornerShape(4.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.discussions),
                                contentDescription = "Уведомления",
                                modifier = Modifier
                                    .background(Color.Black.copy(alpha = 0.7f))
                            )
                        }
                        Text(
                            text = "Уведомления",
                            modifier = Modifier
                                .padding(start = 15.dp),
                            color = DarkTextColor
                        )

                        Image(
                            painter = painterResource(id = R.drawable.arrow),
                            contentDescription = "arrow",
                            colorFilter = ColorFilter.tint(Color.Gray.copy(alpha = 0.7f)),
                            modifier = Modifier
                                .padding(top = 6.dp, start = 110.dp)
                        )
                    }

                    Spacer(
                        modifier = Modifier
                            .padding(bottom = 10.dp)
                    )

                    HorizontalDivider(thickness = 1.dp)

                    Row(
                        modifier = Modifier
                            .padding(top = 8.dp, end = 5.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {

                        Card(
                            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
                            colors = CardDefaults.cardColors(Color.White),
                            shape = RoundedCornerShape(4.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.notifications),
                                contentDescription = "Доступность",
                                modifier = Modifier
                                    .background(Color.Black.copy(alpha = 0.7f))
                            )
                        }
                        Text(
                            text = "Доступность",
                            modifier = Modifier
                                .padding(start = 15.dp),
                            color = DarkTextColor
                        )

                        Image(
                            painter = painterResource(id = R.drawable.arrow),
                            contentDescription = "arrow",
                            colorFilter = ColorFilter.tint(Color.Gray.copy(alpha = 0.7f)),
                            modifier = Modifier
                                .padding(top = 6.dp, start = 117.dp)
                        )
                    }

                    Spacer(
                        modifier = Modifier
                            .padding(bottom = 10.dp)
                    )

                    HorizontalDivider(thickness = 1.dp)

                    Row(
                        modifier = Modifier
                            .padding(top = 8.dp, end = 5.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {

                        Card(
                            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
                            colors = CardDefaults.cardColors(Color.White),
                            shape = RoundedCornerShape(4.dp),
                            modifier = Modifier
                                .padding(top = 12.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.copy),
                                contentDescription = "stockage",
                                modifier = Modifier
                                    .size(25.dp)
                                    .background(Color.Black.copy(alpha = 0.7f))
                            )
                        }
                        Text(
                            text = "Резервное копирование\nи синхронизация",
                            modifier = Modifier
                                .padding(start = 15.dp),
                            color = DarkTextColor
                        )

                        Image(
                            painter = painterResource(id = R.drawable.arrow),
                            contentDescription = "arrow",
                            colorFilter = ColorFilter.tint(Color.Gray.copy(alpha = 0.7f)),
                            modifier = Modifier
                                .padding(top = 6.dp, start = 27.dp)
                        )
                    }
                }
            }

// Second Column

            Spacer(
                modifier = Modifier
                    .padding(bottom = 10.dp)
            )

            Card(
                elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
                modifier = Modifier
                    .padding(start = 20.dp, end = 20.dp),
                colors = CardDefaults.cardColors(MintCream)
            ) {

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 20.dp, end = 20.dp, bottom = 9.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .padding(top = 8.dp, end = 5.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {

                        Card(
                            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
                            colors = CardDefaults.cardColors(Color.White),
                            shape = RoundedCornerShape(4.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.info2),
                                contentDescription = "aide",
                                modifier = Modifier
                                    .background(Color.Black.copy(alpha = 0.7f))
                            )
                        }
                        Text(
                            text = "Поддержка",
                            modifier = Modifier
                                .padding(start = 15.dp),
                            color = DarkTextColor
                        )

                        Image(
                            painter = painterResource(id = R.drawable.arrow),
                            contentDescription = "arrow",
                            colorFilter = ColorFilter.tint(Color.Gray.copy(alpha = 0.7f)),
                            modifier = Modifier
                                .padding(top = 6.dp, start = 128.dp)
                        )

                    }
                    Spacer(
                        modifier = Modifier
                            .padding(bottom = 10.dp)
                    )

                    HorizontalDivider(thickness = 1.dp)

                    Row(
                        modifier = Modifier
                            .padding(top = 8.dp, end = 5.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {

                        Card(
                            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
                            colors = CardDefaults.cardColors(Color.White),
                            shape = RoundedCornerShape(4.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.stockage),
                                contentDescription = "inviter",
                                modifier = Modifier
                                    .background(Color.Black.copy(alpha = 0.7f))
                            )                        }
                        Text(
                            text = "Обновление",
                            modifier = Modifier
                                .padding(start = 15.dp),
                            color = DarkTextColor
                        )

                        Image(
                            painter = painterResource(id = R.drawable.arrow),
                            contentDescription = "arrow",
                            colorFilter = ColorFilter.tint(Color.Gray.copy(alpha = 0.7f)),
                            modifier = Modifier
                                .padding(top = 6.dp, start = 122.dp)
                        )

                    }

                }

            }

        }

    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBarCompose() {
    TopAppBar(
        colors = TopAppBarColors(
            containerColor = Lavender,
            scrolledContainerColor = LightGray,
            navigationIconContentColor = LightGray,
            titleContentColor = DarkTextColor,
            actionIconContentColor = LightGray,
        ),
        title = {
        Text(
            text = "Настройки пользователя",
            modifier = Modifier
                .fillMaxWidth()
                .padding(end = 15.dp),
            fontSize = 27.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
    })
}

@Composable
fun BottomAppBarCompose(onBuilderClicked: () -> Unit, onLoginClicked: () -> Unit) {
    BottomAppBar(
        containerColor = SoftBlue,
        contentColor = Color.Black.copy(alpha = 0.1f)
    ) {
        Spacer(modifier = Modifier.weight(weight = 1f))
        ActionButton(
            text = "Меню",
            isNavigationArrowVisible = true,
            onClicked = onBuilderClicked,
            colors = ButtonDefaults.buttonColors(
                containerColor = MintCream,
                contentColor = DarkTextColor
            ),
            shadowColor = DarkTextColor,
            modifier = Modifier.padding(end = 15.dp)
                .height(35.dp)
                .width(140.dp)
                .shadow(
                    elevation = 24.dp,
                    shape = RoundedCornerShape(percent = 50)
                )
        )
        Spacer(modifier = Modifier.weight(weight = 1f))
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
                .width(140.dp)
                .shadow(
                    elevation = 24.dp,
                    shape = RoundedCornerShape(percent = 50)
                )
        )
    }
}