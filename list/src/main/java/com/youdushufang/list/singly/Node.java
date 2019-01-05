package com.youdushufang.list.singly;

public class Node<T> {

    private Node<T> next;

    private T data;

    Node(T data) {
        this.data = data;
    }

    Node<T> getNext() {
        return next;
    }

    void setNext(Node<T> next) {
        this.next = next;
    }

    T getData() {
        return data;
    }

    @Override
    public String toString() {
        return String.valueOf(data);
    }
}
