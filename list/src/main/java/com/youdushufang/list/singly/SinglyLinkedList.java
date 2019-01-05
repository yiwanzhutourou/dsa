package com.youdushufang.list.singly;

import com.youdushufang.utils.CollectionUtils;

import java.util.Collection;

public class SinglyLinkedList<T> {

    private Node<T> head;

    private Node<T> tail;

    public SinglyLinkedList(Collection<T> data) {
        addAll(data);
    }

    private void add(T data) {
        if (this.head == null) {
            this.head = new Node<>(data);
            this.tail = this.head;
            return;
        }

        Node<T> newNode = new Node<>(data);
        this.tail.setNext(newNode);
        this.tail = newNode;
    }

    private void addAll(Collection<T> data) {
        if (!CollectionUtils.isEmpty(data)) {
            data.forEach(this::add);
        }
    }

    public void reverse() {
        Node<T> first = this.head;
        if (first == null || first.getNext() == null) {
            return;
        }

        Node<T> second = first.getNext();
        first.setNext(null);
        this.head = this.tail;
        this.tail = first;
        Node<T> third = second.getNext();
        while (third != null) {
            second.setNext(first);
            first = second;
            second = third;
            third = third.getNext();
        }
        second.setNext(first);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Node<T> node = this.head;
        while (node != null) {
            stringBuilder.append(node.getData());
            node = node.getNext();
            if (node != null) {
                stringBuilder.append("->");
            }
        }
        return stringBuilder.toString();
    }
}
