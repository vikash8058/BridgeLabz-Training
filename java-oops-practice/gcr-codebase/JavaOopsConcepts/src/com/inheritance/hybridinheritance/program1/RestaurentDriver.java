package com.inheritance.hybridinheritance.program1;

public class RestaurentDriver {
    public static void main(String[] args) {

        Worker chef = new Chef("Ramesh", 101);
        Worker waiter = new Waiter("Sohan", 102);

        chef.performDuties();
        waiter.performDuties();
    }
}
