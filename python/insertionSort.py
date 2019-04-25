def insertionSort(ip_arr):
    size = len(ip_arr)
    for i in range(1,size):
        counter = i
        while(counter>0 and ip_arr[counter]<ip_arr[counter-1]):
            swap(ip_arr,counter,counter-1)
            counter-=1

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
    insertionSort(input)
    if checkSorted:
        print(input)
    else:
        print('fail')    