package cn.abyssj.multidatasource.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author matth
 * @date 2019/5/9
 */
@Data
public class Person implements Serializable {
    public Integer id;

    public String name;

    public Integer age;
}
