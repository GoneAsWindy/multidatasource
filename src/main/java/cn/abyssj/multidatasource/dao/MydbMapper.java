package cn.abyssj.multidatasource.dao;

import cn.abyssj.multidatasource.entity.Weather;
import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
 * @author matth
 * @date 2019/5/9
 */

public interface MydbMapper extends BaseMapper<Weather> {

}
