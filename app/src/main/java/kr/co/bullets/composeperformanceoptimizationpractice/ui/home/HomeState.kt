package kr.co.bullets.composeperformanceoptimizationpractice.ui.home

import android.content.Intent
import kr.co.bullets.composeperformanceoptimizationpractice.ui.content.ContentActivity

class HomeState(val activity: HomeActivity) {
    fun showContent(index: Int) {
        activity.startActivity(Intent(activity, ContentActivity::class.java).apply {
            putExtra("id", index)
        })
    }
}
