package mvc.spring.mybatis.mapper;

import java.util.List;

public interface EmpMapperService {
	List<EmpVO> getAllEmpMapper();
	EmpVO getEmpMapper(int id);
}
