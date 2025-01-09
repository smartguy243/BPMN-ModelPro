package com.androidlead.loginappui.ui.screen.container

sealed class NavGraph(val route: String) {
    data object Welcome: NavGraph(route = "welcome_screen")
    data object Login: NavGraph(route = "login_screen")
    data object Registration: NavGraph(route = "registration_screen")
    data object Home: NavGraph(route = "home_screen")
    data object Menu: NavGraph(route = "menu_screen")
    data object Builder: NavGraph(route = "builder_screen")
    data object Settings: NavGraph(route = "setting_screen")
    data object Learn: NavGraph(route = "learn_screen")
}