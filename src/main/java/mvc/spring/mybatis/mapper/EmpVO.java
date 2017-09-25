package mvc.spring.mybatis.mapper;

public class EmpVO {
	//employees ���̺� �÷���=���� ����
	//insert : sysdate �Լ�ȣ��
	//select : to_char( hire_date, '') �Լ�ȣ��
	int employee_id;//number(5)
	String first_name;//varchar2
	String last_name;//varchar2
	String email;//varchar2
	String phone_number;//varchar2
	String job_id;//varchar2
	String hire_date;// to_char(date ������, '')
	double salary; //number(10,2)
	int manager_id;//number(5)
	int department_id;//number(5)
	double commission_pct;//number(5,5)
	
	
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getJob_id() {
		return job_id;
	}
	public void setJob_id(String job_id) {
		this.job_id = job_id;
	}
	public int getManager_id() {
		return manager_id;
	}
	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}
	public int getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}
	public double getCommission_pct() {
		return commission_pct;
	}
	public void setCommission_pct(double commission_pct) {
		this.commission_pct = commission_pct;
	}
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getHire_date() {
		return hire_date;
	}
	public void setHire_date(String hire_date) {
		this.hire_date = hire_date;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmpVO [employee_id=" + employee_id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", email=" + email + ", phone_number=" + phone_number + ", job_id=" + job_id + ", hire_date="
				+ hire_date + ", salary=" + salary + ", manager_id=" + manager_id + ", department_id=" + department_id
				+ ", commission_pct=" + commission_pct + "]";
	}
	
	
}
