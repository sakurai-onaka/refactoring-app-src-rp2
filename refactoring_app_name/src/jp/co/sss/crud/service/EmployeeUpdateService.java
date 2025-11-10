package jp.co.sss.crud.service;

import jp.co.sss.crud.db.EmployeeDAO;
import jp.co.sss.crud.db.IEmployeeDAO;
import jp.co.sss.crud.dto.Department;
import jp.co.sss.crud.dto.Employee;
import jp.co.sss.crud.exception.IllegalInputException;
import jp.co.sss.crud.exception.SystemErrorException;
import jp.co.sss.crud.io.EmployeeBirthdayReader;
import jp.co.sss.crud.io.EmployeeDeptIdReader;
import jp.co.sss.crud.io.EmployeeEmpIdReader;
import jp.co.sss.crud.io.EmployeeGenderReader;
import jp.co.sss.crud.io.EmployeeNameReader;
import jp.co.sss.crud.io.IConsoleReader;

public class EmployeeUpdateService implements IEmployeeService {
	/**
	 * 更新処理
	 * 
	 * @throws SystemErrorException, IllegalInputException
	 */
	public void execute() throws SystemErrorException, IllegalInputException {
		//登録入力処理
		Employee employee = new Employee();
		//社員名コンソール入力
		IConsoleReader employeeEmpIdReader = new EmployeeEmpIdReader();
		System.out.print("更新する社員の社員IDを入力してください:");
		employee.setEmpId((Integer) employeeEmpIdReader.input());
		//社員名コンソール入力
		IConsoleReader employeeNameReader = new EmployeeNameReader();
		System.out.print("社員名:");
		employee.setEmpName((String) employeeNameReader.input());
		//性別コンソール入力
		IConsoleReader employeeGenderReader = new EmployeeGenderReader();
		System.out.print("性別(1: 男性, 2: 女性):");
		employee.setGender((Integer) employeeGenderReader.input());
		//生年月日コンソール入力
		IConsoleReader employeeBirthdayReader = new EmployeeBirthdayReader();
		System.out.print("生年月日（西暦年/月/日）:");
		employee.setBirthday((String) employeeBirthdayReader.input());
		//部署IDコンソール入力
		IConsoleReader employeeDeptIdReader = new EmployeeDeptIdReader();
		System.out.print("部署ID(1：営業部、2：経理部、3：総務部):");
		employee.setDepartment(new Department());
		employee.getDepartment().setDeptId((Integer) employeeDeptIdReader.input());
		// 更新処理
		IEmployeeDAO employeeDAO = new EmployeeDAO();
		employeeDAO.update(employee);
		System.out.println("");
	}
}
