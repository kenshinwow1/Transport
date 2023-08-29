import db.DB;

public class reset {
    public static void main(String[] args) {
        DB db = new DB();
        info("Hello world");

        System.out.print(true);

    }
    public static void info () {
        System.out.println("hello");
    }
        public static void info (String word){
            System.out.println(word + "!");
        }
    public static void info (String word,float word2){
        System.out.println(word + "!");

    }
}
