class Human{
    //this is encapsulation (access modifiers)
    private String name;
    private int age;
    private char sex;

    //constructor
    public Human(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    //getters and setters to change and access priavte values
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public char getSex() {
        return sex;
    }
    public void setSex(char sex) {
        this.sex = sex;
    }
}

public class Encapsulation {
    public static void main(String args[]){
        Human obj=new Human("Clark Kent",33,'M');
        System.out.println("Name using getter - "+obj.getName());
        System.out.println("Age using getter - "+obj.getAge());
        System.out.println("Sex using getter - "+obj.getSex());
    }
}
