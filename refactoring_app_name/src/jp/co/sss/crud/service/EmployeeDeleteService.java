package jp.co.sss.crud.service;

import jp.co.sss.crud.db.EmployeeDAO;
import jp.co.sss.crud.db.IEmployeeDAO;
import jp.co.sss.crud.exception.IllegalInputException;
import jp.co.sss.crud.exception.SystemErrorException;
import jp.co.sss.crud.io.ConsoleWriter;
import jp.co.sss.crud.io.EmployeeEmpIdReader;
import jp.co.sss.crud.io.IConsoleReader;
/**
 * 従業員削除用サービスクラス
 *
 * @author 櫻井宝生
 */
public class EmployeeDeleteService  implements IEmployeeService {
	/**
	 * 社員削除処理
	 * 
	 * @throws SystemErrorException, IllegalInputException
	 */
	public void execute() throws SystemErrorException, IllegalInputException {
		//社員IDコンソール入力
		IConsoleReader employeeEmpIdReader = new EmployeeEmpIdReader();
		ConsoleWriter.reqInputDeleteEmpId();
		Integer inputEmpId = (Integer) employeeEmpIdReader.input();
		// 削除処理
		IEmployeeDAO employeeDAO = new EmployeeDAO();
		Integer deleteCount = employeeDAO.delete(inputEmpId);
		ConsoleWriter.viewDeleteMag(deleteCount);
	}
}
