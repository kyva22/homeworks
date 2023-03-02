package VKS_10;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void priceTest(){
        Assert.assertEquals(5, solution.price(new int[]{7,1,5,3,6,4}));
        Assert.assertEquals(0, solution.price(new int[]{7,6,4,3,1}));
    }

    @Test
    public void reverseTest(){
        //Custom linkedList init
        ListNode startNode = new ListNode(1, new ListNode(2));
        ListNode secondNode = startNode.next;
        secondNode.next = new ListNode(3, new ListNode(4));
        ListNode lastNode = secondNode.next.next;
        lastNode.next = new ListNode(5);


        List<Integer> expected = List.of(5, 4, 3, 2, 1);
        List<Integer> result = new ArrayList<>();
        ListNode reversedNode = solution.reverse(startNode);

        while(reversedNode != null){
            result.add(reversedNode.val);
            reversedNode = reversedNode.next;
        }

        Assert.assertArrayEquals(new List[]{expected}, new List[]{result});
    }
}
