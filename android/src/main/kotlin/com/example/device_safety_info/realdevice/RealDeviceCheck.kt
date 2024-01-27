package com.example.device_safety_info.realdevice

import android.os.Build

class RealDeviceCheck {

    companion object {

        fun isRealDevice(): Boolean {
            return ((Build.BRAND.startsWith("generic")
                    && Build.DEVICE.startsWith("generic"))
                    || Build.FINGERPRINT.startsWith("generic")
                    || Build.FINGERPRINT.startsWith("unknown")
                    || Build.FINGERPRINT.startsWith("google/sdk_gphone_")
                    || Build.FINGERPRINT.startsWith(":user/release-keys")
                    || Build.HARDWARE.contains("goldfish")
                    || Build.HARDWARE.contains("ranchu")
                    || Build.HARDWARE.contains("vbox86")
                    || Build.MODEL.contains("google_sdk ")
                    || Build.MODEL.contains("Emulator")
                    || Build.MODEL.contains("Android SDK built for x86")
                    || Build.MANUFACTURER.contains("Genymotion")
                    || Build.MANUFACTURER.contains("bluestacks", ignoreCase = true)
                    || Build.PRODUCT.contains("sdk")
                    || Build.PRODUCT.contains("vbox86p")
                    || Build.PRODUCT.contains("emulator")
                    || Build.PRODUCT.contains("simulator"))
                    || Build.PRODUCT.startsWith("google_sdk")
                    || Build.PRODUCT.contains("sdk_x86")
                    || Build.PRODUCT.contains("vbox86p")
                    || Build.BOARD.lowercase().contains("nox")
                    || Build.BOOTLOADER.contains("nox", ignoreCase = true)
                    || Build.HARDWARE.contains("nox", ignoreCase = true)
                    || Build.PRODUCT.contains("nox", ignoreCase = true)
                    || Build.SERIAL.contains("nox", ignoreCase = true)
                    || Build.HOST == "ubuntu" // To Avoid False Positives on Oppo Realme Devices
                    || Build.BOARD.contains("windows")
                    || Build.HARDWARE.contains("windows")
        }

    }

}