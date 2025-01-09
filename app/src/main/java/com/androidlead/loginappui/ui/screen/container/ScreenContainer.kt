package com.androidlead.loginappui.ui.screen.container

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.androidlead.loginappui.ui.screen.builder.BuilderScreen
import com.androidlead.loginappui.ui.screen.home.HomeScreen
import com.androidlead.loginappui.ui.screen.login.LoginScreen
import com.androidlead.loginappui.ui.screen.menu.MenuScreen
import com.androidlead.loginappui.ui.screen.registration.RegistrationScreen
import com.androidlead.loginappui.ui.screen.setting.SettingsScreen
import com.androidlead.loginappui.ui.screen.welcome.WelcomeScreen

@Composable
fun ScreenContainer() {
    val navHost = rememberNavController()

    NavHost(
        navController = navHost,
        startDestination = NavGraph.Welcome.route
    ) {
        composable(NavGraph.Welcome.route) {
            WelcomeScreen(
                onOpenLoginClicked = {
                    navHost.navigate(NavGraph.Login.route)
                }
            )
        }
        composable(NavGraph.Login.route) {
            LoginScreen(
                onLoginClicked = {
                    navHost.navigate(NavGraph.Home.route)
                },
                onRegistrationClicked = {
                    navHost.navigate(NavGraph.Registration.route)
                }
            )
        }
        composable(NavGraph.Registration.route) {
            RegistrationScreen(
                onRegisterClicked = {
                    navHost.navigate(NavGraph.Home.route)
                },
                onLoginClicked = {
                    navHost.navigate(NavGraph.Login.route)
                }
            )
        }
        composable(NavGraph.Home.route) {
            HomeScreen(
                onOpenMenuClicked = {
                    navHost.navigate(NavGraph.Menu.route)
                }
            )
        }
        composable(NavGraph.Menu.route) {
            MenuScreen(
                onSettingsClicked = {
                    navHost.navigate(NavGraph.Settings.route)
                },
                onLoginClicked = {
                    navHost.navigate(NavGraph.Login.route)
                },
                onBuilderClicked = {
                    navHost.navigate(NavGraph.Builder.route)
                },
                onHomeClicked = {
                    navHost.navigate(NavGraph.Home.route)
                },
                onLearnClicked = {
                    navHost.navigate(NavGraph.Learn.route)
                }
            )
        }
        composable(NavGraph.Builder.route) {
            BuilderScreen(
                onBuilderClicked = {
                    navHost.navigate(NavGraph.Menu.route)
                }
            )
        }
        composable(NavGraph.Settings.route) {
            SettingsScreen(
                onSettingsClicked = {
                    navHost.navigate(NavGraph.Menu.route)
                },
                onBuilderClicked = {
                    navHost.navigate(NavGraph.Menu.route)
                },
                onLoginClicked = {
                    navHost.navigate(NavGraph.Login.route)
                }
            )
        }
    }
}
