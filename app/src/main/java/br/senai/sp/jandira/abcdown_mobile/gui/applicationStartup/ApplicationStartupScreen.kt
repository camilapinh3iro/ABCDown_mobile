package br.senai.sp.jandira.abcdown_mobile.gui.applicationStartup

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height

import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import br.senai.sp.jandira.abcdown_mobile.R
import kotlinx.coroutines.delay

@Composable
fun ApplicationStartupScreenScreen(navController: NavController) {

    LaunchedEffect(true) {
        // Irá automáticamente para a screen log-in
        delay(1)
        navController.navigate("login")
    }

    Column (modifier = Modifier
        .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(painter = painterResource(id = R.drawable.logo),
            contentDescription = "image logo",
            modifier = Modifier.width(140.dp).height(155.dp))
    }
}
