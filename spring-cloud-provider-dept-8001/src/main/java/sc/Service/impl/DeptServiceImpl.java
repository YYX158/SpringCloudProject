package sc.Service.impl;

import sc.Service.DeptService;
import sc.dao.DeptDao;
import org.springframework.beans.factory.annotation.Autowired;
import pojo.Dept;

import java.util.List;

/**
 * @author yyx
 * @version 1.0
 * @date : 2022/9/12 19:57
 */
public class DeptServiceImpl implements DeptService {
    @Autowired
    DeptDao deptDao;

    @Override
    public boolean addDept(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept queryById(Long deptno) {
        return deptDao.queryById(deptno);
    }

    @Override
    public List<Dept> queryAll() {
        return deptDao.queryAll();
    }
}
