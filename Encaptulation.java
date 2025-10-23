class Human
{
    private int age;
    private String name;

    public Human()
    {
        age=23;
        name="Talha";               //DEFAULT CONSTRUCTOR
    }

    public Human(int age, String name)
    {
        this.age=age;
        this.name=name;             //PARAMETIRIZED CONSTRUCTOR
    }

    public int getAge()            //GETTER
    {
        return age;
    }
    public void setAge (int age)            //SETTER
    {
        this.age = age;
    }
    public String getName()
    {
         return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
}

public class Encaptulation 
{
    public static void main(String a[])
    {
    Human holo = new Human();
    Human holo1 = new Human(45,"Virat");
   // holo.setAge(13);
    //holo.setName("Manha");

    System.out.println(holo.getAge() + " " + holo.getName());
    System.out.println(holo1.getAge() + " " + holo1.getName());

    }
}
