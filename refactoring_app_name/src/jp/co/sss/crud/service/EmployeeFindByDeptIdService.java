package jp.co.sss.crud.service;

import java.util.List;

import jp.co.sss.crud.db.EmployeeDAO;
import jp.co.sss.crud.dto.Employee;
import jp.co.sss.crud.exception.IllegalInputException;
import jp.co.sss.crud.exception.SystemErrorException;
import jp.co.sss.crud.io.EmployeeDeptIdReader;
import jp.co.sss.crud.io.IConsoleReader;

public class EmployeeFindByDeptIdService implements IEmployeeService {
	/**
	 * 部署ID検索処理
	 * 
	 * @throws SystemErrorException, IllegalInputException
	 */
	public void execute() throws SystemErrorException, IllegalInputException {
		IConsoleReader employeeDeptIdReader = new EmployeeDeptIdReader();
		System.out.print("部署ID(1：営業部、2：経理部、3：総務部)を入力してください:");
		Integer inputDeptId = (Integer) employeeDeptIdReader.input();
		// 表示機能の呼出
		EmployeeDAO employeeDAO = new EmployeeDAO();
		List<Employee> employees = employeeDAO.findByDeptId(inputDeptId);
		// レコードを出力
		if (employees != null) {
			System.out.println("社員ID\t社員名\t性別\t生年月日\t部署名");
			for (Employee employee : employees) {
				System.out.print(employee.getEmpId() + "\t");
				System.out.print(employee.getEmpName() + "\t");

				int gender = employee.getGender();
				if (gender == 0) {
					System.out.print("回答なし" + "\t");
				} else if (gender == 1) {
					System.out.print("男性" + "\t");

				} else if (gender == 2) {
					System.out.print("女性" + "\t");

				} else if (gender == 9) {
					System.out.print("その他" + "\t");

				}

				System.out.print(employee.getBirthday() + "\t");
				System.out.println(employee.getDepartment().getDeptName());
			}
		}
		System.out.println("");
	}
}
