package jp.co.sss.crud.dto;

/**
 * 従業員DTO
 * 
 * @author 櫻井宝生
 */
public class Employee {
	/** 従業員ID */
	private Integer empId;
	/** 従業員名 */
	private String empName;
	/** 性別 */
	private Integer gender;
	/** 誕生日 */
	private String birthday;
	/** 部門情報 */
	private Department department;
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Integer getGender() {
		return gender;
	}
	public void setGender(Integer gender) {
		this.gender = gender;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}

	
	
}
