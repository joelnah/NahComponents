package na.prayer.nahcomponents.skeleton

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay
import na.prayer.components.shimmer
import na.prayer.components.shimmerEffect

@Composable
fun ShimmerItem(
    isLoading: Boolean,
) {
    var textFirst by remember { mutableStateOf("") }
    var textSecond by remember { mutableStateOf("") }
    var textTriple by remember { mutableStateOf("") }

    LaunchedEffect(key1 = isLoading) {
        if(!isLoading){
            textFirst = "이 글은 첫 번째 글입니다."
            textSecond = "이 글은 두 번째 글입니다."
            textTriple = "이 글은 세 번째 글입니다."
        }
    }

    Row(modifier = Modifier
        .fillMaxSize()
        .padding(all = 10.dp), verticalAlignment = Alignment.Top) {

        Icon(modifier = Modifier
            .size(80.dp)
            .clip(RoundedCornerShape(10.dp))
            .shimmer(isLoading),
            imageVector = Icons.Default.Home, contentDescription = "Home"
        )
        Spacer(modifier = Modifier.width(10.dp))
        Column(verticalArrangement = Arrangement.Center) {
            Text(modifier = Modifier
                .height(20.dp)
                .clip(RoundedCornerShape(10.dp))
                .fillMaxWidth(fraction = 0.5f)
                .shimmer(isLoading)
                , text = textFirst
            )

            Spacer(modifier = Modifier.height(10.dp)) //creates an empty space between
            Text(modifier = Modifier
                .height(20.dp)
                .clip(RoundedCornerShape(10.dp))
                .fillMaxWidth(fraction = 0.7f)
                .shimmer(isLoading)
                , text = textSecond
            )

            Spacer(modifier = Modifier.height(10.dp)) //creates an empty space between
            Text(modifier = Modifier
                .height(20.dp)
                .clip(RoundedCornerShape(10.dp))
                .fillMaxWidth(fraction = 0.9f)
                .shimmer(isLoading)
                , text = textTriple
            )
        }
    }
}