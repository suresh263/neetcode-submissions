/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
/*brute force*/
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
    
       ListNode dummy = new ListNode(0);
       ListNode headNode = dummy;
        List<Integer> nodeList = new ArrayList<>();
        while(head!=null)
        {
            nodeList.add(head.val);
            head = head.next;
        }
        
        for(int i=0;i+k-1<nodeList.size();i=i+k)
        {
          int left = i;
          int right = i+k-1;
          
          while(left<right)
          {
           int temp = nodeList.get(left);
           nodeList.set(left, nodeList.get(right));
           nodeList.set(right,temp);
           left++;
           right--;
          }   
        }
       
       for(int i=0;i<nodeList.size();i++)
       {
        dummy.next = new ListNode(nodeList.get(i));
        dummy=dummy.next;
       }
      
        return headNode.next;
    }
}
