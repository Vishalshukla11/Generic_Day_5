
//Write a method named printArray that takes an array of generic type T and prints 
//each element of the array on a new line.
//package generic_Example_2;
class print_Array 
{
     // Generic method to print each element of an array on a new line
    public static <T> void  printArray(T[]arr)
    {
        for(T ele:arr)
        {
            System.out.println(ele);
        }
        

    }
    public static void main(String args[])
    {
        //test with Integer Array 
        Integer [] intArray={1,2,3,4,5,6,4};
        System.out.println("Integer array :-");
        printArray(intArray);

        // test with string 
         String []StringArray={"vishal","Vikram","Vipul"};
         System.out.println("String array:- ");
         printArray(StringArray);

    }

}
