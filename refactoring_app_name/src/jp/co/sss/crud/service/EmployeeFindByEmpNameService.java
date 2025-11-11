package jp.co.sss.crud.service;

import java.util.List;

import jp.co.sss.crud.db.EmployeeDAO;
import jp.co.sss.crud.dto.Employee;
import jp.co.sss.crud.exception.IllegalInputException;
import jp.co.sss.crud.exception.SystemErrorException;
import jp.co.sss.crud.io.ConsoleWriter;
import jp.co.sss.crud.io.EmployeeNameReader;
import jp.co.sss.crud.io.IConsoleReader;
/**
 * 従業員名検索出力用サービスクラス
 *
 * @author 櫻井宝生
 */
public class EmployeeFindByEmpNameService implements IEmployeeService {
	/**
	 * 社員名検索処理
	 * 
	 * @throws SystemErrorException, IllegalInputException
	 */
	public void execute() throws SystemErrorException, IllegalInputException {
		IConsoleReader employeeNameReader = new EmployeeNameReader();
		ConsoleWriter.reqInputEmpName();
		String inputName = (String) employeeNameReader.input();
		// 全件表示機能の呼出
		EmployeeDAO employeeDAO = new EmployeeDAO();
		List<Employee> employees = employeeDAO.findByEmployeeName(inputName);
		// レコードを出力
		if (employees != null) {
			ConsoleWriter.viewEmpTable(employees);
		}else {
			ConsoleWriter.viewNoEmp();
		}
		ConsoleWriter.viewNewLine();
	}
}
