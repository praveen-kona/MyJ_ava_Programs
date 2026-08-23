package com.javaintroduction;

class VariblesConfusion
{
    int a=10;
    static int k=11;
    static void hello(int n,	VariblesConfusion m1)// for accesinng instance dat in static area with one object//
    {  
        System.out.println(k);
        System.out.println(n);
        System.out.println("hello");
        System.out.println(m1.a);
       
    }
    public void Main(int x)
    {
        System.out.println(a);
        System.out.println(x);
        System.out.println(k);
    }
    public static void main(String[] arhgs)
    {
    	VariblesConfusion m1=new VariblesConfusion();
        System.out.println(VariblesConfusion.k);
        System.out.println(m1.a);
        m1.Main(20);
        int l=30;
        VariblesConfusion.hello(l,m1);// for accesinng instance dat in static area with one object//

    }
}
