class Main
{
    public static void main(String args[])
    {
        //test with string type
        Box<String> S= new Box<>();
        S.add("hello sir ");
       // S.add("vishal shukla");
        System.out.println("String Box Content:- " + S.getContent());

        //test with Integer type
        Box<Integer>in= new Box<>();
        in.add(101);
        System.out.println("Integer Box Content:- " + in.getContent());

        //test with float type 
        Box<Double> Fo= new Box<>();
        Fo.add(1.5);
        System.out.println("Double Box Content:- " + Fo.getContent());
         
        //test with custom type 
        Box<Person> p = new Box<>();
        p.add(new Person("vishal shukla" , 24));
        System.out.println(p.getContent());

    }
}