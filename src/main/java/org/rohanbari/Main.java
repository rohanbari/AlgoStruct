/*
 * Copyright (c) 2024 Rohan Bari <rohanbari@outlook.com>
 */

package org.rohanbari;

public class Main {

    /**
     * The main method.
     *
     * @param args System arguments
     */
    public static void main(String[] args) {
        SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<>();

        linkedList.addFirst(10);
        linkedList.addFirst(20);
        linkedList.addFirst(30);
        linkedList.addLast(40);

        linkedList.removeFirst();

        System.out.println("Current size: " + linkedList.getSize());
        System.out.println(linkedList.first());
        System.out.println(linkedList.last());
    }
}

/**
 * The Singly Linked List data structure.
 *
 * TODO: It needs a way to traverse or iterate among its data members.
 *
 * @param <E> Type
 */
class SinglyLinkedList<E> {

    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    public SinglyLinkedList() {
    }

    // ---------- Access Methods ---------- //
    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E first() {
        if (isEmpty()) return null;
        return head.getElement();
    }

    public E last() {
        if (isEmpty()) return null;
        return tail.getElement();
    }

    // ---------- Update Methods ---------- //
    public void addFirst(E e) {
        head = new Node<>(e, head);
        if (size == 0) tail = head;
        size++;
    }

    public void addLast(E e) {
        Node<E> newest = new Node<>(e, null);

        if (isEmpty()) head = newest;
        else tail.setNext(newest);

        tail = newest;
        size++;
    }

    public void removeFirst() {
        if (isEmpty()) return;

        head = head.getNext();
        size--;

        if (size == 0) tail = null;
    }

    /**
     * Node sub-class.
     *
     * @param <E> Type
     */
    private static class Node<E> {
        private final E element;
        private Node<E> next;

        public Node(E e, Node<E> node) {
            this.element = e;
            this.next = node;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
}