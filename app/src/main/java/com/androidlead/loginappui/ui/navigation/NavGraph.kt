package com.androidlead.loginappui.ui.navigation

sealed class NavGraph(val route: String) {
    data object Welcome: NavGraph(route = "welcome_screen")
    data object Login: NavGraph(route = "login_screen")
    data object Registration: NavGraph(route = "registration_screen")
    data object Home: NavGraph(route = "home_screen")
    data object Menu: NavGraph(route = "menu_screen")
    data object Builder: NavGraph(route = "builder_screen")
    data object Settings: NavGraph(route = "setting_screen")
    data object Learn: NavGraph(route = "learn_screen")

    //Learning material
    data object Intro: NavGraph(route = "intro_screen")
    data object Event: NavGraph(route = "event_screen")
    data object Type: NavGraph(route = "type_screen")
    data object Process: NavGraph(route = "process_screen")
    data object Tools: NavGraph(route = "tools_screen")
    data object Artefact: NavGraph(route = "artefact_screen")
    data object BusinessProcess: NavGraph(route = "business_process_screen")
    data object Improvement: NavGraph(route = "improvement_screen")
}