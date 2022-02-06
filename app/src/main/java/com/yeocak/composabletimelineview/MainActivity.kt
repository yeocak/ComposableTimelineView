package com.yeocak.composabletimelineview

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yeocak.composabletimelineview.ui.theme.ComposableTimelineViewTheme
import com.yeocak.timelineview.TimelineView
import com.yeocak.timelineview.TimelineView.SingleNode

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposableTimelineViewTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colors.background
                ) {
                    DefaultPreview()
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    Column {
        Row(
            modifier = Modifier
                .height(IntrinsicSize.Min)
        ) {
            SingleNode(
                color = Color(33, 33, 33),
                nodeType = TimelineView.NodeType.MIDDLE,
                nodeSize = 50f,
                modifier = Modifier.padding(horizontal = 20.dp),
                isChecked = true,
                isDashed = false
            )
            Image(
                painterResource(R.drawable.one),
                "content description",
                modifier = Modifier.height(210.dp).width(180.dp)
            )
        }
        Row(
            modifier = Modifier
                .height(IntrinsicSize.Min)
        ) {
            SingleNode(
                color = Color(33, 33, 33),
                nodeType = TimelineView.NodeType.MIDDLE,
                nodeSize = 50f,
                modifier = Modifier.padding(horizontal = 20.dp),
                isChecked = true,
                isDashed = false
            )
            Image(
                painterResource(R.drawable.five),
                "content description",
                modifier = Modifier.size(50.dp)
            )
        }
        Row(
            modifier = Modifier
                .height(IntrinsicSize.Min)
        ) {
            SingleNode(
                color = Color(33, 33, 33),
                nodeType = TimelineView.NodeType.SPACER,
                nodeSize = 50f,
                modifier = Modifier.padding(horizontal = 20.dp),
                isChecked = false,
                isDashed = false
            )
            Image(
                painterResource(R.drawable.two),
                "content description",
                modifier = Modifier.size(120.dp)
            )
        }
        Row(
            modifier = Modifier
                .height(IntrinsicSize.Min)
        ) {
            SingleNode(
                color = Color(33, 33, 33),
                nodeType = TimelineView.NodeType.SPACER,
                nodeSize = 50f,
                modifier = Modifier.padding(horizontal = 20.dp),
                isChecked = false,
                isDashed = true
            )
            Image(
                painterResource(R.drawable.three),
                "content description",
                modifier = Modifier.height(170.dp).width(250.dp)
            )
        }
        Row(
            modifier = Modifier
                .height(IntrinsicSize.Min)
        ) {
            SingleNode(
                color = Color(33, 33, 33),
                nodeType = TimelineView.NodeType.LAST,
                nodeSize = 50f,
                modifier = Modifier.padding(horizontal = 20.dp),
                isChecked = false,
                isDashed = true
            )
            Image(
                painterResource(R.drawable.five),
                "content description",
                modifier = Modifier.size(90.dp)
            )
        }
    }

}