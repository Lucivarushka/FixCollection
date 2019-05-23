package com.daria.FixCollection;

public class FixCollectionTest {
    public static void main(String[] args) {
        testAddandLeftShift();
        testSize();
    }

    private static void testAddandLeftShift() {
        FixCollection<Integer> collection = new FixCollection<>(5);
        collection.add(1);
        collection.add(2);
        collection.add(3);
        collection.add(4);
        collection.add(5);
        int a = (int) collection.get(4);

        if (a == 1) {
            System.out.println("TestAdd passed");
            printCollection(collection);
        }
        collection.add(6);
        collection.add(7);

        int b = (int) collection.get(4);
        if (b == 7) {
            System.out.println("TestLeftShift passed");
            printCollection(collection);
        }
    }

    private static void testSize() {
        FixCollection<Integer> collection = new FixCollection<>();
        int size = collection.size();
        if (size == 16) {
            System.out.println("TestSize exp.Empty passed. Size - " + size);
        }
        FixCollection<Integer> collection2 = new FixCollection<>(8);
        int size2 = collection2.size();
        if (size2 == 8) {
            System.out.println("TestSize exp.8 passed. Size - " + size2);
        }
    }

    private static void printCollection(FixCollection<Integer> collection) {
        for (int i = 0; i < collection.size(); i++) {
            System.out.print(collection.get(i) + " ");
        }
        System.out.println();
    }
}