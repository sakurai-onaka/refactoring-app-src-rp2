package jp.co.sss.crud.service;

import java.util.List;

import jp.co.sss.crud.db.EmployeeDAO;
import jp.co.sss.crud.dto.Employee;
import jp.co.sss.crud.exception.IllegalInputException;
import jp.co.sss.crud.exception.SystemErrorException;
import jp.co.sss.crud.io.ConsoleWriter;
import jp.co.sss.crud.io.EmployeeDeptIdReader;
import jp.co.sss.crud.io.IConsoleReader;
/**
 * 部門ID検索出力用サービスクラス
 *
 * @author 櫻井宝生
 */
public class EmployeeFindByDeptIdService implements IEmployeeService {
	/**
	 * 部署ID検索処理
	 * 
	 * @throws SystemErrorException, IllegalInputException
	 */
	public void execute() throws SystemErrorException, IllegalInputException {
		IConsoleReader employeeDeptIdReader = new EmployeeDeptIdReader();
		ConsoleWriter.reqDeptId(true);
		Integer inputDeptId = (Integer) employeeDeptIdReader.input();
		// 表示機能の呼出
		EmployeeDAO employeeDAO = new EmployeeDAO();
		List<Employee> employees = employeeDAO.findByDeptId(inputDeptId);
		// レコードを出力
		if (employees != null) {
			ConsoleWriter.viewEmpTable(employees);
		}else {
			ConsoleWriter.viewNoEmp();
		}
		ConsoleWriter.viewNewLine();
	}
}
