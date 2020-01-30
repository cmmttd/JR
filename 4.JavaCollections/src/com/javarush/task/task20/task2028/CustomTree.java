package com.javarush.task.task20.task2028;

<<<<<<< HEAD
import java.io.Serializable;
import java.util.AbstractList;
=======
import java.util.List;
>>>>>>> 204ef3588bc43f51a83e8b47dff53bb8b02ee0a3

/* 
Построй дерево(1)
*/
<<<<<<< HEAD
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
=======
public class CustomTree {

>>>>>>> 204ef3588bc43f51a83e8b47dff53bb8b02ee0a3
}
