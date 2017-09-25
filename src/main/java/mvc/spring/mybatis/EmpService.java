package mvc.spring.mybatis;

import java.util.List;

public interface EmpService {
	List<EmpVO> getAllEmp();
	EmpVO getEmp(int id);
	List<EmpVO> getAllEmp2();//resultMap?��
	//getEmpReuse ?��?��?�� 메소?��(?��?��?��?��?�� 구현 : dao.?��?��?��름메?��?��?���?)
	//getEmpReuse2 ?��?��?�� 메소?��(?��?��?��?��?�� 구현 : dao.?��?��?��름메?��?��?���?)
	//EmpDAO : 2�? 메소?�� 추�?
	
	List<EmpVO> getEmpReuse();
	List<EmpVO> getEmpReuse2();
	List<EmpVO> getEmpDynamicWhere(EmpVO vo);
	
	void updateDynamicEmp();
	
	List<EmpVO> getEmpReuseCollection();
	List<EmpVO> getEmpReuseCollection2();
	List<EmpVO> getEmpRownum();
	
	void insertEmp(EmpVO vo);
	
	List<String> getJobs();
	
}
