package jp.co.sss.crud.service;

import jp.co.sss.crud.db.EmployeeDAO;
import jp.co.sss.crud.db.IEmployeeDAO;
import jp.co.sss.crud.dto.Department;
import jp.co.sss.crud.dto.Employee;
import jp.co.sss.crud.exception.IllegalInputException;
import jp.co.sss.crud.exception.SystemErrorException;
import jp.co.sss.crud.io.ConsoleWriter;
import jp.co.sss.crud.io.EmployeeBirthdayReader;
import jp.co.sss.crud.io.EmployeeDeptIdReader;
import jp.co.sss.crud.io.EmployeeEmpIdReader;
import jp.co.sss.crud.io.EmployeeGenderReader;
import jp.co.sss.crud.io.EmployeeNameReader;
import jp.co.sss.crud.io.IConsoleReader;
/**
 * 従業員更新用サービスクラス
 *
 * @author 櫻井宝生
 */
public class EmployeeUpdateService implements IEmployeeService {
	/**
	 * 更新処理
	 * 
	 * @throws SystemErrorException, IllegalInputException
	 */
	public void execute() throws SystemErrorException, IllegalInputException {
		//登録入力処理
		Employee employee = new Employee();
		//社員IDコンソール入力
		IConsoleReader employeeEmpIdReader = new EmployeeEmpIdReader();
		ConsoleWriter.reqInputUpdateEmpId();
		employee.setEmpId((Integer) employeeEmpIdReader.input());
		//社員名コンソール入力
		IConsoleReader employeeNameReader = new EmployeeNameReader();
		ConsoleWriter.reqInputEmpName();
		employee.setEmpName((String) employeeNameReader.input());
		//性別コンソール入力
		IConsoleReader employeeGenderReader = new EmployeeGenderReader();
		ConsoleWriter.reqInputGender();
		employee.setGender((Integer) employeeGenderReader.input());
		//生年月日コンソール入力
		IConsoleReader employeeBirthdayReader = new EmployeeBirthdayReader();
		ConsoleWriter.reqBirthday();
		employee.setBirthday((String) employeeBirthdayReader.input());
		//部署IDコンソール入力
		IConsoleReader employeeDeptIdReader = new EmployeeDeptIdReader();
		ConsoleWriter.reqDeptId(false);
		employee.setDepartment(new Department());
		employee.getDepartment().setDeptId((Integer) employeeDeptIdReader.input());
		// 更新処理
		IEmployeeDAO employeeDAO = new EmployeeDAO();
		Integer updateCount = employeeDAO.update(employee);
		ConsoleWriter.viewUpdateMag(updateCount);
		ConsoleWriter.viewNewLine();
	}
}
