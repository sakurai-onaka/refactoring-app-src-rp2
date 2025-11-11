package jp.co.sss.crud.service;

import jp.co.sss.crud.db.EmployeeDAO;
import jp.co.sss.crud.db.IEmployeeDAO;
import jp.co.sss.crud.exception.IllegalInputException;
import jp.co.sss.crud.exception.SystemErrorException;
import jp.co.sss.crud.io.EmployeeEmpIdReader;
import jp.co.sss.crud.io.IConsoleReader;

public class EmployeeDeleteService  implements IEmployeeService {
	/**
	 * 社員削除処理
	 * 
	 * @throws SystemErrorException, IllegalInputException
	 */
	public void execute() throws SystemErrorException, IllegalInputException {
		//社員IDコンソール入力
		IConsoleReader employeeEmpIdReader = new EmployeeEmpIdReader();
		System.out.print("更新する社員の社員IDを入力してください:");
		Integer inputEmpId = (Integer) employeeEmpIdReader.input();
		// 削除処理
		IEmployeeDAO employeeDAO = new EmployeeDAO();
		Integer deleteCount = employeeDAO.delete(inputEmpId);
		System.out.println("社員情報を削除しました");
	}
}
