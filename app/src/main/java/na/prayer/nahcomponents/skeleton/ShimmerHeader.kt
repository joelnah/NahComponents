package na.prayer.nahcomponents.skeleton

import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import na.prayer.components.shimmerEffect

@Composable
fun ShimmerHeader(
    data: String?,
) {
    val isLoading= data.isNullOrEmpty()
    Column(modifier = Modifier
        .fillMaxWidth()
        .clickable {
            Log.d("ShimmerItem", "ShimmerItem: $data")
        },
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            modifier = Modifier
                .size(80.dp)
                .clip(RoundedCornerShape(10.dp))
                .shimmerEffect(isLoading),
            imageVector = Icons.Default.Done, contentDescription = "Header"
        )
        Text(text = data ?: "Header",
            style = MaterialTheme.typography.displaySmall.copy(
                textAlign = androidx.compose.ui.text.style.TextAlign.Center
            ),
            modifier = Modifier
                .fillMaxWidth(fraction = 0.5f)
                .shimmerEffect(isLoading)
        )
        Spacer(modifier = Modifier.height(20.dp))
        Divider()
    }
}