package com.example.bff.builder

import br.com.zup.beagle.core.CornerRadius
import br.com.zup.beagle.core.PositionType
import br.com.zup.beagle.core.Style
import br.com.zup.beagle.ext.applyStyle
import br.com.zup.beagle.ext.unitPercent
import br.com.zup.beagle.ext.unitReal
import br.com.zup.beagle.widget.Widget
import br.com.zup.beagle.widget.action.Alert
import br.com.zup.beagle.widget.action.Navigate
import br.com.zup.beagle.widget.action.Route
import br.com.zup.beagle.widget.action.SetContext
import br.com.zup.beagle.widget.context.ContextData
import br.com.zup.beagle.widget.context.expressionOf
import br.com.zup.beagle.widget.core.*
import br.com.zup.beagle.widget.layout.*
import br.com.zup.beagle.widget.ui.Button
import br.com.zup.beagle.widget.ui.Image
import br.com.zup.beagle.widget.ui.ImagePath
import com.example.bff.Widgets.ImageDetail
import enum.ImageType

class ImageTeste : ScreenBuilder {

    override fun build() =
            Screen(
                    navigationBar = navBar(),
                    child = screenWidgets()
            )

    private fun navBar(): NavigationBar {
        return NavigationBar(
                title = "Title",
                styleId = "customNavigation",
                navigationBarItems = listOf(
                        NavigationBarItem(
                                text = "Heart Icon",
                                image = ImagePath.Local.justMobile("heart"),
                                action = Alert(
                                        title = "Heart title",
                                        message = "Heart message",
                                        labelOk = "ok"
                                )
                        ),
                        NavigationBarItem(
                                text = "Bag Icon",
                                image = ImagePath.Local.justMobile("bag"),
                                action = Alert(
                                        title = "Bag title",
                                        message = "Bag message",
                                        labelOk = "ok"
                                )
                        )
                )
        )
    }

    private fun submitButton(): Button {
        return Button(
                text = "Add to cart",
                styleId = "customButton",
                onPress = listOf(Navigate.PushView(Route.Remote("/detail")))
        )
    }

    private fun screenWidgets(): Widget {
        return Container(
                context = ContextData(
                        id = "context",
                        value = "$23.99"
                ),
                children = listOf(
                        outfitImage(),
                        submitButton()
                )
        ).applyStyle(
                Style(
                        flex = Flex(
                                grow = 1.0,
                                justifyContent = JustifyContent.SPACE_BETWEEN
                        ),
                        padding = EdgeValue(
                                left = 30.unitReal(),
                                right = 30.unitReal(),
                                bottom = 30.unitReal()
                        )
                )
        )
    }



    private fun outfitImage(): Widget {
        return Container(
                children = listOf(
//                        Image(
//                                path = ImagePath.Local.both("/image/shirt", "shirt"),
//                                mode = ImageContentMode.CENTER
//
//                        ).applyStyle(
//                                Style(cornerRadius = CornerRadius(20.0))
//                        ),
                            Image(
                                path = ImagePath.Remote(""),
                                mode = ImageContentMode.CENTER,
                                placeholder = ImagePath.Local.both("/image/shirt", "shirt")
                            ).applyStyle(
                                Style(cornerRadius = CornerRadius(20.0))
                            ),
                        ImageDetail(
                                value = expressionOf("@{context}"),
                                image = ImageType.RED_HEART
                        ).applyStyle(
                                Style(
                                        padding = EdgeValue(bottom = 5.unitReal()),
                                        margin = EdgeValue(horizontal = 10.unitReal()),
                                        positionType = PositionType.ABSOLUTE
                                )
                        )
                )
        ).applyStyle(
                Style(
                        flex = Flex(
                                justifyContent = JustifyContent.FLEX_START
                        ),
                        margin = EdgeValue(
                                left = 18.unitReal(),
                                right = 18.unitReal()
                        ),
                        size = Size(
                                height = 65.unitPercent()
                        )
                )
        )
    }
}
