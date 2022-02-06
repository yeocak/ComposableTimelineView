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
- select any color
- select and change programmatically the nodeType
- change the size of middle circle via nodeSİze
- override the Modifier of SingleNode
- fill the inside of circle via isChecked
- change the dashed state via isDashed

------

#### *Example Usage:*
```kotlin
TimelineView.SingleNode(color = Color(33, 33, 33),
			nodeType = TimelineView.NodeType.FIRST,
			nodeSize = 50f,
			modifier = Modifier.padding(horizontal = 20.dp),
			isChecked = false,
			isDashed = true)
```
-------------

#### *How to add to my project:*
Add it in your root build.gradle at the end of repositories:
```
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```

Add the dependency in app.gradle:
```
dependencies {
	implementation 'com.github.yeocak:ComposableTimelineView:0.6'
}
```
