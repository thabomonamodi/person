public class Person
{
    private String name;
    private int age;
    private String gender;
    private String[] interests;

    public Person(String name, int age, String gender, String[] interests)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.interests =  interests;
    }
    public String hello()
    {
        return "Hello, my name is "+name+" and I am "+age+" years old. \nMy interests are "+interests[0]+", "+interests[1]+" and "+interests[2]+".";
    }
}
