package com.pack.java.reflection.basic;

import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2021/3/11
 */
public class test {


    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Object cat = new Cat();
        Class<?> classC = cat.getClass();

        /*
        查询Class信息---名字
        res:
        getName:com.pack.java.reflection.basic.Cat 全限定名
        getSimpleName:Cat
        getCanonicalName:com.pack.java.reflection.basic.Cat
         */
        System.out.println("getName:" + classC.getName());
        System.out.println("getSimpleName:" + classC.getSimpleName());
        System.out.println("getCanonicalName:" + classC.getCanonicalName());

        /*
         * 新建Class对象
         *
         */
        Class<?> classCat = Class.forName("com.pack.java.reflection.basic.Cat");
        System.out.println("新建对象：" + classCat.getName());
        System.out.println("新建对象：" + classCat.getSimpleName());

        /*
         * 查询class信息--修饰符
         * com.pack.java.reflection.basic.Cat:public
         * com.pack.java.reflection.basic.Animal:public abstract
         * com.pack.java.reflection.basic.Animal 是否是Abstract:true
         */
        Class<?> classAnimal = Class.forName("com.pack.java.reflection.basic.Animal");

        int catMod = classCat.getModifiers();
        int animalMod = classAnimal.getModifiers();
        System.out.println("com.pack.java.reflection.basic.Cat:"+ Modifier.toString(catMod));
        System.out.println("com.pack.java.reflection.basic.Animal:"+Modifier.toString(animalMod));
        System.out.println("com.pack.java.reflection.basic.Animal 是否是Abstract:" + Modifier.isAbstract(animalMod));

        /*
        包信息：classCat所在包信息：com.pack.java.reflection.basic
         */
        Package pCat = classCat.getPackage();
        System.out.println("classCat所在包信息：" + pCat.getName());

        /*
         * 对象的父类信息：
         * Cat的父类：Animal
         * String的父类信息：Object
         */
        String data = "test";
        Class<?> catSuperClass = classCat.getSuperclass();
        System.out.println("Cat的父类：" + catSuperClass.getSimpleName());
        System.out.println("String的父类信息：" + data.getClass().getSuperclass().getSimpleName());

        /*
         *  继承的接口信息：
         * Cat实现接口：[Action]
         * animal实现的接口：[Eating]
         */
        Class<?>[] catInterfaces = classCat.getInterfaces();
        Class<?>[] animalInterfaces = classAnimal.getInterfaces();
        System.out.println("Cat实现接口：" + getClassName(catInterfaces));
        System.out.println("animal实现的接口：" + getClassName(animalInterfaces));

        /*
         * constructors
         * Birds的构造参数：[com.pack.java.reflection.basic.Birds,
         * com.pack.java.reflection.basic.Birds, com.pack.java.reflection.basic.Birds]
         *
         */
        Class<?> classBirds = Class.forName("com.pack.java.reflection.basic.Birds");
        Constructor<?>[] birdConstruct = classBirds.getConstructors();
        System.out.println("Birds的构造参数：" + getConstructName(birdConstruct));

        //获取构造器
        Constructor<?> constructor1 = classBirds.getConstructor();
        Constructor<?> constructor2 = classBirds.getConstructor(String.class);
        Constructor<?> constructor3 = classBirds.getConstructor(String.class, boolean.class);

        /*
        * 根据构造器生成对象
        * 构造器1：Birds{name:birdswalks=false}
        * 构造器2：Birds{name:xiaomingwalks=false}
        * 构造器3:Birds{name:xiaoliwalks=true}
         */
        Birds birds1 = (Birds) constructor1.newInstance();
        Birds birds2 = (Birds) constructor2.newInstance("xiaoming");
        Birds birds3 = (Birds) constructor3.newInstance("xiaoli", true);
        System.out.println("构造器1：" + birds1.toString());
        System.out.println("构造器2：" + birds2.toString());
        System.out.println("构造器3:" + birds3.toString());

