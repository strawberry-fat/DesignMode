package singleton;

/**
 * 单例模式
 * 懒汉式：线程不安全
 */
public class Singleton {
    public static Singleton singleton;
    private Singleton(){}
    public static Singleton getSingleton(){
        if (singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
