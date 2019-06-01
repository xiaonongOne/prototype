package com.test.shallow;

import java.util.Date;

/**
 * @ProjectName: prototype
 * @Package: com.test
 * @ClassName: Demo
 * @Description:
 * @Author: Ni Shichao
 * @Version: 1.0
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException{
         Student student = new Student();
         student.setName("张三");
         student.setBirthday(new Date());

         Student student2 = student.clone();
         student2.setName("李四");
         student2.setBirthday(new Date());


         System.out.println("===========同学1============");
         System.out.println(" 姓名："+student.getName()+"  生日："+ student.getBirthday());

         System.out.println("===========同学2============");
         System.out.println(" 姓名："+student2.getName()+"  生日："+ student2.getBirthday());


    }
}
