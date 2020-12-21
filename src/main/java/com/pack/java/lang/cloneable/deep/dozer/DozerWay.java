package com.pack.java.lang.cloneable.deep.dozer;

import com.pack.java.lang.cloneable.deep.Entity;
import com.pack.java.lang.cloneable.deep.cloneable.User;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2020/11/19
 */
public class DozerWay {

    public static void main(String[] args) {
        /*
        可以实现深拷贝
         */
        User user = Entity.newPrototypeInstance();
        Mapper mapper = new DozerBeanMapper();
        User user1 = mapper.map(user, User.class);
        user1.getMenu().setMenuName("test1");
        System.out.println("元数据：" + user);
        System.out.println("clone数据：" + user1);
    }
}
