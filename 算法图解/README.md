# Algorithms-DataStructure
This repository includes algorithms and data structure textbooks, learning code   
### First chapter - Introduction to Algorithms
- Binary Search: input is an `ordered list` of elements, If the element to be
is contained in the list, `returns its position`; `otherwise it returns null`.
- Big-O notation: The Big O representation allows you to compare operands, which indicates the `rate of increase` of the algorithm's `running time`.
### Second chapter - Selection sort
  - Array and Linked list:
    - 需要将数据存储到内存时，你请求计算机提供存储空间，计算机给你一个存储地址。需要存储多项数据时，有两种基本方式——`数组和链表`
    - 链表的优点：链表的优势在插入元素方面
      1. 链表中的元素可存储在内存的任何地方。链表的每个元素都存储了下一个元素的地址，从而使一系列随机的内存地址串在一起
    - 链表的缺点：在需要读取链表的最后一个元素时，你不能直接读取，必须按顺序一个一个读过去
      1. 需要同时读取所有元素时，链表的效率很高：你读取第一个元素，根据其中的地址再读取第二个元素，以此类推。但如果你需要跳跃，链表的效率真的很低。
      2. 在链表中，元素并非靠在一起的
    - 数组的优点：
      1. 需要随机地读取元素时，数组的效率很高，因为可迅速找到数组的任何元素   
    #### 总结起来：链表插入元素相较于数组更快，但是读取很慢（因为得一个一个读到最后一位索引）。数组读取更快，插入很慢。`链表插入、删除快，读取慢。数组插入、删除慢，读取快`
  - Selection sort