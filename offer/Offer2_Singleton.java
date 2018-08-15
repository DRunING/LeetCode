package LeetCode.offer;

/**
 * @author zenli
 */
public class Offer2_Singleton {
}
class Demo{

    //延迟加载
    private static Demo demo = null;
    private Demo(){

    }
    public static Demo getInstance(){
        if(demo == null){
            demo = new Demo();
        }
        return demo;
    }
    //多线程下不能正正常工作
}
class Demo1{
    private static Demo1 demo1 = null;
    private  Demo1(){

    }
    public static Demo1 getInstance(){
        if(demo1 == null){
            //锁住demo1， 创建demo1
            synchronized (demo1){
                demo1 = new Demo1();
            }
        }
        return demo1;
    }
}