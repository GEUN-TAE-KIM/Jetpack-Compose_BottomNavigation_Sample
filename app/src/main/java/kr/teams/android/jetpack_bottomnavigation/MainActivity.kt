package kr.teams.android.jetpack_bottomnavigation

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import kr.teams.android.jetpack_bottomnavigation.ui.theme.JetPack_BottomNavigationTheme

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetPack_BottomNavigationTheme {
                MainScreen()
            }
        }
    }
}