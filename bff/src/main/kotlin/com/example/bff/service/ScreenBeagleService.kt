package com.example.bff.service

import com.example.bff.builder.*
import org.springframework.stereotype.Service

@Service
class ScreenBeagleService {
    fun createServerDrivenComponent() = SingleComponentBuilder().createButton()
    fun Testinieo() = Teste().createTest()
    fun createInput() = InputTextBuilder().createInput()
    fun createLogin() = LoginBuilder().createScreen()
    fun loginTransition() = LoginTransitionTest().createLoginScreen()
    fun screenTransition() = ScreenTransitionTest().createScreenTransition()
    fun colorSelector() = Colors().outfitColors()
    fun imageTest() = ImageTeste()
}