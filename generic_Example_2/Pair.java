//Create a generic class Pair<T, U> that holds two values of possibly different types.
// Include methods to get each value and a constructor to initialize the pair.
// Test this class with different types.

package generic_Example_2;
public class Pair<T,U>
{
    private T first;
    private U second;

    // constructro to initialize the pair

    public Pair(T first,U second)
    {
        this.first=first;
        this.second=second;
    }

    //method to get the first value

    public T getFirst()
    {
        return first;
    }

    //method to get second value 

    public U getSecond()
    {
        return second;
    }
    
    // main method 
    public static void main(String args[])
    {
        //test with integer and string

        Pair<Integer,String> intStrpair= new Pair<>(1,"vikram");
        System.out.println("first :- " + intStrpair.getFirst() + " " +  " second:- " + intStrpair.getSecond());
    }
}