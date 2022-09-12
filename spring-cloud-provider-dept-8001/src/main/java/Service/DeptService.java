package Service;

import org.springframework.stereotype.Service;
import pojo.Dept;

import java.util.List;

/**
 * @author yyx
 * @version 1.0
 * @date : 2022/9/12 19:57
 */
@Service
public interface DeptService {
    public boolean addDept(Dept dept);

    public Dept queryById(Long deptno);

    public List<Dept> queryAll();
}
