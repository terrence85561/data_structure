def binary_search(input_array, value):
    if not input_array:
        return -1
    low = 0
    high = len(input_array)-1
    while(low<=high):
        mid = (high+low)//2
        if value < input_array[mid]:
            high = mid - 1
        elif value > input_array[mid]:
            low = mid + 1
        else:
           return mid
    return -1

if if __name__ == "__main__":
    test_list = [1,3,9,11,15,19,29]
    test_val1 = 25
    test_val2 = 15
    print (binary_search(test_list, test_val1))
    print (binary_search(test_list, test_val2))