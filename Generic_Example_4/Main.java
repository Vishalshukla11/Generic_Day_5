package Generic_Example_4;

import java.util.List;
import java.util.ArrayList;

public class Main
{
    public static void main(String args[])
    {
        GenericArray ref= new GenericArray();
       
        Integer[] intarr= {10,20,30,40,50,60,70,80,90,100};
        List<Integer> intList=ref.ToList(intarr);
        System.out.println(intList);

    }

    
}