package com.rujirakongsomran.jc_jetpackglancealpha

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.glance.GlanceModifier
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.GlanceAppWidgetReceiver
import androidx.glance.background
import androidx.glance.layout.padding
import androidx.glance.text.Text

class HelloWorldWidget : GlanceAppWidget() {
    @Composable
    override fun Content() {
        Text(
            text = "Hello World!",
            modifier = GlanceModifier
                .background(Color.Green)
                .padding(16.dp)
        )
    }
}

class HelloWorldWidgetReceiver : GlanceAppWidgetReceiver() {
    override val glanceAppWidget: GlanceAppWidget
        get() = HelloWorldWidget()
}