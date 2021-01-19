————————————————————————————————
1,Linux-用户&用户组管理			|
————————————————————————————————
	whoami				//我是谁,显示当前用户
	useradd name		//添加一个用户
		-s:指定用户登陆时使用的shell类型
		-g:指定所属组，该组必须存在
		-G:指定附属组，该组必须存在
		-d:用户的家目录
		-m:用户家目录不存在时，自动创建该目录
		* 如果没有指定组，那么就添加一个跟用户名一模一样的组

	passwd 用户名		//为指定用户创建密码，必须是root权限
	su 用户名			//切换用户
	userdel				//删除一个用户
	usermod -g 组 用户名	//修改指定用户的组
	groupadd 组名		//添加一个分组
	groupdel 组名		//删除一个分组
