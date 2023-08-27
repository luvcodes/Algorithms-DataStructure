def bfs(start):
	# 这里就是Step 1 初始化队列和集合
	queue = deque() # 用来存所有的邻居
	visited = set() # 避免重复访问，数和无环有向图不需要

	# Step 2 把起点加入
	queue.append(start) # 把开始节点加入queue
	visited.add(start) # 标记开始节点已访问

	while queue: # 当queue为空的时候结束

		size = len(queue) # 记住当前level的node数量

		# Step 3 记录队列长度
		# 访问当前层级
		for i in range(size): # 遍历并把所有节点加到queue 
			cur = queue.popleft()

			# Step 4 遍历当前层级
			# 加入当前节点的逻辑
			for node in cur.adj():
				# Step 5 遍历下一层级
				if not node in visited:
					q.append(node)
					visited.add(node)