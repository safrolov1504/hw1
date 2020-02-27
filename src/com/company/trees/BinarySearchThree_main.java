package com.company.trees;

import java.util.Random;

public class BinarySearchThree_main {
    public static void main(String[] args) {
        Random random = new Random();
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();

        binarySearchTree.addValue(15);
        binarySearchTree.addValue(10);
        binarySearchTree.addValue(17);
        binarySearchTree.addValue(16);
        binarySearchTree.addValue(20);
        binarySearchTree.addValue(9);
        binarySearchTree.addValue(11);

        System.out.println("Высота дерева " + binarySearchTree.height() + " "+ binarySearchTree.isBalanced());

        System.out.println("Поиск не сущесвтующего значения " + binarySearchTree.searchValue(1));
        System.out.println("Поиск сущесвтующего значения " + binarySearchTree.searchValue(11));

        for (int i = 0; i < 20; i++) {
            binarySearchTree = new BinarySearchTree<>();

            while (binarySearchTree.height() != 6) {
                binarySearchTree.addValue(200*random.nextInt() - 100);
            }

            System.out.println("N = " +i + " " + binarySearchTree.height() + " " + binarySearchTree.isBalanced());
        }
    }
}
