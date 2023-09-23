package na.prayer.nahcomponents.skeleton

import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
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
import na.prayer.components.shimmerEffect

@Composable
fun ShimmerItem(
    data: String?,
) {
    val isLoading= data.isNullOrEmpty()
    var textFirst by remember { mutableStateOf("") }
    var textSecond by remember { mutableStateOf("") }
    var textTriple by remember { mutableStateOf("") }

    LaunchedEffect(key1 = data) {
        if(!data.isNullOrEmpty()){
            textFirst = data
            textSecond = "이 글은 두 번째 글입니다."
            textTriple = "이 글은 세 번째 글입니다."
        }
    }

    Row(modifier = Modifier
        .fillMaxSize()
        .clickable {
            Log.d("ShimmerItem", "ShimmerItem: $data")
        }
        .padding(all = 10.dp), verticalAlignment = Alignment.Top) {

        Icon(modifier = Modifier
            .size(80.dp)
            .clip(RoundedCornerShape(10.dp))
            .shimmerEffect(isLoading),
            imageVector = Icons.Default.Home, contentDescription = "Home"
        )
        Spacer(modifier = Modifier.width(10.dp))
        Column(verticalArrangement = Arrangement.Center) {
            Text(modifier = Modifier
                .height(20.dp)
                .clip(RoundedCornerShape(10.dp))
                .fillMaxWidth(fraction = 0.5f)
                .shimmerEffect(isLoading)
                , text = textFirst
            )

            Spacer(modifier = Modifier.height(10.dp)) //creates an empty space between
            Text(modifier = Modifier
                .height(20.dp)
                .clip(RoundedCornerShape(10.dp))
                .fillMaxWidth(fraction = 0.7f)
                .shimmerEffect(isLoading)
                , text = textSecond
            )

            Spacer(modifier = Modifier.height(10.dp)) //creates an empty space between
            Text(modifier = Modifier
                .height(20.dp)
                .clip(RoundedCornerShape(10.dp))
                .fillMaxWidth(fraction = 0.9f)
                .shimmerEffect(isLoading)
                , text = textTriple
            )
        }
    }
}