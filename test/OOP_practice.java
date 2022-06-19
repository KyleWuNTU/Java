package test;
public class OOP_practice {
  public static void main(String[] args) {
    class Animal {
      private String name;
      public int age;

      public void setAge(int age) {
        this.age = age;
      }

      public int get_age() {
        return age;
      }

      public String get_name() {
        return name;
      }
    }

    class Dog extends Animal {
      public void eat() {
        System.out.println("Dog is eating");
      }
    }

    class Cat extends Animal {
      public void eat() {
        System.out.println("Dog is eating");
      }
    }

    Dog John = new Dog();
    John.setAge(10);
    System.out.println(John.get_age());
  }
}