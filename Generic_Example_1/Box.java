//Create a generic class Box<T> with methods to set and get the content. Write a main method to test it
// with different types like String and Integer.
class Box<T> 
{
   private T content ; 

   //set the content of the box
   public void add(T content)
   {
    this.content=content;
   }
   //get the content of the box
   public T getContent()
   {
    return content;
   }
}
