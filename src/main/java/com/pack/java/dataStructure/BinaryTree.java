package com.pack.java.dataStructure;

import lombok.val;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * 二叉树
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2020/12/20
 */
public class BinaryTree <T extends Comparable<? super T>>{


    /*
    功能实现：
    类变量
    构造器
    清空二叉树 makeEmpty
    判断是否为空 isEmpty
    判断是否包含某个值 contains
    找出最小值 findMin
    找出最大值 findMax
    插入节点 insert
    删除节点 remove
    打印树

    子树是否包含某个节点 contains(T x ,BinaryNode<T> t)
    找出子树的最小节点 findMin(BinaryNode<T> t)
    找出子树的最大节点 findMax(BinaryNode<T> t)
    将一个节点插入到子树 insert(T x,BinaryNode<T> t)
    从一个子树删除一个节点 remove(T x,BinaryNode<T> t)
     */
    private BinaryNode<T> root;

    public BinaryTree() {
        root = null;
    }

    public void makeEmpty() {
        root = null;
    }

    /**
     * null:true
     * 非空返回false
     * @return
     */
    public boolean isEmpty() {
        return root == null;
    }

    /**
     * true 包含某值
     * false：不包含
     * @param val
     * @return
     */
    public boolean contains(T val) {
         while(root!=null){
             int res = root.val.compareTo(val);
             if(res==0) return true;
             else if (res > 0) {
                 root = root.right;
             }else {
                 root = root.left;
             }
         }
         return false;
    }

    /**
     * 查询到最小值
     * @return
     */
    public T findMin() {
        if(root==null) return null;
        while(root.left!=null){
            root=root.left;
        }
        return root.val;
    }

    /**
     * 查询到最大值
     * @return
     */
    public T findMax() {
        if(root==null) return null;
        while (root.right != null) {
            root = root.right;
        }
        return root.val;
    }

    /**
     * 插入值
     */
    public void insert(T data) {
        insert(data, root);
    }

    /**
     * 删除值
     */
    public void remove(T data) {
        remove(data, root);
    }

    /**
     * 打印树
     * 前序遍历、中序遍历、后序遍历、层序遍历
     */
    public void printTree() {
        printTree(root);
    }


    /**
     * contains
     */
    public boolean contains(T data, BinaryNode<T> tree) {
        if (tree == null) {
            return false;
        }
        int res = tree.val.compareTo(data);
        if (res == 0) {
            return true;
        }else if(res>0) return contains(data, tree.left);
        else return contains(data, tree.right);
    }

    /**
     * 找出最大节点
     */
    public BinaryNode<T> findMax(BinaryNode<T> tree) {
        //if(tree==null) return null;
        //while (tree.right != null) {
        //    tree = tree.right;
        //}
        if (tree != null) {
            while(tree.right!=null) tree = tree.right;
        }
        return tree;
    }


    /**
     * 找出最小节点
     */
    public BinaryNode<T> findMin(BinaryNode<T> tree) {
        if(root==null) return null;
        while (root.left != null) {
            root = root.left;

        }
        return root;
    }

    /**
     * 插入节点
     */
    public BinaryNode<T> insert(T data, BinaryNode<T> tree) {
        if (tree == null) {
            return new BinaryNode<>(data, null, null);
        }
        int res = data.compareTo(tree.val);
        if(res>0){
            insert(data, tree.right);
        } else if (res < 0) {
            insert(data, tree.left);
        }
        return tree;
    }

    /**
     * 删除节点
     */
    public BinaryNode<T> remove(T data, BinaryNode<T> tree) {
        if(tree==null){
            return tree;
        }
        int res = data.compareTo(tree.val);
        if (res > 0) {
            remove(data, tree.right);
        } else if (res < 0) {
            remove(data, tree.left);
        }else if (tree.left != null && tree.right != null) {

                tree.val = findMin(tree.right).val;
                remove(tree.val, tree.right);
        } else {
                tree.val = (tree.left != null) ? tree.left.val : tree.right.val;
        }
        return tree;
    }

    /**
     * 遍历
     * @param tree
     */
    public void printTree(BinaryNode<T> tree) {

    }

    /**
     * 前序遍历
     */
    public void preTree(BinaryNode<T> tree) {
        if (tree != null) {
            System.out.println(tree.val);
            printTree(tree.left);
            printTree(tree.right);

        }
    }


    /**
     * 中序遍历
     * 递归
     */
    public void midTree(BinaryNode<T> tree) {
        if (tree != null) {
            printTree(tree.left);
            System.out.println(tree.val);
            printTree(tree.right);

        }
    }

    /**
     * 中序遍历
     * 栈
     */
    public List<T> midTree2(BinaryNode<T> tree) {
        List<T> res = new ArrayList<>();
        Stack<BinaryNode> data = new Stack<>();
        while (tree != null && !data.isEmpty()) {
            while (tree != null) {
                data.add(tree);
                tree = tree.left;
            }
            tree = data.pop();
            res.add((T) tree.val);
            tree = tree.right;
        }
        return res;
    }

    /**
     * 后序遍历
     */
    public void lastTree(BinaryNode<T> tree) {
        if (tree != null) {
            printTree(tree.left);
            printTree(tree.right);
            System.out.println(tree.val);
        }
    }

    /**
     * 后序栈
     */
    public List<T> lastTree2(BinaryNode<T> tree) {
        List<T> res = new ArrayList<>();
        Stack<BinaryNode<T>> data = new Stack<>();
        if(tree==null) return res;
        BinaryNode pre = null;
        while (tree != null || !data.isEmpty()) {
            while (tree != null) {
                data.add(tree);
                tree = tree.left;
            }
            tree = data.pop();
            if (tree.right == null || tree.right == pre) {
                res.add((T)tree.val);
                pre = tree;
                tree=null;
            }else {
                data.push(root);
                root = root.right;
            }
        }
        return res;
    }















}
