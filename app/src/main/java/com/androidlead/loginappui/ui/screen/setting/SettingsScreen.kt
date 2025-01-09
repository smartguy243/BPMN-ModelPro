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
import androidx.compose.foundation.layout.requiredHeight
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
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SearchBarDefaults.InputField
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
import com.androidlead.loginappui.ui.components.ActionButton
import com.androidlead.loginappui.ui.components.InputField
import com.androidlead.loginappui.ui.theme.DarkTextColor
import com.androidlead.loginappui.ui.theme.LightLavender
import com.androidlead.loginappui.ui.theme.MintCream
import com.androidlead.loginappui.ui.theme.PrimaryPinkBlended
import com.androidlead.loginappui.ui.theme.PrimaryYellow
import com.androidlead.loginappui.ui.theme.PrimaryYellowDark
import com.androidlead.loginappui.ui.theme.PrimaryYellowLight
import com.androidlead.loginappui.ui.theme.SoftBlue
import com.androidlead.loginappui.ui.theme.WarmBeige

@Composable
fun SettingsScreen(onSettingsClicked: () -> Unit,
                   onBuilderClicked: () -> Unit,
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
                colors = CardDefaults.cardColors(Color.White)
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
                            painter = painterResource(id = R.drawable.profil1),
                            contentDescription = "profil",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clip(CircleShape)
                                .padding(top = 3.dp)
                                .size(60.dp),
                            alignment = Alignment.CenterStart
                        )

                        Column(verticalArrangement = Arrangement.Center) {
                            Text(
                                text = "Иван Иванович",
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier
                                    .padding(top = 18.dp, start = 12.dp),
                                fontSize = 25.sp
                            )
                        }
                        Image(
                            modifier = Modifier
                                .padding(start= 70.dp, top = 16.dp)
                                .size(35.dp),
                            painter = painterResource(id = R.drawable.icon_qr_code_scanner),
                            contentDescription = "icon_scanner",
                            colorFilter = ColorFilter.tint(Color.Blue.copy(alpha = 0.6f)),
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
                            colors = CardDefaults.cardColors(Color.White),
                            shape = RoundedCornerShape(4.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.avatar),
                                contentDescription = "avatar",
                                modifier = Modifier
                                    .background(Color.Blue.copy(alpha = 0.7f))
                            )
                        }
                        Text(
                            text = "Управление учётной записью",
                            modifier = Modifier
                                .padding(start = 15.dp)
                        )

                        Image(
                            painter = painterResource(id = R.drawable.arrow),
                            contentDescription = "arrow",
                            colorFilter = ColorFilter.tint(Color.Gray.copy(alpha = 0.7f)),
                            modifier = Modifier
                                .padding(top = 6.dp, start = 172.dp)
                        )
                    }
                }

            }

// first Column

            Spacer(
                modifier = Modifier
                    .padding(bottom = 30.dp)
            )

            Card(
                elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
                modifier = Modifier
                    .padding(start = 20.dp, end = 20.dp),
                colors = CardDefaults.cardColors(Color.White)
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
                                painter = painterResource(id = R.drawable.star),
                                contentDescription = "star",
                                modifier = Modifier
                                    .background(Color.Yellow.copy(alpha = 1f))
                            )
                        }
                        Text(
                            text = "Messages importants",
                            modifier = Modifier
                                .padding(start = 15.dp)
                        )

                        Image(
                            painter = painterResource(id = R.drawable.arrow),
                            contentDescription = "arrow",
                            colorFilter = ColorFilter.tint(Color.Gray.copy(alpha = 0.7f)),
                            modifier = Modifier
                                .padding(top = 6.dp, start = 56.dp)
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
                                painter = painterResource(id = R.drawable.computer),
                                contentDescription = "computer",
                                modifier = Modifier
                                    .background(Color.Green.copy(alpha = 0.9f))
                            )
                        }
                        Text(
                            text = "Appareils connectés",
                            modifier = Modifier
                                .padding(start = 15.dp)
                        )

                        Image(
                            painter = painterResource(id = R.drawable.arrow),
                            contentDescription = "arrow",
                            colorFilter = ColorFilter.tint(Color.Gray.copy(alpha = 0.7f)),
                            modifier = Modifier
                                .padding(top = 6.dp, start = 65.dp)
                        )

                    }
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
                                    .background(Color.Blue.copy(alpha = 0.7f))
                            )
                        }
                        Text(
                            text = "Compte",
                            modifier = Modifier
                                .padding(start = 15.dp)
                        )

                        Image(
                            painter = painterResource(id = R.drawable.arrow),
                            contentDescription = "arrow",
                            colorFilter = ColorFilter.tint(Color.Gray.copy(alpha = 0.7f)),
                            modifier = Modifier
                                .padding(top = 6.dp, start = 161.dp)
                        )


                    }

                    Spacer(
                        modifier = Modifier
                            .padding(bottom = 10.dp)
                    )

                    Divider(thickness = 1.dp)

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
                                    .background(Color.Blue.copy(alpha = 0.5f))
                            )
                        }
                        Text(
                            text = "Confidentialité",
                            modifier = Modifier
                                .padding(start = 15.dp)
                        )

                        Image(
                            painter = painterResource(id = R.drawable.arrow),
                            contentDescription = "arrow",
                            colorFilter = ColorFilter.tint(Color.Gray.copy(alpha = 0.7f)),
                            modifier = Modifier
                                .padding(top = 6.dp, start = 108.dp)
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
                                contentDescription = "discussions",
                                modifier = Modifier
                                    .background(Color.Green.copy(alpha = 0.7f))
                            )
                        }
                        Text(
                            text = "Discussions",
                            modifier = Modifier
                                .padding(start = 15.dp)
                        )

                        Image(
                            painter = painterResource(id = R.drawable.arrow),
                            contentDescription = "arrow",
                            colorFilter = ColorFilter.tint(Color.Gray.copy(alpha = 0.7f)),
                            modifier = Modifier
                                .padding(top = 6.dp, start = 125.dp)
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
                                contentDescription = "notificqtions",
                                modifier = Modifier
                                    .background(Color.Red.copy(alpha = 0.7f))
                            )
                        }
                        Text(
                            text = "Notificqtions",
                            modifier = Modifier
                                .padding(start = 15.dp)
                        )

                        Image(
                            painter = painterResource(id = R.drawable.arrow),
                            contentDescription = "arrow",
                            colorFilter = ColorFilter.tint(Color.Gray.copy(alpha = 0.7f)),
                            modifier = Modifier
                                .padding(top = 6.dp, start = 121.dp)
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
                                contentDescription = "stockage",
                                modifier = Modifier
                                    .background(Color.Green.copy(alpha = 0.7f))
                            )
                        }
                        Text(
                            text = "Stockage et données",
                            modifier = Modifier
                                .padding(start = 15.dp)
                        )

                        Image(
                            painter = painterResource(id = R.drawable.arrow),
                            contentDescription = "arrow",
                            colorFilter = ColorFilter.tint(Color.Gray.copy(alpha = 0.7f)),
                            modifier = Modifier
                                .padding(top = 6.dp, start = 61.dp)
                        )
                    }
                }
            }

