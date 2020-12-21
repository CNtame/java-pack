package com.pack.java.dataStructure;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2020/12/21
 */
public class BinaryNode<T> {

    public T val;

    public BinaryNode<T> left;

    public BinaryNode<T> right;

    public BinaryNode(T val) {
        this(val,null,null);
    }

    public BinaryNode(T val, BinaryNode<T> left, BinaryNode<T> right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
