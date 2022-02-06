# Jetpack Compose Timeline View

![](https://raw.githubusercontent.com/yeocak/ComposableTimelineView/master/forgithub/Ekran%20g%C3%B6r%C3%BCnt%C3%BCs%C3%BC%202022-02-05%2020-50-40.png)

nodeType/isDashed  |  True | False
------------- | ------------- | -------------
NodeType.FIRST  | Content Cell  | Content Cell
NodeType.MIDDLE  | Content Cell  | Content Cell
NodeType.SPACER  | Content Cell  | Content Cell
NodeType.LAST  | Content Cell  | Content Cell

------

#### *You can:*
- Select any color
- Select and change programmatically the nodeType
- Change the size of middle circle via nodeSİze
- Override the Modifier of SingleNode
- Fill the inside of circle via isChecked
- Change the dashed state via isDashed

------

####Example Usage:
```kotlin
TimelineView.SingleNode(color = Color(33, 33, 33),
					nodeType = TimelineView.NodeType.FIRST,
					nodeSize = 50f,
					modifier = Modifier.padding(horizontal = 20.dp),
					isChecked = false,
					isDashed = true)
```