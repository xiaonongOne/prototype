package com.test.shallow;

import java.util.Date;

/**
 * @ProjectName: prototype
 * @Package: com.test
 * @ClassName: Student
 * @Description:
 * @Author: Ni Shichao
 * @Version: 1.0
 */
public class Student implements  Cloneable {

    // 姓名
    private String name;
    // 出生年月日
    private Date birthday;

    // 实现浅克隆
    @Override
    public Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
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
}
