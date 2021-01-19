
-------------------------------------------------------------------------------------------
							位运算
-------------------------------------------------------------------------------------------
运算符		|	运算		|BigInteger 方法	|	范例
-------------------------------------------------------------------------------------------
<<			|	左移		|shiftLeft(int n);	|3 << 2 = 12	-->		3 * 2 = 12
-------------------------------------------------------------------------------------------
>>			|	右移		|shiftRight(int n);	|3 >> 1 = 1		-->		3 / 2 = 1
-------------------------------------------------------------------------------------------
>>>			|	无符号右移	|					|3 >>> 1 = 1	-->		3 / 2 = 1
-------------------------------------------------------------------------------------------
&			|	与运算		|and(Integer num);	|6 & 3 = 2
-------------------------------------------------------------------------------------------
|			|	或运算		|or(Integer num);	|6 | 3 = 7
-------------------------------------------------------------------------------------------
^			|	异或运算	|xor(BigInteger num);|6 ^ 3 = 5
-------------------------------------------------------------------------------------------
~			|	反码		|not();				|~6 = -7
-------------------------------------------------------------------------------------------
			

------------------------
JAVA位移运算			|
-----------------------
	# 所谓的位运算,其实就是直接对二进制(位)进行计算
	# 运算最快的方式,其实就是位移运算
	# 在 BigInteger 类中都可以找到这些位移操作快捷的方法

	<<
		# 相当于乘与2的倍数
		# 移动N位,就是乘以2的n次幂
		# 先把数据转换为2进制,然后向着左边移动N个位置,右边空出来的补0
		# 越移越大
		# shiftLeft(int n);

	>>
		# 相当于除以2的倍数
		# 移动N位,就是除以2的n次幂
		# 先把数据转换为2进制,然后向着右边移动N个位置,左边空出来的补0
		# 越移越小
		# 向右移的时候,左边补充进来的最高位,到底要补啥?是根据你换算成2进制后最高位来定的
			0000-0000 0000-0000 0000-0000 0000-0110		//右移最高位补0
			1111-1111 1111-1111 1111-1111 1111-1111		//右移最高位补1
		# shiftRight(int n);

	>>>	
		# 右移的时候,不管你的二进制最高位是几,一律补0
	
	&
		# 6 & 3
		# 其就是把俩数据都换算为2进制
		# 0 代表 false,1 代表 true
		# 剩下就是就是 true & false,挨个比
		# true & true = true;		1 & 1 = 1
		# false & false = false;	0 & 0 = 0
		# false & true = false;		0 & 1 = 0;
		# 通俗,俩位对比,必须都是1,结果就是1
		# Demo
			110		
		  & 011
		  -----
		    010
		# and(Integer num);
	|
		# 6 | 3
		# 也是把俩数据都换算为2进制
		# 0 代表 false,1 代表 true
		# 剩下就是就是 true | false,挨个比
		# true | true = true;		1 | 1 = 1
		# false | false = false;	0 | 0 = 0
		# false | true = false;		0 | 1 = 1;
		# 通俗,俩位对比,只要有一位是1,结果就是1
		# Demo
			110
		  | 011
		  -----
		    111
		# or(Integer num);
	
	^
		# 6 ^ 3
		# 把俩数都换算为2进制
		# 挨个比较,如果两边都相同,则是假也就是 0,两边不同则是真 1
		# Demo
			110
		  ^ 011
		  -----
		    101
		# 一个值异或一次n,再异或一次n!那么结果还是该值
		# 7 ^ 2 = '结果'
		# '结果' ^ 2 = 7;
		# 这就是传说中的加密
		# 这个抑或的值,其实就是传说中的'密钥';
		# xor(BigInteger num);

	~
		# 其实就是取反,懒得解释了
		# Demo
		 0000-0000 0000-0000 0000-0000 0000-0110	
		~---------------------------------------
		 1111-1111 1111-1111 1111-1111 1111-1001	
		# not();


额外补充关于二进制的知识点

	# 一个数的二进制负数表现形式为:该数据的二进制取反 + 1
	# 最有效率的写出 2 * 8 的计算方式
		* 左移运算
		* 2<<3
		* 2 的三次方就是 8

	# 对俩整数变量值进行互换,不用第三方变量
		int n = 3;
		int m = 8;

		n = n ^ m;
		m = n ^ m;
		n = n ^ m;

