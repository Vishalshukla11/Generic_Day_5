package Generic_Example_3;
public class Main 
{
    public static void main(String args[])
    {
      
        Integer [] arr= {100,90,30,40,50,60,70,80,20,10};
        System.out.print("before swaping the arr:- ");
        System.out.println(java.util.Arrays.toString(arr));

        System.out.println("after swapping");
     
        ArrayUnit.swap(arr,0,9);
        ArrayUnit.swap(arr,1,8);
        System.out.println(java.util.Arrays.toString(arr));

    }

    
}