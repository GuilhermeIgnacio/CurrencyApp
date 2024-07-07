package presentation.screen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import data.remote.api.CurrencyApiServiceImpl

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    LaunchedEffect(Unit){
        CurrencyApiServiceImpl().getLatestExchangeRates()
    }
}