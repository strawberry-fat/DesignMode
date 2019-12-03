package singleton;

/**
 * 单例模式
 * 双重校验锁
 * 线程安全，延迟加载
 */
public class Singleton3 {
    //必须加上volatile 关键字，保证对象的内存一致性。
    public volatile static Singleton3 singleton3;
    private Singleton3(){}
    public static Singleton3 getSingleton3(){
        //第一次校验是否为空。
        if(singleton3 == null ){
            synchronized (Singleton3.class){
            //加锁之后再次验证是否为空。
             if(singleton3 ==null){
                 singleton3 = new Singleton3();
             }
            }
        }
        return singleton3;
    }
}
