package com.example.bff.builder

import br.com.zup.beagle.widget.action.Alert
import br.com.zup.beagle.widget.ui.Button

class SingleComponentBuilder() {

    fun createButton(): Button {
        return Button(
                "Sou um botão server-driven",
                onPress = listOf(
                        Alert(
                                "Botão server-driven",
                                "Sou um botão server-driven",
                                labelOk = "OoooK"
                        )
                )
        )
    }
}