def mergeSort(ip_arr):
    aux_arr = [i for i in ip_arr]
    size = len(ip_arr)
    lo = 0
    hi = size - 1
    def __merge(ip_arr,aux_arr,lo,mid,hi):
        for i in range(lo,hi+1):
            aux_arr[i] = ip_arr[i]
        aux_k = lo
        aux_j = mid + 1
        for i in range(lo,hi+1):
            if aux_k > mid:
                ip_arr[i] = aux_arr[aux_j]
                aux_j += 1
            
            elif aux_j > hi:
                ip_arr[i] = aux_arr[aux_k]
                aux_k += 1
            
            elif aux_arr[aux_k] > aux_arr[aux_j]:
                ip_arr[i] = aux_arr[aux_j]
                aux_j += 1
            else:
                ip_arr[i] = aux_arr[aux_k]
                aux_k += 1
    
    def __sort(ip_arr,aux_arr,lo,hi):
        if hi <= lo:
            return
        mid = lo + (hi - lo)//2
        __sort(ip_arr,aux_arr,lo,mid)
        __sort(ip_arr,aux_arr,mid+1,hi)
        __merge(ip_arr,aux_arr,lo,mid,hi)
    
    def __show():
        print(ip_arr)
    
    __sort(ip_arr,aux_arr,lo,hi)
    __show()
if __name__ == "__main__":
    ip_arr = [31, 18, 20, 17, 18, 36, 44, 35, 22, 14]
    mergeSort(ip_arr)