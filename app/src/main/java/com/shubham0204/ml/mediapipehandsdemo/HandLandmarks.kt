package com.shubham0204.ml.mediapipehandsdemo

import android.graphics.PointF

// Data class which holds landmarks for the thumb and index finger
data class HandLandmarks(
    val middleFinger: PointF,
    val index: PointF,
) {
    override fun toString(): String = "Middle Finger: $middleFinger  Index: $index"
}
