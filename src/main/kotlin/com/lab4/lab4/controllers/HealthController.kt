package com.lab4.lab4.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/health")
class HealthController {
    @GetMapping("/check")
    fun statusCheck(): String {
        return "Service is online!"
    }
}