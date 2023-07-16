package com.jesusdmedinac.kmmapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform