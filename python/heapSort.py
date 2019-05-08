class HeapSort:
    def __init__(self,arr):
        self.arr = arr
        self.index = len(arr)-1
    
    def __heapify(self):
        last_parent = (self.index-1)//2
        for i in range(last_parent,-1,-1):
            self.__sink(i,len(self.arr)-1)
    
    def __sink(self,idx,last_index):
        while((2*idx)+1 <= last_index):
            larger_child = (2*idx)+1
            if larger_child < last_index:
                if self.__isLess(larger_child,larger_child+1):
                    larger_child+=1
            if self.__isLess(larger_child,idx):
                break
            self.__swap(larger_child,idx)
            idx = larger_child
    
    def __swap(self,i,j):
        temp = self.arr[i]
        self.arr[i] = self.arr[j]
        self.arr[j] = temp

    def __isLess(self,i,j):
        return self.arr[i] < self.arr[j] 
    
    def sort(self):
        self.__heapify()
        while(self.index>=1):
            self.__swap(0,self.index)
            self.index-=1
            self.__sink(0,self.index)

    def showHeap(self):
        print(self.arr)

if __name__ == "__main__":
    arr = [31, 18, 20, 17, 18, 36, 44, 35, 22, 14]
    heap = HeapSort(arr)
    heap.sort()
    heap.showHeap()
