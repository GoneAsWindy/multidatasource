package cn.abyssj.multidatasource.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author matth
 * @date 2019/5/9
 */
@Data
public class Weather implements Serializable {

    private Integer id;

    private String city;

    private Integer tempLo;

    private Integer tempHi;

    private Double prcp;

    private Date date;
}
