package com.androidlead.loginappui.ui.screen.search

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
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
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.androidlead.loginappui.R
import com.androidlead.loginappui.ui.components.ActionButton
import com.androidlead.loginappui.ui.components.InputField
import com.androidlead.loginappui.ui.components.LanguageOption
import com.androidlead.loginappui.ui.theme.DarkTextColor
import com.androidlead.loginappui.ui.theme.Lavender
import com.androidlead.loginappui.ui.theme.LightGray
import com.androidlead.loginappui.ui.theme.LightLavender
import com.androidlead.loginappui.ui.theme.MintCream
import com.androidlead.loginappui.ui.theme.SoftBlue

@Composable
fun SearchScreen(
    onOpenMenuClicked: () -> Unit,
    onSettingsClicked: () -> Unit,
    onLearnIntroClicked: () -> Unit,
    onLearnEventClicked: () -> Unit,
    onLearnTypeClicked: () -> Unit,
    onLearnProcessClicked: () -> Unit,
    onLearnToolsClicked: () -> Unit,
    onLearnArtefactClicked: () -> Unit,
    onLearnBusinessProcessClicked: () -> Unit,
    onLearnImprovementClicked: () -> Unit
) {
    var searchQuery by remember { mutableStateOf("") }

    // Liste des cours
    val courses = listOf(
        "Ввод в нотацию BPMN",
        "События и шлюзы в BPMN",
        "Типы задач в BPMN",
        "Подпроцессы в BPMN",
        "Средства оповещения в BPMN",
        "Артефакты и данные в BPMN",
        "Бизнес-процессоы в BPMN",
        "Улучшение бизнес-процессов"
    )

    // Filtrer les cours en fonction de la requête de recherche
    val filteredCourses = if (searchQuery.isEmpty()) {
        emptyList() // Afficher rien si la requête est vide
    } else {
        courses.filter { it.contains(searchQuery, ignoreCase = true) }
    }

    Scaffold(
        topBar = { TopAppBarCompose() },
        bottomBar = { BottomAppBarCompose(onOpenMenuClicked, onSettingsClicked) }
    ) { innerPadding ->
        // Zone cliquable pour fermer le clavier
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .background(
                    Brush.verticalGradient(
                        0f to LightLavender,
                        0.5f to MintCream,
                        1.3f to SoftBlue
                    )
                )
                .clickable(interactionSource = remember { MutableInteractionSource() }, indication = null) {
                }
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .verticalScroll(rememberScrollState())
                    .fillMaxSize()
            ) {
                // Champ de recherche
                InputField(
                    leadingIconRes = R.drawable.icon_search,
                    placeholderText = "Поиск",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp).height(50.dp),
                    value = searchQuery,
                    onValueChange = { searchQuery = it } // Mettre à jour la requête de recherche
                )

                Spacer(modifier = Modifier.padding(bottom = 15.dp))

                // Afficher les résultats ou un message si aucun résultat n'est trouvé
                if (searchQuery.isNotEmpty()) {
                    if (filteredCourses.isNotEmpty()) {
                        filteredCourses.forEach { course ->
                            CourseCard(courseName = course, onClick = {
                                when (course) {
                                    "Ввод в нотацию BPMN" -> onLearnIntroClicked()
                                    "События и шлюзы в BPMN" -> onLearnEventClicked()
                                    "Типы задач в BPMN" -> onLearnTypeClicked()
                                    "Подпроцессы в BPMN" -> onLearnProcessClicked()
                                    "Средства оповещения в BPMN" -> onLearnToolsClicked()
                                    "Артефакты и данные в BPMN" -> onLearnArtefactClicked()
                                    "Бизнес-процессы в BPMN" -> onLearnBusinessProcessClicked()
                                    "Улучшение бизнес-процессов" -> onLearnImprovementClicked()
                                }
                            })
                        }
                    } else {
                        Spacer(modifier = Modifier.height(160.dp))
                        // Afficher un message si aucun résultat n'est trouvé
                        Text(
                            text = "Ничего не найдено",
                            fontSize = 25.sp,
                            fontStyle = FontStyle.Italic,
                            fontWeight = FontWeight.W500,
                            color = Color.Gray,
                            textAlign = TextAlign.Center,
                            modifier = Modifier
                                .fillMaxWidth()
                                .align(Alignment.CenterHorizontally)
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun InputField(
    leadingIconRes: Int,
    placeholderText: String,
    modifier: Modifier = Modifier,
    value: String,
    onValueChange: (String) -> Unit
) {
    TextField(
        value = value,
        onValueChange = onValueChange,
        visualTransformation = VisualTransformation.None,
        shape = RoundedCornerShape(percent = 25),
        modifier = modifier,
        placeholder = { Text(placeholderText) },
        leadingIcon = {
            Icon(painterResource(id = leadingIconRes), contentDescription = null)
        },
        colors = TextFieldDefaults.colors(
            focusedIndicatorColor = Color.Transparent,
            disabledIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            errorIndicatorColor = Color.Transparent,
            focusedTextColor = DarkTextColor,
            unfocusedTextColor = DarkTextColor,
            unfocusedPlaceholderColor = DarkTextColor,
            focusedPlaceholderColor = DarkTextColor,
            focusedLeadingIconColor = DarkTextColor,
            unfocusedLeadingIconColor = DarkTextColor,
            focusedContainerColor = Color.White,
            unfocusedContainerColor = Color.White
        )
    )
}

@Composable
fun CourseCard(courseName: String, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .size(height = 70.dp, width = 500.dp)
            .clickable(onClick = onClick)
            .fillMaxWidth()
            .padding(vertical = 3.dp, horizontal = 7.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        shape = RoundedCornerShape(10.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 120.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.opened_book2), //L
                contentDescription = courseName,
                modifier = Modifier.size(55.dp).padding(start = 20.dp, top = 3.dp)
            )

            Spacer(modifier = Modifier.width(15.dp))

            Text(
                text = courseName,
                modifier = Modifier.fillMaxWidth(),
                fontSize = 16.sp,
                fontWeight = FontWeight.W500,
                textAlign = TextAlign.Start,
                color = DarkTextColor
            )
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
                text = "Ознакомительный Материал",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 15.dp),
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )
        }
    )
}


@Composable
fun BottomAppBarCompose(onOpenMenuClicked: () -> Unit, onSettingsClicked: () -> Unit) {
    BottomAppBar(
        containerColor = SoftBlue,
        contentColor = Color.Black.copy(alpha = 0.1f)
    ) {
        var showDialog by remember { mutableStateOf(false) }
        var selectedLanguage by remember { mutableStateOf("Русский") }
        var isNightMode by remember { mutableStateOf(false)}


        Spacer(modifier = Modifier.weight(weight = 1f))

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
                title = { Text("Choisissez une langue") },
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
        Spacer(modifier = Modifier.weight(weight = 0.4f))

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
        Spacer(modifier = Modifier.weight(weight = 0.4f))

        Card(modifier = Modifier.size(40.dp)
            .clickable { },
            colors = CardDefaults
                .cardColors(containerColor = MintCream),
            shape = RoundedCornerShape(20.dp),
            elevation = CardDefaults.cardElevation(
                defaultElevation = 15.dp)) {

            Image(
                painter = painterResource(id = R.drawable.info),
                contentDescription = "infos",
                modifier = Modifier.size(30.dp)
                    .padding(start = 10.dp, top = 10.dp)
            )
        }
        Spacer(modifier = Modifier.weight(weight = 2f))
        ActionButton(
            text = "Go to Menu",
            isNavigationArrowVisible = true,
            onClicked = onOpenMenuClicked,
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