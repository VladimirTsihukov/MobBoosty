import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowPosition
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import com.tishukoff.mobboosty.App
import java.awt.Dimension

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "MobBoosty Desktop",
        state = rememberWindowState(
            width = 1024.dp,
            height = 880.dp,
            position = WindowPosition.Aligned(Alignment.Center)
        )
    ) {
        window.minimumSize = Dimension(350, 600)
        App()
    }
}