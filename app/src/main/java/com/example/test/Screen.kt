package com.example.test

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay

private const val DURATION = 250L

@Composable
fun Screen() {
    val scale = remember { mutableFloatStateOf(5f) }

    LaunchedEffect(Unit) {
        coroutineScope {
            while (true) {
                delay(DURATION)
                scale.floatValue = 5f
                delay(DURATION)
                scale.floatValue = 1f
            }
        }
    }

    Box(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .size(56.dp)
                .align(Alignment.Center)
                .graphicsLayer {
                    scaleX = scale.floatValue
                    scaleY = scale.floatValue
                }
                .background(Blue)
        )
    }
}
