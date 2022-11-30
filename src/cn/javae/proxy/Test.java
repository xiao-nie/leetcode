package cn.javae.proxy;

import java.lang.reflect.Proxy;

/**
 * @author nie
 * @date 2022/11/30 22:45
 **/
public class Test {

    public static void main(String[] args) {
        System.getProperties().put("jdk.proxy.ProxyGenerator.saveGeneratedFiles", "true");
        PersonProxy proxy = new PersonProxy(new Student());
        Person person = (Person) Proxy.newProxyInstance(Test.class.getClassLoader(), new Class[]{Person.class}, proxy);
        String sleep = person.sleep(100);
        System.out.println("睡眠质量: " + sleep);
    }

}
