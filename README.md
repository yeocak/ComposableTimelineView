# Jetpack Compose Timeline View

![](https://github.com/yeocak/ComposableTimelineView/blob/master/forgithub/main.png)

nodeType/isDashed  |  True | False
------------- | ------------- | -------------
NodeType.FIRST  | ![](https://github.com/yeocak/ComposableTimelineView/blob/master/forgithub/yf.png)  | ![](https://github.com/yeocak/ComposableTimelineView/blob/master/forgithub/nf.png)
NodeType.MIDDLE  | ![](https://github.com/yeocak/ComposableTimelineView/blob/master/forgithub/ym.png)  | ![](https://github.com/yeocak/ComposableTimelineView/blob/master/forgithub/nm.png)
NodeType.SPACER  | ![](https://github.com/yeocak/ComposableTimelineView/blob/master/forgithub/ys.png)  | ![](https://github.com/yeocak/ComposableTimelineView/blob/master/forgithub/ns.png)
NodeType.LAST  | ![](https://github.com/yeocak/ComposableTimelineView/blob/master/forgithub/yl.png)  | ![](https://github.com/yeocak/ComposableTimelineView/blob/master/forgithub/nl.png)

------

#### *You can:*
- Select any color
- Select and change programmatically the nodeType
- Change the size of middle circle via nodeSİze
- Override the Modifier of SingleNode
- Fill the inside of circle via isChecked
- Change the dashed state via isDashed

------

#### *Example Usage*:
```kotlin
TimelineView.SingleNode(color = Color(33, 33, 33),
			nodeType = TimelineView.NodeType.FIRST,
			nodeSize = 50f,
			modifier = Modifier.padding(horizontal = 20.dp),
			isChecked = false,
			isDashed = true)
```
