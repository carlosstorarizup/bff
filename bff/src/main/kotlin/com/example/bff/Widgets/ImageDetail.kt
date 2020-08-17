package com.example.bff.Widgets

import br.com.zup.beagle.annotation.RegisterWidget
import br.com.zup.beagle.widget.Widget
import br.com.zup.beagle.widget.context.Bind
import enum.ImageType

@RegisterWidget
data class ImageDetail(
        val value: Bind<String>,
        val image: ImageType
) : Widget()
