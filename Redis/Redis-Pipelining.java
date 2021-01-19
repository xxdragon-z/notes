------------------------------
pipelining					  |
------------------------------
	# 传统的请求
		* 客户端向服务端发送一个查询请求,,监听Socket返回,通常是以阻塞模式,等待服务端响应
		* 服务端处理命令,并将结果返回给客户端
	
	# pipelining 请求
		* 以一次发送多个命令,并按顺序执行,最后才返回结果,节省RTT(Round Trip Time)
		* 一次 请求/响应 服务器能实现处理新的请求,即使旧的请求还未被响应

	# 使用管道发送命令时,服务器将被迫回复一个队列答复,占用很多内存
		* 如果需要发送大量的命令,最好是把他们按照合理数量分批次的处理,例如10K的命令,读回复,然后再发送另一个10k的命令
