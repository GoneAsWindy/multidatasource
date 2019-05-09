package cn.abyssj.multidatasource.controller;

import cn.abyssj.multidatasource.dao.Mydb2Mapper;
import cn.abyssj.multidatasource.dao.MydbMapper;
import cn.abyssj.multidatasource.entity.Weather;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/mydb")
public class MydbController {

    @Resource
    private MydbMapper mydbMapper;

    @GetMapping("/getById/{id}")
    public Weather getById(@PathVariable Integer id){
        return mydbMapper.selectById(id);
    }
}
