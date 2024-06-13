package Generic_Example_5;
class Main 
{
    public static void main(String args[])
    {
        // integer array
        Integer[] arr={10,20,30,40,50,60,70,80,90,100,5,1000};
       Integer print= ArrayUnit.getIntMax(arr);
        System.out.println(print);

        //for string 
        String[] arr1={"vishal","vikram","ravi","kishan","zoom"};
        String print1= ArrayUnit.getIntMax(arr1);
         System.out.println(print1);

         //for double
         //for string 
        Double[] arr3={10.5,20.5,40.5,90.5,100.0,205.5};
        Double print3= ArrayUnit.getIntMax(arr3);
         System.out.println(print3);
 

        
    }

   
}