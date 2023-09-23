package na.prayer.nahcomponents.skeleton

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay
import na.prayer.components.LazyShimmerColumn
import na.prayer.nahcomponents.Route

@Composable
fun SkeletonScreen() {
    var data by remember { mutableStateOf(listOf<String>()) }
    var headerData by remember { mutableStateOf("") }
    var footerData by remember { mutableStateOf("") }

    LaunchedEffect(key1 = true) {
        delay(5000L)
        headerData = "Header"
        footerData = "Footer"
        data = listOf("1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
    }

    Column(
        Modifier
            .fillMaxSize()) {

        Text(text = Route.SkeletonScreen, modifier = Modifier.fillMaxWidth())

        Spacer(modifier = Modifier.height(10.dp))

        //스켈레톤 UI 적용
        LazyShimmerColumn(
            modifier = Modifier.weight(1f),
            data = data,
            shimmerCount = 20,
            header = {
                ShimmerHeader(data = headerData)
            },
            footer = {
                ShimmerFooter(data = footerData)
            },
            content = {
                ShimmerItem(it)
            }
        )
    }

}

