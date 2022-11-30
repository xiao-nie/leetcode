package cn.javae.proxy;

/**
 * @author nie
 * @date 2022/11/30 22:41
 **/
public class Student implements Person{
    @Override
    public String sleep(int s) {
        System.out.println("学生睡了" + s + "秒");
        return "学生睡得很香";
    }
}