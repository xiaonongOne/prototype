package com.test.deep;

import java.io.*;
import java.util.Date;
import java.util.List;

/**
 * @ProjectName: prototype
 * @Package: com.test.shallow.com.test.deep
 * @ClassName: Student
 * @Description:
 * @Author: Ni Shichao
 * @Version: 1.0
 */
public class Student implements Serializable {

    // 姓名
    private String name;
    // 出生年月日
    private Date birthday;
    // 学校名称
    private School school;
    // 朋友
    private List<String> friends;

    // 序列化方式克隆对象，其实就是对流的操作复制
    // 将对象写入到流里。
    public Student deepClone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        ObjectOutputStream oo = new ObjectOutputStream(bo);
        oo.writeObject(this);

        // 从流里将对象读出来
        ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
        ObjectInputStream oi = new ObjectInputStream(bi);
        Student student = (Student) oi.readObject();
        return student;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }
}
