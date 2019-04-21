"""
Implement binary search using recursion method

"""

def binary_search(input_array, value,hi,lo):
    if hi < lo:
        return -1
    mid = (hi+lo)//2
    if value > input_array[mid]:  
        lo = mid + 1
        return binary_search(input_array,value,hi,lo)
    elif value < input_array[mid]:
        hi = mid -1 
        return binary_search(input_array,value,hi,lo)
    elif value == input_array[mid]:
        return mid


if __name__ == "__main__":
    test_list = [1,3,9,11,15,19,29]
    test_val1 = 25
    test_val2 = 15
    hi = len(test_list)-1
    lo = 0
    print (binary_search(test_list, test_val1,hi,lo))
    print (binary_search(test_list, test_val2,hi,lo))