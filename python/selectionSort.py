def selectionSort(ip_arr):
    size = len(ip_arr)
    for i in range(size):
        minIdx = i
        for j in range(i+1,size):
            if ip_arr[j]<ip_arr[minIdx]:
                swap(ip_arr,j,minIdx)

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
    selectionSort(input)
    if checkSorted:
        print(input)
    else:
        print('fail')    