def shellSort(ip_arr):
    size = len(ip_arr)
    h = 1
    while(h<size//3):
        h = h*3+1
    while(h>=1):
        for i in range(h,size):
            cur_idx = i
            while(cur_idx>=h and ip_arr[cur_idx]<ip_arr[cur_idx-h]):
                swap(ip_arr,cur_idx,cur_idx-h)
                cur_idx-=h
        h//=3

def swap(arr,index1,index2):
    temp = arr[index1]
    arr[index1] = arr[index2]
    arr[index2] = temp

def checkSorted(arr):
    # ascending order
    for i in range(1,len(arr)):
        if arr[i] < arr[i-1]:
            return False
    return True

if __name__ == "__main__":
    input = [31, 18, 20, 17, 18, 36, 44, 35, 22, 14]
    shellSort(input)
    if checkSorted:
        print(input)
    else:
        print('fail')    