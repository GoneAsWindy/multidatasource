package cn.abyssj.multidatasource.dao;

import cn.abyssj.multidatasource.entity.Person;
import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @author matth
 * @date 2019/5/9
 */
@DS("mydb2")
public interface Mydb2Mapper extends BaseMapper<Person> {
}
