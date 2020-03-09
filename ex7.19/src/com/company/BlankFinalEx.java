package com.company;

public class BlankFinalEx {
    private final Poppet p;

    public BlankFinalEx()
    {
        p = new Poppet(1);
    }
    public BlankFinalEx(int x)
    {
        p = new Poppet(x);
    }
    public  Poppet get()
    {
        return this.p;
    }
}
