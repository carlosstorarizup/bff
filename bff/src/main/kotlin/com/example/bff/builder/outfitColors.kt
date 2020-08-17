package com.example.bff.builder

import br.com.zup.beagle.core.CornerRadius
import br.com.zup.beagle.core.PositionType
import br.com.zup.beagle.core.Style
import br.com.zup.beagle.ext.applyStyle
import br.com.zup.beagle.ext.unitPercent
import br.com.zup.beagle.ext.unitReal
import br.com.zup.beagle.widget.Widget
import br.com.zup.beagle.widget.action.SetContext
import br.com.zup.beagle.widget.context.expressionOf
import br.com.zup.beagle.widget.core.*
import br.com.zup.beagle.widget.layout.Container
import br.com.zup.beagle.widget.ui.Image
import br.com.zup.beagle.widget.ui.ImagePath
import com.example.bff.Widgets.Color
import com.example.bff.Widgets.ColorSelector

class Colors {
    fun outfitColors(): Widget {
        return ColorSelector(
                colors = listOf(
                        Color(
                                hex = "#ECECED",
                                onPress = SetContext(
                                        contextId = "context",
                                        value = "$23.99"
                                )
                        ),
                        Color(
                                hex = "#D7D8DA",
                                onPress = SetContext(
                                        contextId = "context",
                                        value = "$25.99"
                                )
                        ),
                        Color(
                                hex = "#394657",
                                onPress = SetContext(
                                        contextId = "context",
                                        value = "$29.99"
                                )
                        ),
                        Color(
                                hex = "#B38B6D",
                                onPress = SetContext(
                                        contextId = "context",
                                        value = "$25.99"
                                )
                        )
                )
        ).applyStyle(
                Style(
                        margin = EdgeValue(top = 10.unitReal())
                )
        )
    }
}