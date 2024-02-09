package SingletonPattern;

public class Singleton {

    private static Singleton uniqueInstance;

    private Singleton(){}

    /*
     For thread safety ( 3 ways) :
     1) If getInstance is not called regurarly you can just make it synchronized. (It's expensive)
     2) If the application always creates and uses and instance of the singleton you just create Singleton eagerly not
     lazily meaning:
        - private static Singleton uniqueInstance = new Singleton();
        - getInstance(){return uniqueInstance()}
      3) Use double checked locking
     */
    public static Singleton getInstance(){
        if(uniqueInstance==null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    // Other methods
}
