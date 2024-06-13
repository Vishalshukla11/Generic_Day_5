package Generic_Example_5;
class ArrayUnit 
{
    public static <T extends Comparable<T>> T getIntMax(T[] arr)
    {
        if(arr.length<=0)
        {
            throw new IllegalArgumentException("Array is empty");

        }
        T maxvalue=arr[0];
        // for(T ele:arr)
        // {
        //     if(ele.compareTo(maxvalue) > 0)
        //     {
        //         maxvalue=ele;
        //     }
        //    }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].compareTo(maxvalue)>0){
                maxvalue=arr[i];
            }

        }
        return maxvalue;
    }
}
