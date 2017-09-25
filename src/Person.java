//Problem 1

public class Person {

    private String name;

    public String getName(){
        return this.name;
        //getter makes sure its readable
    }

    public void setName (String name){
        this.name = name;
        //setter make sure its writable / allowing name to be changed
    };

    public void sayHello() {
        System.out.println(this.name);
    }


    public static void main(String[] args) {
        Person person = new Person();
        person.setName("T-Payne");
        person.sayHello();
        System.out.println(person.getName());
        person.setName("Brandon");
        person.sayHello();
        System.out.println(person.getName());
    }
}
