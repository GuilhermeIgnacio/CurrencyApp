package presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.unit.dp
import currencyapp.composeapp.generated.resources.Res
import currencyapp.composeapp.generated.resources.exchange
import currencyapp.composeapp.generated.resources.flags
import domain.model.RateStatus
import kotlinx.datetime.Clock
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime
import org.jetbrains.compose.resources.painterResource

@Composable
fun HomeHeader(
    status: RateStatus,
    onRatesRefresh: () -> Unit
) {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(bottomStart = 12.dp, bottomEnd = 12.dp))
            .background(Color.Blue)
            .padding(24.dp)

    ) {
        Spacer(modifier = Modifier.height(24.dp))
        RatesStatus(status = status, onRatesRefresh = onRatesRefresh)
    }

}

@Composable
fun RatesStatus(
    status: RateStatus,
    onRatesRefresh: () -> Unit
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row {
            Image(
                modifier = Modifier.size(50.dp).background(color = Color.Blue),
                painter = painterResource(Res.drawable.exchange),
                contentDescription = "Exchange Rate Illustration",
                colorFilter = ColorFilter.tint(Color.White)
            )
            Spacer(modifier = Modifier.width(12.dp))
            Column {
                Text(
                    text = displayCurrentTime(),
                    color = Color.White
                )
                Text(
                    text = status.title,
                    fontSize = MaterialTheme.typography.bodySmall.fontSize,
                    color = status.color
                )

            }

        }
        if (status == RateStatus.Stale) {
            IconButton(
                onClick = onRatesRefresh
            ) {
                Icon(
                    modifier = Modifier.size(24.dp),
                    imageVector = Icons.Default.Refresh,
                    contentDescription = "Refresh Icon",
                    tint = Color.Yellow
                )
            }
        }
    }
}

fun displayCurrentTime(): String {
    val currentTimeStamp = Clock.System.now()
    val date = currentTimeStamp.toLocalDateTime(TimeZone.currentSystemDefault())

    //Format the LocalDate into the desired representation
    val dayOfTheMonth = date.dayOfMonth

    val month = date.month.toString().lowercase().replaceFirstChar {
        if (it.isLowerCase()) it.titlecase() else it.toString()
    }
    val year = date.year

    //Determine the suffix for the day of the month
    val suffix = when {
        dayOfTheMonth in 11..13 -> "th"
        dayOfTheMonth % 10 == 1 -> "st"
        dayOfTheMonth % 10 == 2 -> "nd"
        dayOfTheMonth % 10 == 3 -> "rd"
        else -> "th"
    }

    //Format the date in the desired representation
    return "$dayOfTheMonth$suffix $month, $year"

}
