import random

class QuickSort:
    def __init__(self,ip_arr):
        self.ip_arr = ip_arr
    
    def __shuffle(self):
        for i in range(1,len(self.ip_arr)):
            j = random.randint(0,i)
            self.__swap(i,j)
    
    def __swap(self,i,j):
        temp = self.ip_arr[i]
        self.ip_arr[i] = self.ip_arr[j]
        self.ip_arr[j] = temp

    def __isSorted(self):
        for i in range(1,len(self.ip_arr)):
            if self.ip_arr[i] < self.ip_arr[i-1]:
                return False
        return True

    def __partition(self,lo,hi):
        pivot = lo
        i = pivot+1
        j = hi
        while(True):
            while(self.ip_arr[pivot] > self.ip_arr[i]):
                if i == hi:
                    break
                i+=1
            while(self.ip_arr[pivot] < self.ip_arr[j]):
                if j == lo:
                    break
                j-=1
            if(i>=j):
                self.__swap(pivot,j)
                pivot = j
                return pivot
            self.__swap(i,j)

    def __sort(self,lo,hi):
        if hi<=lo:
            return
        pivot = self.__partition(lo,hi)
        self.__sort(lo,pivot-1)
        self.__sort(pivot+1,hi)

    def sort(self):
        self.__shuffle()
        self.__sort(0,len(self.ip_arr)-1)
        if self.__isSorted():
            print(self.ip_arr)
        else:
            print("array unsorted")
            print(self.ip_arr)

if __name__ == "__main__":
    ip_arr = [31, 18, 20, 17, 18, 36, 44, 35, 22, 14]
    quickSort = QuickSort(ip_arr)
    quickSort.sort()
