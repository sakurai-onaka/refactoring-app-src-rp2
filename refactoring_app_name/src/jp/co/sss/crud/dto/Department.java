package jp.co.sss.crud.dto;
/**
 * 部門DTO
 * 
 * @author 櫻井宝生
 */
public class Department {
	/** 部門ID */
	private Integer deptId;
	/** 部門名 */
	private String deptName;
	
	public Integer getDeptId() {
		return deptId;
	}
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	

}
