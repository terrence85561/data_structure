class Node:
    def __init__(self,initValue):
        self.val = initValue
        self.next = None
        self.prev = None

class LinkedList:
    def __init__(self):
        self.dummyNode = None
        self.size = 0

    
    def getDummyHead(self):
        return self.dummyNode
    
    def isEmpty(self):
        if self.dummyNode == None:
            return True
        elif self.dummyNode != None:
            return False
    
    def deleteLinkedList(self):
        head = self.getDummyHead()
        while(head):
            current_node = head
            head = head.next
            current_node = None            

    def add_back(self,val):
        newNode = Node(val)
        if self.dummyNode == None:
            self.dummyNode = newNode
        else:
            prevNode = self.dummyNode
            while(prevNode.next != None):
                prevNode = prevNode.next
            prevNode.next = newNode

        
    def insertAfterNode(self,prevNode,val):
        if prevNode == None:
            print('prev node is not in list')
            return
        else:
            newNode = Node(val) 
            newNode.next = prevNode.next
            prevNode.next = newNode


    def add_front(self,val):
        newNode = Node(val)
        newNode.next = self.dummyNode
        self.dummyNode = newNode
        self.size+=1

    def printList(self):
        current_node = self.getDummyHead()
        while(current_node!=None):
            print(current_node.val)
            current_node = current_node.next
            
    def getLength(self):
        return self.size


if __name__=="__main__":
    ll = LinkedList()
    ll.add_back(1)
    ll.add_back(2)
    ll.add_back(3)
    ll.insertAfterNode(ll.dummyNode.next,4)
    ll.printList()
    

    llist = LinkedList()
    llist.add_front(1)
    llist.add_front(2)
    llist.add_front(3)
    # llist.printList()

  

    

    