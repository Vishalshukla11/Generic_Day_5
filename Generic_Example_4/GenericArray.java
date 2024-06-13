/*Write a generic method toList that converts an array of type T to a List<T>. 
Test this method with arrays of different types. */
package Generic_Example_4;

import java.util.List;
import java.util.Arrays;
//java.util.Arrays:This import is used to access the asList method, 
//which converts an array to a list.
public class GenericArray
{
    //generic method to conver an array to List
    public static <T>  List<T> ToList(T[]arr) //List<T> The return type of the method is a list of type T.
    {
        if(arr==null)
        {
            throw new IllegalArgumentException("Array can't be null");
        }

        return Arrays.asList(arr);
        /*return Arrays.asList(array): This uses the asList method from the Arrays
         class to convert the input array to a list and returns it. The asList method 
         creates a fixed-size list backed by the specified array.java */

    } 
}