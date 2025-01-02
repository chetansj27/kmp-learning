package org.example.kmp

import platform.UIKit.UIDevice
import kotlin.math.roundToInt

actual class BatteryManager {
    actual fun getBatteryPercentage(): Int {
        UIDevice.currentDevice.batteryMonitoringEnabled = true
        val batteryLevel = UIDevice.currentDevice.batteryLevel
        return (batteryLevel * 100).roundToInt()
    }
}