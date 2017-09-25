package mvc.spring.mybatis;

import org.springframework.stereotype.Component;

@Component
public class EmpVO {//employees ì»¬ëŸ¼ê³? ?´ë¦„ì´ ?‹¤ë¥´ë‹¤ 
	 int id; //pk
	 String name;//employees nameì»¬ëŸ¼x
	 String email;//unique
	 String hire_date;
	 String job_id;//jobsÅ×ÀÌºí fk
	 double salary;//>=0 check
	 
	 public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getHire_date() {
		return hire_date;
	}
	public void setHire_date(String hire_date) {
		this.hire_date = hire_date;
	}
	public String getJob_id() {
		return job_id;
	}
	public void setJob_id(String job_id) {
		this.job_id = job_id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

}
