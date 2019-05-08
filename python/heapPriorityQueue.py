class HeapPrioirtyQueue:
    def __init__(self):
        self.pq = []
        self.index = -1

    def insert(self,key):
        self.pq.append(key)
        self.index+=1
        self.__swim(self.index)
    
    def showPQ(self):
        print(self.pq)
    
    def pop(self):
        maxVal = self.pq[0]
        self.__swap(0,self.index)
        self.pq[self.index] = None
        self.index-=1
        self.__sink(0,self.index)
        return maxVal
    
    def __sink(self,idx,last_idx):
        while((2*idx)+1 <= last_idx):
            larger_child = (2*idx)+1
            if larger_child < last_idx:
                if self.__isLess(self.pq[larger_child],self.pq[larger_child+1]):
                    larger_child = larger_child+1
            if self.__isLess(self.pq[larger_child],self.pq[idx]):
                break
            self.__swap(idx,larger_child)
            idx = larger_child
            
    def __swim(self,idx):
        while(idx>=1 and self.__isLess(self.pq[(idx-1)//2],self.pq[idx])):
            self.__swap((idx-1)//2,idx)
            idx = (idx-1)//2
            
    def __isLess(self,w,v):
        return w < v

    def __swap(self,i,j):
        temp = self.pq[i]
        self.pq[i] = self.pq[j]
        self.pq[j] = temp
    
if __name__ == "__main__":
    pq = HeapPrioirtyQueue()
    pq.insert(5)
    pq.insert(4)
    pq.insert(10)
    pq.insert(100)
    pq.insert(6)
    pq.insert(1)
    pq.insert(7)
    pq.showPQ()
    maxVal = pq.pop()
    print(maxVal)
    pq.showPQ()
    