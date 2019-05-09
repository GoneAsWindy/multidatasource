package cn.abyssj.multidatasource.controller;

import cn.abyssj.multidatasource.dao.Mydb2Mapper;
import cn.abyssj.multidatasource.entity.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author matth
 * @date 2019/5/9
 */
@RestController
@RequestMapping("/mydb2")
public class Mydb2Controller {

    @Resource
    private Mydb2Mapper mydb2Mapper;

    @GetMapping("/getById/{id}")
    public Person getById(@PathVariable Integer id) {
        return mydb2Mapper.selectById(id);
    }
}
