package com.androidlead.loginappui.ui.screen.welcome

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.androidlead.loginappui.R
import com.androidlead.loginappui.ui.components.ActionButton
import com.androidlead.loginappui.ui.theme.CoralPink
import com.androidlead.loginappui.ui.theme.DarkTextColor
import com.androidlead.loginappui.ui.theme.LightLavender
import com.androidlead.loginappui.ui.theme.MintCream
import com.androidlead.loginappui.ui.theme.PrimaryPinkBlended
import com.androidlead.loginappui.ui.theme.PrimaryYellow
import com.androidlead.loginappui.ui.theme.PrimaryYellowDark
import com.androidlead.loginappui.ui.theme.PrimaryYellowLight
import com.androidlead.loginappui.ui.theme.SoftBlue
import com.androidlead.loginappui.ui.theme.SteelBlue

@Composable
fun WelcomeScreen(
    modifier: Modifier = Modifier,
    onOpenLoginClicked: () -> Unit
) {
    Column(
        modifier = modifier
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
        Image(
            painter = painterResource(R.drawable.img_home),
            contentDescription = null,
            modifier = Modifier
                .size(325.dp)
                .padding(end = 25.dp)
        )
        Spacer(
            modifier = Modifier.height(0.dp)
        )
        Text(
            text = "BPMN ModelPro",
            style = MaterialTheme.typography.headlineLarge,
            fontWeight = FontWeight.Black,
            modifier = Modifier.padding(horizontal = 24.dp),
            color = DarkTextColor
        )
        Spacer(
            modifier = Modifier.height(16.dp)
        )
        Text(
            text = "Your mobile companion for excellence.\nBPMN modeling, anytime, anywhere.",
            modifier = Modifier.padding(horizontal = 24.dp),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.bodyLarge,
            color = DarkTextColor
        )
        Spacer(
            modifier = Modifier.weight(weight = 1f)
        )
        ActionButton(
            text = "Start",
            isNavigationArrowVisible = true,
            onClicked = onOpenLoginClicked,
            colors = ButtonDefaults.buttonColors(
                containerColor = SteelBlue,
                contentColor = DarkTextColor
            ),
            shadowColor = Color.Black,
            modifier = Modifier.padding(horizontal = 85.dp, vertical = 60.dp)
        )
    }
}