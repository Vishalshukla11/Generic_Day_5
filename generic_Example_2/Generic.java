/* Write a generic class Box<T> with a field to hold a value of type T. 
Include methods to set and get the value. */
package generic_Example_2;
class Box<T>
{
    private T num;

    //constructor to initialize the value 
    public Box(T num)
    {
        this.num=num;
    }

    //Default constructor 

    public Box()
    {
        this.num=null;
    }
    //method to set the value 
    public void setvalue(T num)
    {
        this.num=num;
    }

    //method to get value
    public T getvalue()
    {
        return this.num;

    }

    public static void main(String args[])
    {
        Box<Integer> value= new Box<>();
        value.setvalue(123);
        System.out.println(value.getvalue());

        //for String data 

        Box<String> strvalue=new Box<>();
        strvalue.setvalue("vishal shukla");
        String print = strvalue.getvalue();
        System.out.println(print);
    }

    


}