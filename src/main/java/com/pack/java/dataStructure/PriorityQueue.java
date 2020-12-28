package com.pack.java.dataStructure;

import org.apache.commons.collections.BufferUnderflowException;

/**
 * 优先队列、堆
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2020/12/28
 */
public class PriorityQueue <T extends Comparable<? super T>>{

    //初始数组大小
    private static final int DEFAULT_CAPACITY=10;

    //实际数组中元素个数
    private int currentSize;

    //数组
    private T[] data;

    /**
     * 构造
     */
    public PriorityQueue() {
        data = (T[]) new Comparable[DEFAULT_CAPACITY+1];
        this.currentSize=0;
    }

    public PriorityQueue(int capacity){
        data = (T[]) new Comparable[capacity+1];
        this.currentSize=0;
    }

    /**
     * 给一定数据
     * @param datas
     */
    public PriorityQueue(T[] datas){
        currentSize = datas.length;
        data = (T[]) new Comparable[(currentSize + 2) * 11 / 10];
        int i = 1;
        for (T d : datas) {
            data[i++] = d;
        }
        build();

    }

    /**
     * 插入数据
     * @param x
     */
    public void insert(T x){
        if (currentSize == data.length - 1) {
            enlargeArray(data.length*2);
        }
        int i = ++currentSize;
        for (data[0] = x; x.compareTo(data[i / 2]) > 0; i /= 2) {
            data[i] = data[i / 2];
        }
        data[i] = x;
    }

    /**
     * 查询最小值
     */
    public T findMin() {
        if(isEmpty()){
            return null;
        }
        return data[currentSize];
    }

    /**
     * 删除最小值
     * @return
     */
    public T deleteMin() {
        if (isEmpty()) {
            throw new BufferUnderflowException();
        }
        T min = findMin();
        data[1] = data[currentSize--];
        percolateDown(1);
        return min;
    }

    /**
     * 判断是否为空
     */
    public boolean isEmpty() {
        return currentSize == 0;
    }

    /**
     *
     */
    public void makeEmpty() {
        currentSize = 0;
    }


    /**
     * 下虑
     * 使得大元素下沉到底部
     */
    public void percolateDown(int hole) {
        T temp = data[hole];
        int child;
        for (; hole * 2 < currentSize; hole = child) {
            child = hole * 2;
            if (child != currentSize && data[child + 1].compareTo(data[child])<0) {
                child++;
            }
            if (data[child].compareTo(temp) < 0) {
                data[hole] = data[child];
            }else {
                break;
            }
        }
        data[hole] = temp;
    }


    public void build() {
        for (int i = currentSize / 2; i > 0; i--) {
            percolateDown(i);
        }
    }

    public void enlargeArray(int newSize) {
        T[] old = data;
        data = (T[]) new Comparable[newSize];
        System.arraycopy(old, 0, data, 0, old.length);
    }













}
