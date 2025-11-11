package jp.co.sss.crud.service;

import java.util.List;

import jp.co.sss.crud.db.EmployeeDAO;
import jp.co.sss.crud.dto.Employee;
import jp.co.sss.crud.exception.IllegalInputException;
import jp.co.sss.crud.exception.SystemErrorException;
import jp.co.sss.crud.io.ConsoleWriter;

public class EmployeeAllFindService implements IEmployeeService {
	/**
	 * 全件出力処理
	 * 
	 * @throws SystemErrorException, IllegalInputException
	 */
	public void execute() throws SystemErrorException, IllegalInputException {
		// 全件表示機能の呼出
		EmployeeDAO employeeDAO = new EmployeeDAO();
		List<Employee> employees = employeeDAO.findAll();
		// レコードを出力
		if (employees != null) {
			ConsoleWriter.viewEmpTable(employees);
		}else {
			ConsoleWriter.viewNoEmp();
		}
		ConsoleWriter.viewNewLine();
	}
}
