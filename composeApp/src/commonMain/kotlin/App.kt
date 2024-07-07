import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import di.initKoin
import org.jetbrains.compose.ui.tooling.preview.Preview
import presentation.screen.HomeScreen

@Composable
@Preview
fun App() {

    initKoin()

    MaterialTheme {
        HomeScreen()
    }
}