        /*
         * 设置字段值
         * 先设置字段上setAccessible，可以修改
         * birds1里walks值：true
         * birds2里walks值：false
         */
        Field field = classBirds.getDeclaredField("walks");
        field.setAccessible(true);

        field.set(birds1, true);
        field.set(birds2, false);
        System.out.println("birds1里walks值：" + field.getBoolean(birds1));
        System.out.println("birds2里walks值：" + field.getBoolean(birds2));

        /*
         * 对于类中public static 不需要用构造器实例化，因为static是类变量
         * 获取static默认值 使用null就行
         * 获取static字段CATEGORY值：small
         */
        Field field1 = classBirds.getField("CATEGORY");
        field1.setAccessible(true);
        System.out.println("获取static字段CATEGORY值：" + field1.get(null));

        /*
         * Methods
         * 获取类的public方法，以及父类的public方法
         *Birds里面所有public方法：[eatFoods, setWalks, isWalks, toString,
         * getCATEGORY, setCATEGORY, getName, setName, wait, wait, wait, equals,
         *  hashCode, getClass, notify, notifyAll]
         *
         * getDeclaredMethods():获取类的public方法
         * Birds里面public方法：[getSound, eatFoods, setWalks, isWalks, toString]
         */
        Method[] methods = classBirds.getMethods();
        System.out.println("Birds里面public方法：" + getMethodName(methods));
        Method[] methods1 = classBirds.getDeclaredMethods();
        System.out.println("Birds里面private方法：" + getMethodName(methods1));

        /*
         * 根据变量获取方法: 方法名、和参数类型
         */
        Method getWalks = classBirds.getDeclaredMethod("isWalks");
        Method setWalks = classBirds.getDeclaredMethod("setWalks", boolean.class);

        /*
         * 实例化、调用方法
         * Birds中walks值：false
         * Birds中walks值：true
         */
        Birds birds =(Birds) classBirds.getConstructor().newInstance();
        boolean walks = (boolean) getWalks.invoke(birds);
        System.out.println("Birds中walks值：" + walks);
        setWalks.invoke(birds, true);
        boolean walks2 = (boolean) getWalks.invoke(birds);
        System.out.println("Birds中walks值：" + walks2);



        /*
         * Fields 查询
         * birds2 里的public fields：[CATEGORY]
         * birds2 里的private fields：[walks]
         * birds2 里的private fields 类型：[boolean]
         */
        Class<?> classBird = birds2.getClass();
        Field[] fields = classBird.getFields();
        System.out.println("birds2 里的public fields：" + getFieldNames(fields));
        Field[] fields1 = classBird.getDeclaredFields();
        System.out.println("birds2 里的private fields：" + getFieldNames(fields1));
        System.out.println("birds2 里的private fields 类型：" + getFieldType(fields1));
        /*
         *
         */






    }

    private static List<String> getClassName(Class<?>[] classes) {
        List<String> res = new ArrayList<>();
        for (Class<?> classR : classes) {
            res.add(classR.getSimpleName());
        }
        return res;
    }

    private static List<String> getConstructName(Constructor<?>[] constructors) {
        List<String> res = new ArrayList<>();
        for (Constructor<?> c : constructors) {
            res.add(c.getName());
        }
        return  res;
    }
    private static List<String> getFieldNames(Field[] fields) {
        List<String> res = new ArrayList<>();

        for (Field field : fields) {
            res.add(field.getName());

        }
        return res;
    }



    private static List<String> getFieldType(Field[] fields) {
        List<String> res = new ArrayList<>();

        for (Field field : fields) {
            res.add(field.getType().getSimpleName());

        }
        return res;
    }

    private static List<String> getMethodName(Method[] methods) {
        List<String> res = new ArrayList<>();

        for (Method field : methods) {
            res.add(field.getName());

        }
        return res;
    }
}
