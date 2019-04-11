class Node:
    def __init__(self,initValue):
        self.val = initValue
        self.next = None
        self.prev = None

class LinkedList:
    def __init__(self):
        self.dummyNode = Node(None)
    
    def getDummyHead(self):
        return self.dummyNode
    
    def isEmpty(self):
        return self.dummyNode.val == None
    
    def deleteLinkedList(self):
        head = self.getDummyHead()
        while(head):
            current_node = head
            head = head.next
            current_node = None            

    def add_back(self,val):
        if self.dummyNode.val == None:
            newNode = Node(val)
            self.dummyNode = newNode
        else:
            last_node = self.dummyNode
            newNode = Node(val)
            while(last_node.next!=None):
                last_node = last_node.next
            last_node.next = newNode
            last_node.prev = last_node
    
    def add_front(self,val):
        newNode = Node(val)
        newNode.next = self.dummyNode
        self.dummyNode = newNode

    def printList(self):
        current_node = self.getDummyHead()
        while(current_node.next!=None):
            print(current_node.val)
            current_node = current_node.next
            

    
if __name__=="__main__":
    # ll = LinkedList()
    # ll.add_back(1)
    # ll.add_back(2)
    # ll.add_back(3)
    
    # ll.printList()

    llist = LinkedList()
    llist.add_front(1)
    llist.add_front(2)
    llist.add_front(3)
    llist.printList()

    # ll.deleteLinkedList()
    # ll.printList()

    

    