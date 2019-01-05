package com.youdushufang.list;

import com.youdushufang.list.singly.SinglyLinkedList;
import com.youdushufang.list.utils.Lists;
import org.junit.Test;

public class SinglyLinkedListTest {

    @Test
    public void testReverse() {
        SinglyLinkedList<Integer> list1 = Lists.singlyLinkedListOf(1, 2, 3, 4, 5, 6, 7, 8 ,9 , 10);
        System.out.println(list1);
        list1.reverse();
        System.out.println(list1);

        SinglyLinkedList<Integer> list2 = Lists.singlyLinkedListOf(1);
        System.out.println(list2);
        list2.reverse();
        System.out.println(list2);

        SinglyLinkedList<Integer> list3 = Lists.singlyLinkedListOf(1, 2);
        System.out.println(list3);
        list3.reverse();
        System.out.println(list3);
    }
}
