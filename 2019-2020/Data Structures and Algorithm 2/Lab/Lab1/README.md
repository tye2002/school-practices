# Heap
A Heap is a special Tree-based data structure in which the tree is a complete binary tree. Generally, Heaps can be of two types:

## Max-Heap: 
In a Max-Heap the key present at the root node must be greatest among the keys present at all of it’s children. The same property must be recursively true for all sub-trees in that Binary Tree.
### Operations on Max Heap:
1)	getMax(): It returns the root element of Max Heap. Time Complexity of this operation is O(1).
2)	extractMax(): Removes the maximum element from MaxHeap. Time Complexity of this Operation is O(Log n) as this operation needs to maintain the heap property (by calling heapify()) after removing root.
3)	insert(): Inserting a new key takes O(Log n) time. We add a new key at the end of the tree. If new key is smaller than its parent, then we don’t need to do anything. Otherwise, we need to traverse up to fix the violated heap property

## Min-Heap:
In a Min-Heap the key present at the root node must be minimum among the keys present at all of it’s children. The same property must be recursively true for all sub-trees in that Binary Tree.
### Operations on Min Heap:
1)	getMin(): It returns the root element of Min Heap. Time Complexity of this operation is O(1).
2)	extractMin(): Removes the minimum element from MinHeap. Time Complexity of this Operation is O(Log n) as this operation needs to maintain the heap property (by calling heapify()) after removing root.
3)	insert(): Inserting a new key takes O(Log n) time. We add a new key at the end of the tree. If new key is larger than its parent, then we don’t need to do anything. Otherwise, we need to traverse up to fix the violated heap property.

##
For its completeness, a heap can be implemented using an array. The index 0 can be used or not and the corresponding parent-children relation fomulars may be different.
* **Index 0 is used:**
  * parent(i) = (i -1) / 2
  * left(i) =  (2 * i) + 1
  * right(i) = (2 * i) + 2
* **Index 0 is not used:**
  * parent(i) = floor(i/2),
  * left(i) =  2*i
  * right(i) = 2*i + 1

# Prioprity queue
A priority queue is an abstract data type which is like a regular queue data structure, but where additionally each element has a "priority" associated with it. In a priority queue, an element with high priority is served before an element with low priority.

We can always define higher priority = higher number  or it’s opposite: higher priority = lower number. A max or min heap can be used to implement a prioprity queue.
# Heap sort
Heap sort is a comparison based sorting technique based on Binary Heap data structure. It is similar to selection sort where we first find the maximum element and place the maximum element at the end. We repeat the same process for remaining element.

Heap Sort Algorithm for sorting in increasing order:
1.	Build a max heap from the input data.
2.	At this point, the largest item is stored at the root of the heap. Replace it with the last item of the heap followed by reducing the size of heap by 1. Finally, heapify the root of tree.
3.	Repeat above steps while size of heap is greater than 1.

# Exercises:
## Exercise 1:
Implement your own Java class of maxheap of integers.
## Exercise 2:
Insert some integers into your maxheap and print it on the screen.  
Eg: input is 5, 3, 17, 10, 84, 19, 6, 22, 9 and the result is:

 `The Max Heap is`  
 `PARENT : 84 LEFT CHILD : 22 RIGHT CHILD :19`  
 `PARENT : 22 LEFT CHILD : 17 RIGHT CHILD :10`  
 `PARENT : 19 LEFT CHILD : 5 RIGHT CHILD :6`  
 `PARENT : 17 LEFT CHILD : 3 RIGHT CHILD :9`  
 `The max val is 84`

## Exercise 3:
Get max of your maxheap and print the heap again.
## Exercise 4:
Implement your own java class of minheap of integers.
## Exercise 5:
Insert some integers into your minheap and print it on the screen.  
Eg: input is 5, 3, 17, 10, 84, 19, 6, 22, 9 and the result is:

 `The Min Heap is`  
`PARENT : 3 LEFT CHILD : 5 RIGHT CHILD :6`  
`PARENT : 5 LEFT CHILD : 9 RIGHT CHILD :84`  
`PARENT : 6 LEFT CHILD : 19 RIGHT CHILD :17`  
`PARENT : 9 LEFT CHILD : 22 RIGHT CHILD :10`  
`The Min val is 3`  

## Exercise 6:
Get min of your minheap and print the heap again.
## Exercise 7:
Implement your heap sort and sort the following numbers:  
15, 23, 18, 63, 21, 35, 36 21, 66, 12, 42, 35, 75 23, 64, 78, 39
