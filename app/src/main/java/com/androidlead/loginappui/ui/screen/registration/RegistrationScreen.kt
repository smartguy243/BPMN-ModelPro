package com.androidlead.loginappui.ui.screen.registration

import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.androidlead.loginappui.components.AuthenticationScreenTemplate2
import com.androidlead.loginappui.ui.theme.DarkTextColor
import com.androidlead.loginappui.ui.theme.LightLavender
import com.androidlead.loginappui.ui.theme.MintCream
import com.androidlead.loginappui.ui.theme.PrimaryYellow
import com.androidlead.loginappui.ui.theme.SoftBlue

@Composable
fun RegistrationScreen(
    modifier: Modifier = Modifier,
    onRegisterClicked: () -> Unit,
    onLoginClicked: () -> Unit
){
    AuthenticationScreenTemplate2(
        modifier = modifier,
        backgroundGradient = arrayOf(
            0f to LightLavender,
            0.5f to MintCream,
            1.3f to SoftBlue
        ),
        //imgRes = R.drawable.img_coder_w,
        title = "Новые в BPMN ModelPro ?",
        subtitle = "Зарегрестрируйтесь !",
        mainActionButtonTitle = "Создать аккаунт",
        secondaryActionButtonTitle = "У вас уже есть аккаунт",
        mainActionButtonColors = ButtonDefaults.buttonColors(
            containerColor = PrimaryYellow,
            contentColor = DarkTextColor
        ),
        secondaryActionButtonColors = ButtonDefaults.buttonColors(
            containerColor = MintCream,
            contentColor = DarkTextColor
        ),
        actionButtonShadow = DarkTextColor,
        onMainActionButtonClicked = onRegisterClicked,
        onSecondaryActionButtonClicked = onLoginClicked
    )
}