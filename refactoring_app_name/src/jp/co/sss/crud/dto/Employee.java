package jp.co.sss.crud.dto;

import jp.co.sss.crud.util.ConstantMsg;

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

	@Override
	public String toString() {
		/** 性別日本語表記 */
		String genderJa = "";
		if (this.gender == 0) {
			genderJa = ConstantMsg.MSG_TABLE_GENDER_NO_ANSER;
		} else if (gender == 1) {
			genderJa = ConstantMsg.MSG_TABLE_GENDER_MEN;

		} else if (gender == 2) {
			genderJa = ConstantMsg.MSG_TABLE_GENDER_WOMEN;

		} else if (gender == 9) {
			genderJa = ConstantMsg.MSG_TABLE_GENDER_ANOTHER;

		}

		return empId + ConstantMsg.MSG_TABLE_TAB + empName + ConstantMsg.MSG_TABLE_TAB + genderJa
				+ ConstantMsg.MSG_TABLE_TAB + birthday + ConstantMsg.MSG_TABLE_TAB + department.getDeptName();
	}
}
