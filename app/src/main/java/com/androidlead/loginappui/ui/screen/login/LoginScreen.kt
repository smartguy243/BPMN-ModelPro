package com.androidlead.loginappui.ui.screen.login

import androidx.compose.foundation.background
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import com.androidlead.loginappui.R
import com.androidlead.loginappui.ui.components.AuthenticationScreenTemplate
import com.androidlead.loginappui.ui.theme.DarkTextColor
import com.androidlead.loginappui.ui.theme.Lavender
import com.androidlead.loginappui.ui.theme.LightLavender
import com.androidlead.loginappui.ui.theme.MintCream
import com.androidlead.loginappui.ui.theme.PrimaryPink
import com.androidlead.loginappui.ui.theme.PrimaryPinkBlended
import com.androidlead.loginappui.ui.theme.PrimaryPinkDark
import com.androidlead.loginappui.ui.theme.PrimaryPinkLight
import com.androidlead.loginappui.ui.theme.PrimaryYellow
import com.androidlead.loginappui.ui.theme.PrimaryYellowLight
import com.androidlead.loginappui.ui.theme.SoftBlue

@Composable
fun LoginScreen(
    modifier: Modifier = Modifier,
    onLoginClicked: () -> Unit,
    onRegistrationClicked: () -> Unit
) {
    AuthenticationScreenTemplate(
        modifier = modifier,
        backgroundGradient = arrayOf(
            0f to LightLavender,
            0.5f to MintCream,
            1.3f to SoftBlue
        ),
        imgRes = R.drawable.img_coder_m,
        title = "Welcome back!",
        subtitle = "Please, Log In.",
        mainActionButtonTitle = "Continue",
        secondaryActionButtonTitle = "Create an Account",
        mainActionButtonColors = ButtonDefaults.buttonColors(
            containerColor = PrimaryYellow,
            contentColor = DarkTextColor
        ),
        secondaryActionButtonColors = ButtonDefaults.buttonColors(
            containerColor = MintCream,
            contentColor = DarkTextColor
        ),
        actionButtonShadow = PrimaryPinkDark,
        onMainActionButtonClicked = onLoginClicked,
        onSecondaryActionButtonClicked = onRegistrationClicked
    )
}


