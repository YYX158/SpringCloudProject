package sc.Dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import pojo.Dept;

import java.util.List;

/**
 * @author yyx
 * @version 1.0
 * @date : 2022/9/12 20:22
 */
@Mapper
@Repository
public interface DeptDao {

    public boolean addDept(Dept dept);

    public Dept queryById(Long deptno);

    public List<Dept> queryAll();
}
