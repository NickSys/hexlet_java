package com.lesson4;


public class Human {

    private String name;

    private int money;

    public Human(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public Human(String name) {
        this(name,0);
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public Account getNewAccount() {
        return new HumanAccount();
    }

    @Override
    public String toString() {
        return getName();
    }

    private class HumanAccount implements Account {
        @Override
        public int getSum() {
            return money;
        }

        @Override
        public void changeSum(int delta) {
            money += delta;
        }
    }
}
