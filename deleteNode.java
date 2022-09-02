/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public void deleteNode(ListNode node) {
  ListNode temp;
  temp = node.next;
  node.val = temp.val;
  node.next = temp.next;
  temp.next = null;
  return;
}

/**
 public void deleteNode(ListNode node) {
        ListNode tmp = node;
        while(node.next != null){
            node.val = node.next.val;
            tmp = node;
            node=node.next;
        }
        tmp.next = null;
        */
