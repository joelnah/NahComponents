package na.prayer.nahcomponents

import androidx.compose.runtime.mutableStateOf

object Route {
    const val Components = "Components"
    const val SkeletonScreen = "SkeletonScreen"

    val routeSwitch = mutableStateOf(Components)
}