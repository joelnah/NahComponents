package na.prayer.components


import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun <T>LazyShimmerColumn(
    modifier: Modifier = Modifier,
    data: List<T>? = listOf(),
    shimmerCount: Int = 20,
    header: @Composable (() -> Unit)? = null,
    footer: @Composable (() -> Unit)? = null,
    content: @Composable (T?) -> Unit
) {

    LazyColumn(modifier = modifier) {

        header?.let { item { it() } }

        items(
            if (data.isNullOrEmpty()) shimmerCount
            else data.size
        ) {
                Box {
                    content(
                        if (data.isNullOrEmpty()) null
                        else data[it]
                    )
                    if (data.isNullOrEmpty())
                        Spacer(modifier = Modifier.matchParentSize().clickable(false) {})
                }
            }

        footer?.let { item { it() } }
    }

}