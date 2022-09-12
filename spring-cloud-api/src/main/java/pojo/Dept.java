package pojo;

import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author yyx
 * @version 1.0
 * @date : 2022/9/12 13:33
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Accessors(chain = true)
public class Dept implements Serializable {

    private Long deptno;// 主键

    private String dname;

    //这个数据是存在哪个数据库的字段   一个微服务对应一个数据库，也有可能用一个数据被存到不同的数据库中
    private String db_source;

    public Dept(String dname) {
        this.dname = dname;
    }
}
