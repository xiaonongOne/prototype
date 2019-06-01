package com.test.deep;

import java.io.Serializable;

/**
 * @ProjectName: prototype
 * @Package: com.test.shallow.com.test.deep
 * @ClassName: School
 * @Description:
 * @Author: Ni Shichao
 * @Version: 1.0
 */
public class School implements Serializable {
    // 学校名称
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
