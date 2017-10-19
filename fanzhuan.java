/*
反转单链表
用三个指针tail，p，q，紧紧相邻，不断前进，每次将p.next指向tail，将q.next指向p
*/
package com.Liu.Work.File;

public class Solution {
	public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode tail = head.next;
        head.next = null;
        ListNode newHead = reverseList(tail);
        tail.next = head;
        
        return newHead;
    }
}
public class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val=val;
        this.next=null;
  