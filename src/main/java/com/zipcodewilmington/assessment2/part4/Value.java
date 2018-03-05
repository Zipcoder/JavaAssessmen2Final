package com.zipcodewilmington.assessment2.part4;

public class Value <T>
{
    private T value;

    public Value(T value)
    {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
