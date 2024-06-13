package Generic_Example_3;
public class ArrayUnit 
{
    // generic swap method declaraation
    // <T> indicate that the method is generic

    public static <T> void swap(T[]arr,int index1,int index2)
    {

        if(arr==null || index1<0 || index2<0 || index1>=arr.length || index2>=arr.length)
        {
            //if any one condition will satisfied give Exception
            throw new IllegalArgumentException("Invalid indices or null array");
        }

        // Swaping elements
         T temp = arr[index1];
         arr[index1]=arr[index2];
         arr[index2]=temp;

    }

}