package com.example.bff.controller

import com.example.bff.service.ScreenBeagleService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ScreenController(
        private val screenBeagleService: ScreenBeagleService
) {
    @GetMapping("/serverDrivenComponent")
    fun getServerDrivenComponent() = screenBeagleService.createServerDrivenComponent()

    @GetMapping("/Teste")
    fun getTeste() = screenBeagleService.Testinieo()

    @GetMapping("/Input")
    fun getInput() = screenBeagleService.createInput()

    @GetMapping("/Login")
    fun getLogin() = screenBeagleService.createLogin()

    @GetMapping("/LoginTransition")
    fun getLoginTransition() = screenBeagleService.loginTransition()

    @GetMapping("/ScreenTransition")
    fun getScreenTransition() = screenBeagleService.screenTransition()

    @GetMapping("/ColorSelector")
    fun getColorSelector() = screenBeagleService.colorSelector()

    @GetMapping("/ImageTeste")
    fun getImageTest() = screenBeagleService.imageTest()
}