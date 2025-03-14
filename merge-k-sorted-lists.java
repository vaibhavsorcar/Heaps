
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;
        return dac(lists, 0, lists.length-1);
    }
    public ListNode dac(ListNode []lists, int left, int right){
        if( left == right) return lists[left];
        int mid = (left+right)/2;
        ListNode l1 = dac(lists, left, mid);
        ListNode l2 = dac(lists, mid+1, right);
        return merge(l1 ,l2);
    }
    public ListNode merge(ListNode l1, ListNode l2){
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        if(l1.val < l2.val){    
            l1.next = merge(l1.next, l2);
            return l1;
        }else{
            l2.next = merge(l2.next, l1);
            return l2;
        }
    }
}
