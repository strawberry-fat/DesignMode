package singleton;

/**
 * 静态内部类
 * 延迟加载，线程安全
 *
 */
public class Singleton4 {
    private static class SingletonHolder{
        private static final Singleton4 singleton4 = new Singleton4();
    }
    private Singleton4(){}
    public static  final Singleton4 getInstance(){
        return SingletonHolder.singleton4;
    }
}
