package com.example.flutapp

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.LinearLayout
import io.flutter.embedding.android.FlutterFragmentActivity
import io.flutter.plugin.platform.PlatformView
import org.godotengine.godot.GodotFragment

class MyQrView(
    context: Context, id: Int, creationParams: Map<String?, Any?>?,
    private val activity: FlutterFragmentActivity
) : PlatformView {
    private val linearLayout: LinearLayout
    private val frameLayout: FrameLayout

    override fun getView(): View {
        return linearLayout
    }

    override fun dispose() {}

    init {
        linearLayout = LinearLayout(context)
        linearLayout.layoutParams = ViewGroup.LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        frameLayout = FrameLayout(context)
        frameLayout.id = View.generateViewId()

        linearLayout.addView(frameLayout)

        frameLayout.apply {
            frameLayout.layoutParams.height = 300
            val fragmentTransaction = activity.supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(frameLayout.id, GodotFragment())
            fragmentTransaction.commit()
        }
    }


}