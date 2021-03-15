package com.pack.java.methodHandle;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2021/3/14
 */
public class test {

    public static void main(String[] args) throws Throwable {

        //lookup 查找
        MethodHandles.Lookup publicLookUp = MethodHandles.publicLookup();

        MethodHandles.Lookup lookup = MethodHandles.lookup();

        //////////////////
        //Method Type

        //只有输出参数
        MethodType mt = MethodType.methodType(String.class);

        MethodType methodType = MethodType.methodType(int.class, int.class, int[].class);



        //MethodHandle
        //method
        MethodHandle handle = publicLookUp.findVirtual(UserInfo.class, "getUserName", mt);

        //static method
        MethodHandle handle0 = publicLookUp.findStatic(UserInfo.class, "calc", methodType);

        //construct
        MethodType mt1=MethodType.methodType(void.class,String.class, String.class, int.class);
        MethodHandle constructHandle = publicLookUp.findConstructor(UserInfo.class, mt1);


        //field java9中java.lang.VarHandle
        MethodHandle sizeHandle = lookup.findGetter(UserInfo.class, "size", int.class);


        //private method 也可以使用reflect API
        Method stringTest = UserInfo.class.getDeclaredMethod("stringTest");
        stringTest.setAccessible(true);
        MethodHandle stringHan = lookup.unreflect(stringTest);







        //调用 invoke method
        //static
        // 多个参数 int b,int... a
        int res0 = (int) handle0.invokeExact(1, new int[]{1, 2, 3});
        System.out.println("int b,int... a:"+res0);

        //construct
        UserInfo info = (UserInfo)constructHandle.invoke("user1", "sadas@", 11);
        System.out.println("构造器"+info);

        //field
        int size = (int) sizeHandle.invoke(info);
        System.out.println("field中public size值：" + size);

        //private method 也可以使用reflect API
        String privateString = (String) stringHan.invoke(info);
        System.out.println("private method :"+privateString);

        //无参数 但是不是statics
        //UserInfo info = new UserInfo("user1", "sadas@", 11);

        String res = (String) handle.invoke(info);
        System.out.println("无参数 但是不是statics"+res);






        ///////////////////////////////////////////


        //调用static方法
        // 无参数
        MethodHandle handle1 = publicLookUp.findStatic(UserInfo.class, "getAll", MethodType.methodType(String.class));
        String res1 = (String) handle1.invoke();
        System.out.println("调用static方法、 无参数:"+res1);

        //调用static方法
        // 有两个参数
        // invoke
        MethodHandle handle2 = publicLookUp.findStatic(UserInfo.class, "calc", MethodType.methodType(int.class, int.class, int.class));
        int res2 = (int) handle2.invoke(1, 2);
        System.out.println("调用static方法、有两个参数invoke:"+res2);

        //调用static方法
        // 有两个参数
        //invokeWithArguments
        int res3 = (int) handle2.invokeWithArguments(1, 2);
        System.out.println("调用static方法 、有两个参数invokeWithArguments:"+res3);

        //调用static方法
        // 有两个参数
        //invokeExact
        int res4 = (int) handle2.invokeExact(1, 2);
        System.out.println("调用static方法 、有两个参数invokeExact:"+res4);

    }
}
