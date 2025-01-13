package com.androidlead.loginappui.ui.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.scrollBy
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.ime
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.androidlead.loginappui.R
import com.androidlead.loginappui.ui.theme.DarkTextColor
import com.androidlead.loginappui.ui.theme.LightGray
import kotlinx.coroutines.launch

@Composable
fun AuthenticationScreenTemplate(
    modifier: Modifier = Modifier,
    backgroundGradient: Array<Pair<Float, Color>>,
    @DrawableRes imgRes: Int,
    title: String,
    subtitle: String,
    mainActionButtonTitle: String,
    secondaryActionButtonTitle: String,
    mainActionButtonColors: ButtonColors,
    secondaryActionButtonColors: ButtonColors,
    actionButtonShadow: Color,
    onMainActionButtonClicked: () -> Unit,
    onSecondaryActionButtonClicked: () -> Unit
) {
    val scrollState = rememberScrollState()
    val coroutineScope = rememberCoroutineScope()
    val keyboardHeight = WindowInsets.ime.getBottom(LocalDensity.current)

    LaunchedEffect(keyboardHeight) {
        coroutineScope.launch {
            scrollState.scrollBy(keyboardHeight.toFloat())
        }
    }

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Brush.verticalGradient(*backgroundGradient))
            //.systemBarsPadding()
            //.verticalScroll(scrollState)
            .imePadding(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(imgRes),
            contentDescription = null,
            modifier = Modifier
                .size(320.dp)
                //.padding(start = 15.dp)
        )
        Message(
            title = title,
            subtitle = subtitle
        )
        Spacer(
            modifier = Modifier.height(8.dp)
        )
        InputField(
            leadingIconRes = R.drawable.profil,
            placeholderText = "Your email",
            modifier = Modifier.padding(horizontal = 24.dp)
        )
        Spacer(
            modifier = Modifier.height(10.dp)
        )
        InputField(
            leadingIconRes = R.drawable.password2,
            placeholderText = "Password",
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier.padding(horizontal = 24.dp)
        )
        Spacer(
            modifier = Modifier.height(10.dp)
        )
        ActionButton(
            text = mainActionButtonTitle,
            isNavigationArrowVisible = true,
            onClicked = onMainActionButtonClicked,
            colors = mainActionButtonColors,
            shadowColor = actionButtonShadow,
            modifier = Modifier.padding(horizontal = 50.dp)
        )
        Separator(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 40.dp)
                .height(62.dp)
        )
        ActionButton(
            text = secondaryActionButtonTitle,
            isNavigationArrowVisible = false,
            onClicked = onSecondaryActionButtonClicked,
            colors = secondaryActionButtonColors,
            shadowColor = actionButtonShadow,
            modifier = Modifier
                .padding(horizontal = 50.dp)
                .padding(bottom = 24.dp)
        )
    }
}

