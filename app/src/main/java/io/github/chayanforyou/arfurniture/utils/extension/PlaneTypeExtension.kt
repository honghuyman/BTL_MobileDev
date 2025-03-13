package io.github.chayanforyou.arfurniture.utils.extension

import android.content.Context
import com.google.ar.core.Config.PlaneFindingMode
import io.github.chayanforyou.arfurniture.R

fun PlaneFindingMode.getDescription(context: Context): String =
    when (this) {
        PlaneFindingMode.HORIZONTAL -> R.string.message_scan_horizontal_plane
        PlaneFindingMode.VERTICAL -> R.string.message_scan_vertical_plane
        else -> R.string.message_scan_any_plane
    }.let { res ->
        context.getString(res)
    }