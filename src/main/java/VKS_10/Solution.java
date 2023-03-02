package VKS_10;


public class Solution {

    public int price(int[] prices){
        int result = 0;
        int firstPoint = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if(firstPoint < prices[i]){
               result = Math.max(result, prices[i] - firstPoint);
            }else{
                firstPoint = prices[i];
            }
        }
        return result;
    }

    public ListNode reverse(ListNode listNode){
        ListNode lastPoint = null;
        ListNode current = listNode;
        while(current != null){
            ListNode next = current.next;
            current.next = lastPoint;
            lastPoint = current;
            current = next;
        }
        return lastPoint;
    }
}
