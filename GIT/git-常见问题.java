----------------
Git
----------------
	# 因为不同平台换行符导致的问题
		### 针对仓库进行设置

		#### 1，添加文件: .gitattributes

			*.js -text # 对JS文件进行行结尾的处理

		#### 2，重新添加所有更改的文件并规范行尾

			git add --renormalize .
	
	# 代理设置
		# http或https代理
		git config --global http.proxy http://127.0.0.1:1080
		git config --global https.proxy https://127.0.0.1:1080

		# 取消代理
		git config --global --unset http.proxy
		git config --global --unset https.proxy