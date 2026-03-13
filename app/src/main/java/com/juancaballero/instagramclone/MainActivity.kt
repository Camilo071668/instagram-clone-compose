package com.juancaballero.instagramclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.juancaballero.instagramclone.ui.screens.FeedScreen
import com.juancaballero.instagramclone.ui.theme.InstagramcloneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InstagramcloneTheme {
                FeedScreen()
            }
        }
    }
}