// Second Column

            Spacer(
                modifier = Modifier
                    .padding(bottom = 30.dp)
            )

// Third Column

            Spacer(
                modifier = Modifier
                    .padding(bottom = 30.dp)
            )

            Card(
                elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
                modifier = Modifier
                    .padding(start = 20.dp, end = 20.dp),
                colors = CardDefaults.cardColors(Color.White)
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
                                    .background(Color.Blue.copy(alpha = 0.7f))
                            )
                        }
                        Text(
                            text = "Aide",
                            modifier = Modifier
                                .padding(start = 15.dp)
                        )

                        Image(
                            painter = painterResource(id = R.drawable.arrow),
                            contentDescription = "arrow",
                            colorFilter = ColorFilter.tint(Color.Gray.copy(alpha = 0.7f)),
                            modifier = Modifier
                                .padding(top = 6.dp, start = 185.dp)
                        )

                    }

                    Spacer(
                        modifier = Modifier
                            .padding(bottom = 10.dp)
                    )

                    Divider(thickness = 1.dp)

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
                                painter = painterResource(id = R.drawable.heart),
                                contentDescription = "inviter",
                                modifier = Modifier
                                    .background(Color.Red.copy(alpha = 0.7f))
                            )
                        }
                        Text(
                            text = "Inviter un contact",
                            modifier = Modifier
                                .padding(start = 15.dp)
                        )

                        Image(
                            painter = painterResource(id = R.drawable.arrow),
                            contentDescription = "arrow",
                            colorFilter = ColorFilter.tint(Color.Gray.copy(alpha = 0.7f)),
                            modifier = Modifier
                                .padding(top = 6.dp, start = 86.dp)
                        )

                    }

                }

            }

            Spacer(
                modifier = Modifier
                    .padding(bottom = 10.dp)
            )
            Column {
                Text(text = "")
            }

        }

    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBarCompose() {
    TopAppBar(
        title = {
        Text(
            text = "Настройки пользователя",
            modifier = Modifier
                .fillMaxWidth(),
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
    })
}

@Composable
fun BottomAppBarCompose(onBuilderClicked: () -> Unit, onLoginClicked: () -> Unit) {
    BottomAppBar(
        containerColor = WarmBeige,
        contentColor = Color.Black.copy(alpha = 0.1f)
    ) {
        Spacer(modifier = Modifier.weight(weight = 1f))
        ActionButton(
            text = "Go to Menu",
            isNavigationArrowVisible = true,
            onClicked = onBuilderClicked,
            colors = ButtonDefaults.buttonColors(
                containerColor = LightLavender,
                contentColor = DarkTextColor
            ),
            shadowColor = PrimaryYellowDark,
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
            text = "Logout",
            isNavigationArrowVisible = true,
            onClicked = onLoginClicked,
            colors = ButtonDefaults.buttonColors(
                containerColor = LightLavender,
                contentColor = DarkTextColor
            ),
            shadowColor = PrimaryYellowDark,
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