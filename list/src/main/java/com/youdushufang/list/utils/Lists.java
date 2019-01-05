package com.youdushufang.list.utils;

import com.youdushufang.list.singly.SinglyLinkedList;

import java.util.Arrays;

public class Lists {

    private Lists() {}

    @SafeVarargs
    public static <T> SinglyLinkedList<T> singlyLinkedListOf(T... data) {
        return new SinglyLinkedList<>(Arrays.asList(data));
    }
}
