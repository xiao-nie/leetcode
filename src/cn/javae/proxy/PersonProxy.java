package cn.javae.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author nie
 * @date 2022/11/30 22:42
 **/
public class PersonProxy implements InvocationHandler {

    private Person person;

    public PersonProxy(Person person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if ("sleep".equals(method.getName())){
            System.out.println("执行了睡觉方法");
            return method.invoke(person, args);
        }
        return null;
    }
}
