package singleton;

/**
 * 单例模式：懒汉式（线程安全），性能开销大，延迟加载
 */
public class Singleton1 {
    public static Singleton1 singleton1;
    private Singleton1(){};
    //使用单锁验证，性能开销较大。
    public static synchronized Singleton1 getSingleton1(){
        if (singleton1 == null){
            singleton1 = new Singleton1();
        }
        return singleton1;
    }
}
