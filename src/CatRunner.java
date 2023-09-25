public class CatRunner {
    public static void main(String[] args){
        Cat cat1= new Cat("Cooper", 2, 9.6);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Maybelline", 11, 8.5);
        cat2.printCatInfo();
        cat2.introduce();
    }
}
