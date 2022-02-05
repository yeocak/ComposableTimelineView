package com.yeocak.timelineview

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.DrawStyle
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.drawscope.Stroke
import kotlin.math.sin

internal object SingleNodeDrawings {

    fun DrawScope.drawNodeCircle(isChecked: Boolean, color: Color, radius: Float) {
        val centerOffset = Offset(size.width / 2, size.height / 2)

        if (isChecked) {
            drawCircle(
                color,
                radius,
                centerOffset
            )
        } else {
            val strokeWidth = radius / 2

            drawCircle(
                color,
                radius - strokeWidth / 2,
                centerOffset,
                style = Stroke(
                    strokeWidth
                )
            )
        }
    }

    fun DrawScope.drawSpacerLine(
        isDashed: Boolean,
        color: Color,
        width: Float
    ) {
        val centerX = size.width / 2

        var topPoint = Offset(centerX, 0f)
        var bottomPoint = Offset(centerX, size.height)

        if (isDashed) {
            var spaceBetween = width
            var singleLinePart = width * 3

            topPoint = topPoint.plus(Offset(0f,spaceBetween))
            bottomPoint = bottomPoint.minus(Offset(0f,spaceBetween))

            val numberOfLines = (((bottomPoint.y - topPoint.y) - spaceBetween) / (singleLinePart + spaceBetween)).toInt()
            val onePartHeight = (bottomPoint.y - topPoint.y) / numberOfLines

            spaceBetween = onePartHeight / 4f
            singleLinePart = onePartHeight / 4f * 3f

            //TODO
            topPoint = Offset(centerX, 0f)
            topPoint = topPoint.plus(Offset(0f,spaceBetween))

            for(a in 0 until numberOfLines){
                val newTopPoint = topPoint.plus(Offset(0f, a * (spaceBetween + singleLinePart)))
                val newBottomPoint = newTopPoint.plus(Offset(0f, singleLinePart))

                drawLine(
                    color,
                    newTopPoint,
                    newBottomPoint,
                    strokeWidth = width
                )
            }

        } else {
            drawLine(
                color,
                topPoint,
                bottomPoint,
                strokeWidth = width
            )
        }
    }

    fun DrawScope.drawTopLine(isDashed: Boolean, color: Color, width: Float, circleRadius: Float) {
        val centerX = size.width / 2

        val topPoint = Offset(centerX, 0f)
        val bottomPoint = Offset(centerX, size.height / 2 - circleRadius + 3)

        if (isDashed) {
            val spaceBetween = width
            val singleLinePart = width * 3

            var currentTopPoint = Offset(centerX, spaceBetween / 2)
            var currentBottomPoint = Offset(centerX, singleLinePart + spaceBetween / 2)

            val addingSet = Offset(0f, spaceBetween + singleLinePart)

            while (currentBottomPoint.y < bottomPoint.y) {
                drawLine(
                    color,
                    currentTopPoint,
                    currentBottomPoint,
                    strokeWidth = width
                )

                currentTopPoint = currentTopPoint.plus(addingSet)
                currentBottomPoint = currentBottomPoint.plus(addingSet)
            }

            drawLine(
                color,
                currentTopPoint,
                bottomPoint,
                strokeWidth = width
            )
        } else {
            drawLine(
                color,
                topPoint,
                bottomPoint,
                strokeWidth = width
            )
        }
    }

    fun DrawScope.drawBottomLine(
        isDashed: Boolean,
        color: Color,
        width: Float,
        circleRadius: Float
    ) {
        val centerX = size.width / 2

        val topPoint = Offset(centerX, size.height / 2 + circleRadius - 3)
        val bottomPoint = Offset(centerX, size.height)

        if (isDashed) {
            val spaceBetween = width
            val singleLinePart = width * 3

            var currentTopPoint = Offset(centerX, size.height - spaceBetween / 2 - singleLinePart)
            var currentBottomPoint = Offset(centerX, size.height - spaceBetween / 2)

            val addingSet = Offset(0f, spaceBetween + singleLinePart)

            while (currentTopPoint.y > topPoint.y) {
                drawLine(
                    color,
                    currentTopPoint,
                    currentBottomPoint,
                    strokeWidth = width
                )

                currentTopPoint = currentTopPoint.minus(addingSet)
                currentBottomPoint = currentBottomPoint.minus(addingSet)
            }

            drawLine(
                color,
                topPoint,
                currentBottomPoint,
                strokeWidth = width
            )
        } else {
            drawLine(
                color,
                topPoint,
                bottomPoint,
                strokeWidth = width
            )
        }
    }
}