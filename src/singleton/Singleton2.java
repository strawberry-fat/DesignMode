package singleton;

/**
 * 单例模式：饿汉式，静态类加载.内存消耗大
 */
public class Singleton2 {
    public static Singleton2 singleton2 = new Singleton2();
    private Singleton2(){}
    public static Singleton2 getSingleton2(){
        return singleton2;
    }
}
