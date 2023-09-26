# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        carry = 0
        remainder = 0
        myNode = ListNode(0)
        currNode = myNode

        while l1 != None or l2 != None or carry != 0:
            l1val = l1.val if l1 != None else 0
            l2val = l2.val if l2 != None else 0

            val = l1val + l2val + carry

            newNode = ListNode(val % 10)
            currNode.next = newNode
            currNode = currNode.next
            carry = val // 10
            l1 = l1.next if l1 != None else None
            l2 = l2.next if l2 != None else None
                   
        return myNode.next
