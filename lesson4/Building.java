package com.lesson4;

import java.util.Iterator;

public class Building implements Iterable<Human>{

    private static final int BUILDING_CAPACITY = 10;

    private Human[] humans = new Human[BUILDING_CAPACITY];

    private int size = 0;

    public int getSize() {
        return size;
    }

    public void addHuman (Human human) {
        if (getSize() == BUILDING_CAPACITY)
            return;
        humans[size++] = human;
    }

    public Human get(int index) {
        return humans[index];
    }

    @Override
    public Iterator<Human> iterator() {
        return new HumanIterator();
    }

    private class HumanIterator implements Iterator<Human>{
        private int current = 0;

        @Override
        public boolean hasNext() {
            return current < size;
        }

        @Override
        public Human next() {
            return humans[current++];
        }

        @Override
        public void remove() {


        }
    }
}
