package org.example;

import lombok.*;

public @Data class TryingOutLombok {
    public TryingOutLombok(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;


    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "TryingOutLombok{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
