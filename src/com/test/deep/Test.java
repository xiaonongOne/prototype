package com.test.deep;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ProjectName: prototype
 * @Package: com.test.deep
 * @ClassName: Test
 * @Description:
 * @Author: Ni Shichao
 * @Version: 1.0
 */
public class Test {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student = new Student();
        student.setName("张三");
        student.setBirthday(new Date());
        School school = new School();
        school.setName("北京大学");
        student.setSchool(school);
        List<String> friends = new ArrayList<String>();
        friends.add("李四");
        student.setFriends(friends);

        Student student1 = student.deepClone();
        student1.setName("王五");
        student1.setBirthday(new Date());
        student1.getSchool().setName("清华大学");
        student1.getFriends().add("张三");
        System.out.println("================同学1=====================");
        System.out.println("姓名："+student.getName()+" 出生年月："+student.getBirthday());
        System.out.println("学校："+student.getSchool().getName()+" 同学："+student.getFriends().get(0));
        System.out.println("数量："+student.getFriends().size());


        System.out.println("================同学2=====================");
        System.out.println("姓名："+student1.getName()+" 出生年月："+student1.getBirthday());
        System.out.println("学校："+student1.getSchool().getName()+" 同学："+student1.getFriends().get(0));
        System.out.println("数量 ："+student1.getFriends().size());


    }
}
