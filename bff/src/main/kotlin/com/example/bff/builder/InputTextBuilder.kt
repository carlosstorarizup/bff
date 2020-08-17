package com.example.bff.builder

import br.com.zup.beagle.widget.action.Alert
import br.com.zup.beagle.widget.core.TextInputType
import br.com.zup.beagle.widget.layout.Container
import br.com.zup.beagle.widget.layout.Screen
import br.com.zup.beagle.widget.ui.TextInput

class InputTextBuilder {
    fun createInput() = Screen(
            child = Container(
                    children = listOf(
                            TextInput(
                                    placeholder = "Text Input 1 with Actions",
                                    disabled = false,
                                    readOnly = true,
                                    type = TextInputType.TEXT,
                                    hidden = false,
                                    styleId = "TextInput",
                                    onChange = listOf(Alert(
                                            "On Change",
                                            "Text 1 Changed"
                                    )),
                                    onFocus = listOf(Alert(
                                            "On Focus",
                                            "Text 1 on focus"
                                    )),
                                    onBlur = listOf(Alert(
                                            "On Blur",
                                            "Text 1 on Blur"
                                    ))

                            ),
                            TextInput(placeholder = "Text 2")

                    )
            )
    )
}