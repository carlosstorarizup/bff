package com.example.bff.builder

import br.com.zup.beagle.widget.layout.Container
import br.com.zup.beagle.widget.layout.Screen
import br.com.zup.beagle.widget.ui.Button
import br.com.zup.beagle.widget.ui.Text

class ScreenTransitionTest {
    fun createScreenTransition() = Screen(
            child = Container(
                    children = listOf(
                            Text(
                                    text = "Just a test"
                            )
                    )
            )
    )
}