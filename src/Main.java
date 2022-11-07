public class Main {
    public static void main(String[] args) {

        MyClass myClass = new MyClass("Nuradil","Zholdoshov",18,
                new String[]{"Java-8","English"},"ASH");
        MyClass myClass1 = new MyClass(new MyClass(myClass.getName(), myClass.getSurname(), myClass.getAge(), myClass.getLessons(), myClass.getFavoriteDish()));
        myClass1.getInfo();
        System.out.println("~~~~~~~~~~~~~~~~~~~");
        myClass.getInfo();
    }
}