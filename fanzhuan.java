/*
��ת������
������ָ��tail��p��q���������ڣ�����ǰ����ÿ�ν�p.nextָ��tail����q.nextָ��p
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
  