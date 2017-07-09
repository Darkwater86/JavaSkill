/**
 * Created by Mr.Darkwater on 2017/7/8.
 */
public class Main {
    /*
    打印对象
    * */
    public static void print(String index , Object object){
        System.out.print(String.format("{%s},%s \n",index,object.toString()));
    }
    public static void demoOpreation(){
        //运算符
        print("2.1",1+1);
        print("2.2",1-1);
        print("2.3",1*1);
        print("2.4",1/1);
        print("2.5",1%1);
        print("2.6",1<<2);
        print("2.7",1>>1);
        print("2.8",1>>1);

    }
    public static void demoPrintString(){
        //普通字符串
        print("1.1","Hello World!");
    }
    public static void demoString(){
        //字符串操作
        String str = "Hello World!";
        print("3.1", str.indexOf("a"));
    }
    public static void main(String[] args){
//        demoPrintString();
//        demoOpreation();
//        demoString();
    }
}
