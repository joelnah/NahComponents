package na.prayer.nahcomponents

import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import na.prayer.nahcomponents.components.BasicButton
import na.prayer.nahcomponents.skeleton.SkeletonScreen
import na.prayer.nahcomponents.ui.theme.NahComponentsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NahComponentsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Box(){
                        when(Route.routeSwitch.value){
                            Route.Components -> {
                                ComponentScreen()
                            }
                            Route.SkeletonScreen -> {
                                SkeletonScreen()
                            }
                        }

                        if(Route.routeSwitch.value != Route.Components){
                            FloatingActionButton( modifier = Modifier
                                .padding(20.dp)
                                .size(50.dp)
                                .align(androidx.compose.ui.Alignment.BottomEnd),
                                onClick = { Route.routeSwitch.value = Route.Components }) {
                                Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Back")
                            }
                        }
                    }

                }
            }
        }
    }
}


@Composable
fun ComponentScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {
        BasicButton(text = Route.SkeletonScreen)
        Spacer(modifier = Modifier.height(10.dp))
    }
}

