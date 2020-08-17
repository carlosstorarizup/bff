package br.com.zup.beagle.chat.bff.Widgets

import br.com.zup.beagle.annotation.RegisterWidget
import br.com.zup.beagle.widget.Widget

@RegisterWidget
class LogView(val message: String, val cor: String, val size: Float) : Widget()