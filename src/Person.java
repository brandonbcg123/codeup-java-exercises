//Problem 1

public class Person {

    private String name;

    public Person (String name) {
        this.name = name;
    }

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
        Person person = new Person("T-Payne");
//        person.setName("T-Payne");
        person.sayHello();
        System.out.println(person.getName());
        person.setName("Brandon");
        person.sayHello();
        System.out.println(person.getName());

//Problem 2

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");

        //Since this is not a static class the following codes should not produce John

//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

        //The first print out will result in true because the .equals method is applied to both matching them as sring values, while the second print out will result in false because strings are not primitive data types so these these two would be compared in what time it took in memory.

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

        //This will print out true because person2 was made directly equal to person1 as an object value in the same memory in time instead of looking it as a primitive value.

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());

//        The first two will print the name John because person2 was made          directly equal to person1 as an object value in the same memory          in time.

        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());

        //These two both printed out Jane when I initially thought only person2 would print out Jane and person1 would print out John, but with both objects pointed at the same memory one will change to what the other one will change to.
//
    }


}