package com.yeocak.timelineview

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.yeocak.timelineview.SingleNodeDrawings.drawBottomLine
import com.yeocak.timelineview.SingleNodeDrawings.drawNodeCircle
import com.yeocak.timelineview.SingleNodeDrawings.drawSpacerLine
import com.yeocak.timelineview.SingleNodeDrawings.drawTopLine

object TimelineView {
    enum class NodeType {
        FIRST,
        MIDDLE,
        LAST,
        SPACER
    }

    @Composable
    fun SingleNode(
        color: Color,
        nodeType: NodeType,
        nodeSize: Float,
        modifier: Modifier = Modifier,
        isChecked: Boolean = false,
        isDashed: Boolean = false
    ) {
        Canvas(
            modifier = modifier
                .fillMaxHeight()
                .width((nodeSize/2).dp)
        ) {
            val nodeRadius = nodeSize / 2
            val lineWidth = (3f / 4 * nodeRadius).coerceAtMost(40f)

            when (nodeType) {
                NodeType.FIRST -> {
                    drawNodeCircle(isChecked,color,nodeRadius)
                    drawBottomLine(isDashed, color, lineWidth, nodeRadius)
                }
                NodeType.MIDDLE -> {
                    drawTopLine(isDashed, color, lineWidth, nodeRadius)
                    drawNodeCircle(isChecked,color,nodeRadius)
                    drawBottomLine(isDashed, color, lineWidth, nodeRadius)
                }
                NodeType.LAST -> {
                    drawTopLine(isDashed, color, lineWidth, nodeRadius)
                    drawNodeCircle(isChecked,color,nodeRadius)
                }
                NodeType.SPACER -> {
                    drawSpacerLine(isDashed, color, lineWidth)
                }
            }
        }
    }
}