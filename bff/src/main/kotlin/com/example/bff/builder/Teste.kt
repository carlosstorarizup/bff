package com.example.bff.builder

import br.com.zup.beagle.chat.bff.Widgets.LogView
import br.com.zup.beagle.core.*
import br.com.zup.beagle.ext.*
import br.com.zup.beagle.widget.Widget
import br.com.zup.beagle.widget.action.Alert
import br.com.zup.beagle.widget.action.Navigate
import br.com.zup.beagle.widget.action.Route
import br.com.zup.beagle.widget.core.*
import br.com.zup.beagle.widget.layout.*
import br.com.zup.beagle.widget.ui.*

class Teste {
    fun createTest() = Container(
            children = listOf(

                    LogView("TESTE","#00FA9A", 50.0f)
            )

    )


}