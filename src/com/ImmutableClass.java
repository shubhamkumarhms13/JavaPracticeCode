package com;

import java.util.ArrayList;
import java.util.List;

public final class ImmutableClass {
    private final int id;
    private final String name;
    private final List<Object> petNameList;

    ImmutableClass(int id, String name, List<Object> petNameList) {
        this.id = id;
        this.name = name;
        this.petNameList = new ArrayList<>(petNameList);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Object> getPetNameList() {
        return new ArrayList<>(petNameList);
    }

    public static void main(String[] args) {
        List<Object> names = new ArrayList<>();
        names.add("Tommy");
        names.add("Jerry");
        names.add("Bhow");
        ImmutableClass imc1 = new ImmutableClass(1, "Harry", names);
        names.add("Meow");
        System.out.println(imc1.getPetNameList());
        ImmutableClass imc2 = new ImmutableClass(2, "Peter", names);
        names.add("Okay");
        System.out.println(imc2.getPetNameList());
    }
}
