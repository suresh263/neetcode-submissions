/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {

     Map<Node,Node> frequencyMap = new HashMap<>();

     Node first = head;

     while(first!=null)
     {
        frequencyMap.put(first,new Node(first.val));
        first = first.next;
     }

    Node second = head;
    
     while(second!=null)
     {
       Node currentNode = frequencyMap.get(second);
       currentNode.next = frequencyMap.get(second.next);
       currentNode.random = frequencyMap.get(second.random);
       second = second.next;
     }

    return frequencyMap.get(head);
    }
}
