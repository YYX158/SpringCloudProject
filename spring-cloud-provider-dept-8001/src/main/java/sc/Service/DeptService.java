package sc.Service;

import pojo.Dept;

import java.util.List;

/**
 * @author yyx
 * @version 1.0
 * @date : 2022/9/12 20:23
 */
public interface DeptService {
    public boolean addDept(Dept dept);

    public Dept queryById(Long deptno);

    public List<Dept> queryAll();
}
