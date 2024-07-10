package presentation.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.viewmodel.compose.viewModel
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.koin.getScreenModel
import cafe.adriel.voyager.koin.koinScreenModel
import presentation.component.HomeHeader
import ui.theme.surfaceColor


class HomeScreen : Screen {

    @Composable
    override fun Content() {

        val viewModel = koinScreenModel<HomeViewModel>()
        val rateStatus by viewModel.rateStatus
        val source by viewModel.sourceCurrency
        val target by viewModel.targetCurrency

        var amount by rememberSaveable{ mutableStateOf(0.0) }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(surfaceColor)
        ) {
            HomeHeader(
                status = rateStatus,
                source = source,
                target = target,
                amount = amount,
                onAmountChange = { amount = it },
                onRatesRefresh = {
                    viewModel.onEvent(
                        HomeUiEvent.RefreshRates
                    )
                },
                onSwitchClick = { viewModel.onEvent(HomeUiEvent.SwitchCurrencies) }
            )
        }
    }

}