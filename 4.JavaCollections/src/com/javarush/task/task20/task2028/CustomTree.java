package com.javarush.task.task20.task2028;

import java.io.Serializable;
import java.util.AbstractList;

/* 
Построй дерево(1)
*/
public class CustomTree extends AbstractList implements Cloneable, Serializable {

    private Node root;

    private class Node{
        private int value;
        private Node leftChild = null;
        private Node rightChild = null;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "value: " + value;
        }
    }

    public CustomTree() {
    }

    public void add(int value){

    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
