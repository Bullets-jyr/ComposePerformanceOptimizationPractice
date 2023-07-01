package kr.co.bullets.composeperformanceoptimizationpractice.ui.content

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import kr.co.bullets.composeperformanceoptimizationpractice.ui.content.ContentScreen

class ContentActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ContentScreen(intent.getIntExtra("id",0))
        }
    }
}
