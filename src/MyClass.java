import java.util.Arrays;

public class MyClass {
    private String name;
    private String surname;
    private int age;
    private String[] lessons;
    private String favoriteDish;

    private MyClass myClass;

    public MyClass(String name, String surname, int age, String[] lessons, String favoriteDish) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.lessons = lessons;
        this.favoriteDish = favoriteDish;
    }

    public MyClass(MyClass myclass) {
this.name=myclass.getName();
this.surname=myclass.getSurname();
this.age=myclass.getAge();
this.lessons=myclass.getLessons();
this.favoriteDish=myclass.getFavoriteDish();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setLessons(String[] lessons) {
        this.lessons = lessons;
    }

    public String[] getLessons() {
        return lessons;
    }

    public void setFavoriteDish(String favoriteDish) {
        this.favoriteDish = favoriteDish;
    }

    public String getFavoriteDish() {
        return favoriteDish;
    }
    void getInfo(){
        System.out.println("name: " + name);
        System.out.println("surname: " + surname);
        System.out.println("age: " + age);
        System.out.println("lessons: "+ Arrays.toString(lessons));
        System.out.println("favoriteDish: " + favoriteDish);
    }
}
