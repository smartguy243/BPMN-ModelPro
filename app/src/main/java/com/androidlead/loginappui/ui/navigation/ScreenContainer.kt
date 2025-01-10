package com.androidlead.loginappui.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.androidlead.loginappui.ui.screen.builder.BuilderScreen
import com.androidlead.loginappui.ui.screen.home.HomeScreen
import com.androidlead.loginappui.ui.screen.learning.ArtefactScreen
import com.androidlead.loginappui.ui.screen.learning.BusinessProcessScreen
import com.androidlead.loginappui.ui.screen.learning.EventScreen
import com.androidlead.loginappui.ui.screen.learning.ImprovementScreen
import com.androidlead.loginappui.ui.screen.learning.IntroScreen
import com.androidlead.loginappui.ui.screen.learning.TypeScreen
import com.androidlead.loginappui.ui.screen.learning.LearnScreen
import com.androidlead.loginappui.ui.screen.learning.ProcessScreen
import com.androidlead.loginappui.ui.screen.learning.ToolsScreen
import com.androidlead.loginappui.ui.screen.login.LoginScreen
import com.androidlead.loginappui.ui.screen.menu.MenuScreen
import com.androidlead.loginappui.ui.screen.registration.RegistrationScreen
import com.androidlead.loginappui.ui.screen.search.SearchScreen
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
                    navHost.navigate(NavGraph.Menu.route)
                },
                onRegistrationClicked = {
                    navHost.navigate(NavGraph.Registration.route)
                }
            )
        }
        composable(NavGraph.Registration.route) {
            RegistrationScreen(
                onRegisterClicked = {
                    navHost.navigate(NavGraph.Menu.route)
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
                ,
                onSearchClicked = {
                    navHost.navigate(NavGraph.Search.route)
                }
            )
        }
        composable(NavGraph.Builder.route) {
            BuilderScreen()
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
        composable(NavGraph.Search.route) {
            SearchScreen(
                onSettingsClicked = {
                    navHost.navigate(NavGraph.Settings.route)
                },
                onOpenMenuClicked = {
                    navHost.navigate(NavGraph.Menu.route)
                },
                onLearnIntroClicked = {
                    navHost.navigate(NavGraph.Intro.route)
                },
                onLearnEventClicked = {
                    navHost.navigate(NavGraph.Event.route)
                },
                onLearnTypeClicked = {
                    navHost.navigate(NavGraph.Type.route)
                },
                onLearnProcessClicked = {
                    navHost.navigate(NavGraph.Process.route)
                },
                onLearnToolsClicked = {
                    navHost.navigate(NavGraph.Tools.route)
                },
                onLearnArtefactClicked = {
                    navHost.navigate(NavGraph.Artefact.route)
                },
                onLearnBusinessProcessClicked = {
                    navHost.navigate(NavGraph.BusinessProcess.route)
                },
                onLearnImprovementClicked = {
                    navHost.navigate(NavGraph.Improvement.route)
                }
            )
        }
        composable(NavGraph.Learn.route) {
            LearnScreen(
                onSettingsClicked = {
                    navHost.navigate(NavGraph.Settings.route)
                },
                onOpenMenuClicked = {
                    navHost.navigate(NavGraph.Menu.route)
                },
                onLearnIntroClicked = {
                    navHost.navigate(NavGraph.Intro.route)
                },
                onLearnEventClicked = {
                    navHost.navigate(NavGraph.Event.route)
                },
                onLearnTypeClicked = {
                    navHost.navigate(NavGraph.Type.route)
                },
                onLearnProcessClicked = {
                    navHost.navigate(NavGraph.Process.route)
                },
                onLearnToolsClicked = {
                    navHost.navigate(NavGraph.Tools.route)
                },
                onLearnArtefactClicked = {
                    navHost.navigate(NavGraph.Artefact.route)
                },
                onLearnBusinessProcessClicked = {
                    navHost.navigate(NavGraph.BusinessProcess.route)
                },
                onLearnImprovementClicked = {
                    navHost.navigate(NavGraph.Improvement.route)
                }
            )
        }
        composable(NavGraph.Intro.route) {
            IntroScreen(
                onOpenMenuClicked = {
                    navHost.navigate(NavGraph.Menu.route)
                },
                onLearnClicked = {
                    navHost.navigate(NavGraph.Learn.route)
                },
            )
        }
        composable(NavGraph.Event.route) {
            EventScreen(
                onOpenMenuClicked = {
                    navHost.navigate(NavGraph.Menu.route)
                },
                onLearnClicked = {
                    navHost.navigate(NavGraph.Learn.route)
                },
            )
        }
        composable(NavGraph.Type.route) {
            TypeScreen(
                onOpenMenuClicked = {
                    navHost.navigate(NavGraph.Menu.route)
                },
                onLearnClicked = {
                    navHost.navigate(NavGraph.Learn.route)
                },
            )
        }
        composable(NavGraph.Process.route) {
            ProcessScreen(
                onOpenMenuClicked = {
                    navHost.navigate(NavGraph.Menu.route)
                },
                onLearnClicked = {
                    navHost.navigate(NavGraph.Learn.route)
                },
            )
        }
        composable(NavGraph.Tools.route) {
            ToolsScreen(
                onOpenMenuClicked = {
                    navHost.navigate(NavGraph.Menu.route)
                },
                onLearnClicked = {
                    navHost.navigate(NavGraph.Learn.route)
                },
            )
        }
        composable(NavGraph.Artefact.route) {
           ArtefactScreen(
                onOpenMenuClicked = {
                    navHost.navigate(NavGraph.Menu.route)
                },
                onLearnClicked = {
                    navHost.navigate(NavGraph.Learn.route)
                },
            )
        }
        composable(NavGraph.BusinessProcess.route) {
            BusinessProcessScreen(
                onOpenMenuClicked = {
                    navHost.navigate(NavGraph.Menu.route)
                },
                onLearnClicked = {
                    navHost.navigate(NavGraph.Learn.route)
                },
            )
        }
        composable(NavGraph.Improvement.route) {
            ImprovementScreen(
                onOpenMenuClicked = {
                    navHost.navigate(NavGraph.Menu.route)
                },
                onLearnClicked = {
                    navHost.navigate(NavGraph.Learn.route)
                },
            )
        }
    }
}
