----------------------
ss						|
----------------------
	# 代替netstat...等命令
	# ss
	# 参数
		-t	
			* tcp  仅显示 TCP套接字
		-u	
			* udp  仅显示 UCP套接字
		
		-n 
			* 拒绝显示别名，能显示数字的全部转化成数字。
			* 不解析服务名称
		-a	
			* all  显示所有套接字
		-l 
			* listening 显示监听状态的套接字
		-p	
			* processes 显示使用套接字的进程
		
	
		