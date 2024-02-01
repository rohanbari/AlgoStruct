/*
 * Copyright (c) 2024 Rohan Bari <rohanbari@outlook.com>
 */

package org.rohanbari.data_structures;

/**
 * The Singly Linked List data structure.
 * <p>
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

    /**
     * Gets the size of the linked list.
     *
     * @return Size of the list
     */
    public int getSize() {
        return size;
    }

    /**
     * Checks if the linked list is empty.
     *
     * @return Is it empty?
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Returns the first element from the linked list.
     *
     * @return First element
     */
    public E first() {
        if (isEmpty()) return null;
        return head.getElement();
    }

    /**
     * Returns the last element from the linked list.
     *
     * @return Last element
     */
    public E last() {
        if (isEmpty()) return null;
        return tail.getElement();
    }

    // ---------- Update Methods ---------- //

    /**
     * Adds an element to the linked list from the head
     *
     * @param e Element
     */
    public void addFirst(E e) {
        head = new Node<>(e, head);
        if (size == 0) tail = head;
        size++;
    }

    /**
     * Adds an element to the linked list from the tail
     *
     * @param e Element
     */
    public void addLast(E e) {
        Node<E> newest = new Node<>(e, null);

        if (isEmpty()) head = newest;
        else tail.setNext(newest);

        tail = newest;
        size++;
    }

    /**
     * Removes the element from the head.
     */
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
