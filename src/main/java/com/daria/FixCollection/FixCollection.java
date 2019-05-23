package com.daria.FixCollection;

public class FixCollection<T> {
    private Object[] elements = {};
    private Object[] emptyElements = {};

    public FixCollection() {
        elements = new Object[16];
    }

    public FixCollection(int size) {
        if (size > 0) {
            this.elements = new Object[size];
        } else if (size == 0) {
            this.elements = emptyElements;
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " + size);
        }
    }

    public void add(Object value) {
        try {
            int end = elements.length - 1;
            if (elements[0] != null) {
                for (int i = 0; i < elements.length - 1; i++) {
                    elements[i] = elements[i + 1];
                }
                elements[end] = value;
            }

            for (int i = end; i >= 0; i--) {
                if (elements[i] == null) {
                    elements[i] = (T) value;
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Object get(int index) {
        return elements[index];
    }

    public int size() {
        return elements.length;
    }
}
