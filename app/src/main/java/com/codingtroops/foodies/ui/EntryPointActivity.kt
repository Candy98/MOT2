package com.codingtroops.foodies.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import coil.annotation.ExperimentalCoilApi
import com.codingtroops.foodies.ui.feature.category_details.FoodCategoryDetailsScreen
import com.codingtroops.foodies.ui.feature.category_details.FoodCategoryDetailsViewModel
import com.codingtroops.foodies.ui.feature.categories.FoodCategoriesScreen
import com.codingtroops.foodies.ui.feature.categories.FoodCategoriesViewModel
import com.codingtroops.foodies.ui.NavigationKeys.Arg.FOOD_CATEGORY_ID
import com.codingtroops.foodies.ui.feature.auth.AddVehicleDetailsScreen
import com.codingtroops.foodies.ui.feature.auth.ChooseScreen
import com.codingtroops.foodies.ui.feature.auth.LoginScreen
import com.codingtroops.foodies.ui.feature.auth.RegistrationScreen
import com.codingtroops.foodies.ui.feature.auth.SplashScreen
import com.codingtroops.foodies.ui.feature.home.HomeScreen
import com.codingtroops.foodies.ui.theme.ComposeSampleTheme
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.receiveAsFlow


// Single Activity per app
@AndroidEntryPoint
class EntryPointActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeSampleTheme {
                FoodApp()
            }
        }
    }

}

@Composable
private fun FoodApp() {

    val navController = rememberNavController()
    NavHost(navController, startDestination = NavigationKeys.Route.FOOD_CATEGORIES_LIST) {
        composable(route = NavigationKeys.Route.FOOD_CATEGORIES_LIST) {
            SplashScreenDestination(navController)
        }
        composable(
            route = NavigationKeys.Route.FOOD_CATEGORY_DETAILS,
            arguments = listOf(navArgument(NavigationKeys.Arg.FOOD_CATEGORY_ID) {
                type = NavType.StringType
            })
        ) {
            FoodCategoryDetailsDestination()
        }
        composable(route = NavigationKeys.Route.LOGIN) {
            LoginDestination(navController)
        }
        composable(route = NavigationKeys.Route.LOGIN2) {
            LoginDestination2(navController)
        }
        composable(route = NavigationKeys.Route.Reg) {
            RegistrationDestination(navController)
        }
        composable(route = NavigationKeys.Route.VEH_DETAILS_SCREEN) {
            AddVehicleDetailsScreenDestination(navController)
        }
        composable(route = NavigationKeys.Route.HOME_SCREEN) {
            HomeScreenDestination(navController)
        }
    }


}

@Composable
private fun FoodCategoriesDestination(navController: NavHostController) {
    val viewModel: FoodCategoriesViewModel = hiltViewModel()
    FoodCategoriesScreen(
        state = viewModel.state,
        effectFlow = viewModel.effects.receiveAsFlow(),
        onNavigationRequested = { itemId ->
            navController.navigate("${NavigationKeys.Route.FOOD_CATEGORIES_LIST}/${itemId}")
        })
}
@OptIn(ExperimentalCoilApi::class)
@Composable
private fun LoginDestination(navController: NavHostController) {
    ChooseScreen(
        navController
    )
}
@Composable
private fun HomeScreenDestination(navController: NavHostController) {
    HomeScreen(
        navController
    )
}
@OptIn(ExperimentalCoilApi::class)
@Composable
private fun LoginDestination2(navController: NavHostController) {
    LoginScreen(
        navController
    )
}
@OptIn(ExperimentalCoilApi::class)
@Composable
private fun AddVehicleDetailsScreenDestination(navController: NavHostController) {
    AddVehicleDetailsScreen(
        navController
    )
}
@OptIn(ExperimentalCoilApi::class)
@Composable
private fun SplashScreenDestination(navController: NavHostController) {
    SplashScreen(
       navController
    )
}
@OptIn(ExperimentalCoilApi::class)
@Composable
private fun RegistrationDestination(navController: NavHostController) {
    RegistrationScreen(
        navController
    )
}
@Composable
private fun FoodCategoryDetailsDestination() {
    val viewModel: FoodCategoryDetailsViewModel = hiltViewModel()
    FoodCategoryDetailsScreen(viewModel.state)
}

object NavigationKeys {

    object Arg {
        const val FOOD_CATEGORY_ID = "foodCategoryName"
    }

    object Route {
        const val FOOD_CATEGORIES_LIST = "food_categories_list"
        const val LOGIN = "login"
        const val LOGIN2 = "login2"
        const val Reg = "registration"
        const val VEH_DETAILS_SCREEN = "veh_details_screen"
        const val HOME_SCREEN = "home_screen"
        const val FOOD_CATEGORY_DETAILS = "$FOOD_CATEGORIES_LIST/{$FOOD_CATEGORY_ID}"
    }

}