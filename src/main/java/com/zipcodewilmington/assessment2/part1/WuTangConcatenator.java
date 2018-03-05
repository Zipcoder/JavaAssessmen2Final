package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator
{
    private Integer multiple;

    public WuTangConcatenator(Integer multiple)
    {
        this.multiple = multiple;

    }

    public boolean isWu()
    {
        if (multiple % 3 == 0)
        {
            return true;
        }

        return false;
    }

    public boolean isTang()
    {
        if (multiple % 5 == 0)
        {
            return true;
        }

        return false;

    }

    public boolean isWuTang()
    {
        if(multiple % 3 == 0 && multiple % 5 == 0)
        {
            return true;
        }

        return false;

    }
}
