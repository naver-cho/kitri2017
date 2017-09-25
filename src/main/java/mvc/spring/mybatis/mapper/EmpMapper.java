package mvc.spring.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
public interface EmpMapper {
	
	@Select("select * from employees where employee_id = #{id}")
	public EmpVO getEmp(int id);
	
	@Select("select employee_id , first_name ,"
			+"TO_CHAR(hire_date, 'yyyy/mm/dd') hire_date, salary from employees")
	public List<EmpVO> getEmpList();


}
