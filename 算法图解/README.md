# Algorithms-DataStructure
This repository includes algorithms and data structure textbooks, learning code   
### First chapter - Introduction to Algorithms
- Binary Search: 其输入是一个有序的元素列表（必须有序的原因稍后解释）。如果要查找的元素包含在列表中，二分查找**返回其位置**；否则返回null
- 对于包含n个元素的列表，二分查找最多需要log2n步，简单查找最多需要n步
- **仅当列表是有序的时候，二分查找才管用。**
### Second chapter - Selection sort
  - Array and Linked list:
    - 需要存储多项数据到内存时，有两种基本方式——`数组和链表`
    - 链表的优点：链表的优势在插入元素方面
      1. 链表中的元素可存储在内存的任何地方。链表的每个元素都存储了下一个元素的地址，从而使一系列随机的内存地址串在一起
    - 链表的缺点：在需要读取链表的最后一个元素时，你不能直接读取，必须按顺序一个一个读过去
      1. 需要同时读取所有元素时，链表的效率很高：你读取第一个元素，根据其中的地址再读取第二个元素，以此类推。但如果你需要跳跃，链表的效率真的很低。
      2. 在链表中，元素并非靠在一起的
    - 数组的优点：
      1. 需要随机地读取元素时，数组的效率很高，因为可迅速找到数组的任何元素
  #### 总结：链表插入、删除快，读取慢（因为得一个一个读到最后一位索引）。数组插入、删除慢，读取快`
  - Selection sort