@Composable
fun AuthenticationScreenTemplate2(
    modifier: Modifier = Modifier,
    backgroundGradient: Array<Pair<Float, Color>>,
    //@DrawableRes imgRes: Int,
    title: String,
    subtitle: String,
    mainActionButtonTitle: String,
    secondaryActionButtonTitle: String,
    mainActionButtonColors: ButtonColors,
    secondaryActionButtonColors: ButtonColors,
    actionButtonShadow: Color,
    onMainActionButtonClicked: () -> Unit,
    onSecondaryActionButtonClicked: () -> Unit
) {
    val scrollState = rememberScrollState()
    val coroutineScope = rememberCoroutineScope()
    val keyboardHeight = WindowInsets.ime.getBottom(LocalDensity.current)

    LaunchedEffect(keyboardHeight) {
        coroutineScope.launch {
            scrollState.scrollBy(keyboardHeight.toFloat())
        }
    }

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Brush.verticalGradient(*backgroundGradient))
            .systemBarsPadding()
            .verticalScroll(scrollState)
            .imePadding(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
//        Image(
//            painter = painterResource(imgRes),
//            contentDescription = null,
//            modifier = Modifier
//                .size(300.dp)
//                .padding(start = 30.dp)
//        )
        Spacer(
            modifier = Modifier.height(87.dp)
        )

        Message(
            title = title,
            subtitle = subtitle
        )
        Spacer(
            modifier = Modifier.height(15.dp)
        )
        InputField(
            leadingIconRes = R.drawable.profil,
            placeholderText = "First name",
            modifier = Modifier.padding(horizontal = 24.dp)
        )
        Spacer(
            modifier = Modifier.height(10.dp)
        )
        InputField(
            leadingIconRes = R.drawable.password2,
            placeholderText = "Last Name",
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier.padding(horizontal = 24.dp)
        )
        Spacer(
            modifier = Modifier.height(10.dp)
        )
        InputField(
            leadingIconRes = R.drawable.profil,
            placeholderText = "Email",
            modifier = Modifier.padding(horizontal = 24.dp)
        )
        Spacer(
            modifier = Modifier.height(10.dp)
        )
        InputField(
            leadingIconRes = R.drawable.password2,
            placeholderText = "Password",
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier.padding(horizontal = 24.dp)
        )
        Spacer(
            modifier = Modifier.height(13.dp)
        )
        ActionButton(
            text = mainActionButtonTitle,
            isNavigationArrowVisible = true,
            onClicked = onMainActionButtonClicked,
            colors = mainActionButtonColors,
            shadowColor = actionButtonShadow,
            modifier = Modifier.padding(horizontal = 50.dp)
        )
        Separator(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 60.dp)
                .height(62.dp)
        )
        ActionButton(
            text = secondaryActionButtonTitle,
            isNavigationArrowVisible = false,
            onClicked = onSecondaryActionButtonClicked,
            colors = secondaryActionButtonColors,
            shadowColor = actionButtonShadow,
            modifier = Modifier
                .padding(horizontal = 40.dp)
                .padding(bottom = 24.dp)
        )
    }
}

@Composable
private fun Message(
    modifier: Modifier = Modifier,
    title: String,
    subtitle: String
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Text(
            text = title,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.bodyLarge,
            color = DarkTextColor,
            fontWeight = FontWeight.Medium
        )
        Text(
            text = subtitle,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.headlineMedium,
            color = DarkTextColor,
            fontWeight = FontWeight.Black
        )
    }
}

@Composable
fun InputField(
    modifier: Modifier = Modifier,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    @DrawableRes leadingIconRes: Int,
    placeholderText: String
) {
    var inputValue by remember { mutableStateOf("") }

    TextField(
        modifier = modifier
            .fillMaxWidth()
            .height(62.dp),
        value = inputValue,
        onValueChange = { inputValue = it },
        visualTransformation = visualTransformation,
        singleLine = true,
        shape = RoundedCornerShape(percent = 25),
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
            focusedContainerColor = LightGray,
            unfocusedContainerColor = LightGray
        ),
        textStyle = MaterialTheme.typography.bodyLarge.copy(
            fontWeight = FontWeight.Medium
        ),
        leadingIcon = {
            Icon(
                painter = painterResource(leadingIconRes),
                contentDescription = null,
                modifier = Modifier.size(24.dp)
            )
        },
        placeholder = {
            Text(text = placeholderText)
        }
    )
}

@Composable
private fun Separator(
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        DashedLine(
            modifier = Modifier.weight(weight = 1f)
        )
        Text(
            text = "Or",
            style = MaterialTheme.typography.labelMedium,
            color = DarkTextColor
        )
        DashedLine(
            modifier = Modifier.weight(weight = 1f)
        )
    }
}

@Composable
private fun DashedLine(
    modifier: Modifier = Modifier
) {
    Canvas(modifier = modifier) {
        drawLine(
            color = DarkTextColor,
            start = Offset(0f, 0f),
            end = Offset(size.width, 0f),
            pathEffect = PathEffect.dashPathEffect(floatArrayOf(8f, 8f), 0f),
            cap = StrokeCap.Round,
            strokeWidth = 1.dp.toPx()
        )
    }
}