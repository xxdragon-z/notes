------------------------
tkinker-布局			|
------------------------
	1,pack 布局
		* 它非常简单,我们不用做过多的设置,直接调用一个pack 函数就可以了
	
	2,grid 布局
		* grid 可以理解为网格,或者表格
		* 它可以把界面设置为几行几列的网格,我们在网格里插入我们想要的元素
		* 这种布局的好处是不管我们如何拖动窗口,相对位置是不会变化的,而且这种布局也超简单
	
	3,place 布局
		* 它直接使用死板的位置坐标来布局
		* 这样做的最大的问题在于当我们向窗口添加一个新部件的时候又得重新测一遍数据
		* 且我们不能随便地变大或者缩小窗口,否则,可能会导致混乱

