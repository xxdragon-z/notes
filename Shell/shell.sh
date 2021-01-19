--------------------------------
shell							|
--------------------------------
	# 官方
		https://www.gnu.org/software/bash/
		https://www.gnu.org/software/bash/manual/html_node/
	
	# 第一行指定运行的 bash
		#!/bin/bash
	
	# 查看系统的所有 shell处理器: cat /etc/shells
		/bin/sh
		/bin/bash
		/sbin/nologin
		/usr/bin/sh
		/usr/bin/bash
		/usr/sbin/nologin
		/bin/tcsh
		/bin/csh
	
	# 查看系统使用的shell
		echo $SHELL
	
	# 查看Bash的版本
		bash  --version
	
	# 运行方式
		* 直接运行(需要设置可执行权限:chdmo 775)
			./hello.sh

		* 以指定的shell运行脚本
		* 这种方式运行的脚本,第一行指定的解释器信息没用
			/bin/bash hello.sh
	
	# '#'开头的行就是注释,会被解释器忽略
	
	# 多行注释
		:<<EOF
			注释内容...
			注释内容...
			注释内容...
		EOF
		
		* EOF 也可以换做其他符号

		:<<'
			注释内容...
			注释内容...
			注释内容...
		'

		:<<!
			注释内容...
			注释内容...
			注释内容...
		!

	
--------------------------------
重定向输入输出					|
--------------------------------
	# 重定向输出
		cmd > target

		* 会把cmd命令执行的结果写入到target文件(文件不存在会创建)
		* 如果文件已经存在,那么会直接覆盖

	# 仅仅追加,不覆盖,使用 >>
		cmd >> target

	# 输入重定向
		cmd < target

		* 把target里面的数据重定向给cmd命令


	# 内联重定向
		..


--------------------------------
管道							|
--------------------------------
	# 把一个命令的输出,当作另一个命令的输入
		cmd1 | cmd2
		
		* 把cd1的输出结果写入到cmd2
		* 这俩命令并不是先后执行的,而是同时执行的,系统会在内部把他俩连接起来
	
	# 常用在more上
		 rpm -qa | sort | more

		 * 可以把很长的数据通过管道给more
		 * 从而仅仅显示一小段儿,可以通过翻页的形式来读取


--------------------------------
数学运算 - expr					|
--------------------------------
	# expr 执行乘法,乘号要转义
		expr 4 * 4	# expr: syntax error
		expr 4 \* 4 #16

		* 因为*号是特殊符号,需要使用 \ 来转义
	
	# 也可以使用方括号执行数学表达式
		val=$[5 + 5]
		echo $val # 10
		echo $[5 + ${val}] #15
	
		*  这种方式使用 *  来执行乘法操作,不用转义
	
	# bash中的数学运算,仅仅支持整数的运算
		v1=100
		v2=45
		echo $[v1 / v2]	# 2

		* 运算结果仅仅保留整数
		* 另一个shell(zshell)可以实现浮点数的运算
	
	# 浮点数的解决方案
		...


--------------------------------
当前进程的ID
--------------------------------
	# $$为当前 Shell 的进程 ID。
	
	# 这个特殊变量可以用来命名临时文件。
		LOGFILE=/tmp/output_log.$$
	


	

	