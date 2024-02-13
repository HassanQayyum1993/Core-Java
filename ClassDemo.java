public class ClassDemo
{
    public static void main(String args[])
    {
        // Human human = new Human();
        // human.setName("Hassan Qayyum");
        // human.setAge(55);
        // human.setGender("Men");
        // Human.setProfession("Mechanical");
        B b = new B(77,"88");


        // System.out.println("Name: " + human.getName() + ", Age: " + human.getAge() + ", Gender: " + human.getGender());
        // System.out.println("Profession: " + Human.getProfession());

    }
}

class A
{
    A()
    {
        System.out.println("A default constructor");
    }

    A(int x)
    {
        System.out.println("A paramterized constructor, x= " + x);
    }

    A(String y)
    {
        System.out.println("A paramterized constructor, y= " + y);
    }
}

class B extends A
{
    private int x;
    private String y;

    B()
    {
//        super(5);

        this.x=99;
        this.y="Hi";
        System.out.println("x= " + x + " y=" + y);
    }

    public B(int x, String y) {
        this();
        this.x = x;
        this.y = y;
        System.out.println("B Parametrized Constructor x= " + x + " y=" + y);
    }

    
}

class Human
{
    private String gender;
    private int age;
    private String name;
    
    private static String profession;

    static
    {
        profession = "Civil";
    }

    public int getAge() {
        return age;
    }



    public String getName() {
        return name;
    }


    public String getGender() {
        return gender;
    }

    public static String getProfession() {
        return profession;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public static void setProfession(String profession) {
        Human.profession = profession;
    }
}