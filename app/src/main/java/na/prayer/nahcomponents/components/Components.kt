package na.prayer.nahcomponents.components

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import na.prayer.nahcomponents.Route
import na.prayer.nahcomponents.skeleton.SkeletonScreen

@Composable
fun BasicButton(text: String) {
    Button(
        onClick = {
            Route.routeSwitch.value = text
        }
    ) {
        Text(
            style = TextStyle(color = Color.White),
            text = text, modifier = Modifier.padding(16.dp)
        )
    }

}