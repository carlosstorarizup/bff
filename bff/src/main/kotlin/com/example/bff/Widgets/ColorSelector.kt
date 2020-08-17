package com.example.bff.Widgets

import br.com.zup.beagle.annotation.RegisterWidget
import br.com.zup.beagle.widget.Widget
import br.com.zup.beagle.widget.action.Action

data class Color(
        val hex: String,
        val onPress: Action
)

@RegisterWidget
data class ColorSelector(
        val colors: List<Color>
) : Widget()
