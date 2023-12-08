package com.example.flutapp

import android.content.Context
import io.flutter.embedding.android.FlutterFragmentActivity
import io.flutter.plugin.common.StandardMessageCodec
import io.flutter.plugin.platform.PlatformView
import io.flutter.plugin.platform.PlatformViewFactory


class MyQrViewFactory(private val activity: FlutterFragmentActivity) : PlatformViewFactory(StandardMessageCodec.INSTANCE) {
    override fun create(context: Context, viewId: Int, args: Any?): PlatformView {
        val creationParams = args as Map<String?, Any?>?
        return MyQrView(context, viewId, creationParams,activity)
    }
}