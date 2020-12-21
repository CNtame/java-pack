package com.pack.java.lang.cloneable.deep.beanUtils;

import com.pack.java.lang.cloneable.deep.Entity;
import com.pack.java.lang.cloneable.deep.cloneable.Menu;
import com.pack.java.lang.cloneable.deep.cloneable.User;
import org.apache.commons.beanutils.BeanUtils;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2020/11/19
 */
public class Test {


    public static void main(String[] args) {
        User user = Entity.newPrototypeInstance();
        try {
            User user1 =(User) BeanUtils.cloneBean(user);
            user1.setUserName("test3");
            System.out.println("元数据：" + user);
            System.out.println("clone数据：" + user1);
            /*
            测试多层
            失败
             */
            user1.getMenu().setMenuName("sd");
            System.out.println("元数据：" + user);
            System.out.println("clone数据：" + user1);
            /*
            解决
             */
            user1.setMenu((Menu) BeanUtils.cloneBean(user.getMenu()));
            user1.getMenu().setMenuName("主菜单");
            System.out.println("元数据：" + user);
            System.out.println("clone数据：" + user1);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
