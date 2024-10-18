package type4;

import type3.MyInterface;

public class Demo 
{
	public static void main(String[] args)
	{
		MyInterface my1 = (int x,int y)->{return(x+y);
        System.out.println(my1.sum(10, 20));
        
        MyInterface my2 = (int x,int y)->{return(x+y);
        System.out.println(my2.sum(10, 20));
        
        MyInterface my3 = (int x,int y)->return(x+y);
       
}
}
