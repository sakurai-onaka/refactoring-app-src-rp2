package jp.co.sss.crud.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jp.co.sss.crud.dto.Department;
import jp.co.sss.crud.dto.Employee;
import jp.co.sss.crud.exception.SystemErrorException;
import jp.co.sss.crud.util.ConstantSQL;

/**
 * 従業員DAO
 *
 * @author 櫻井宝生
 */
public class EmployeeDAO implements IEmployeeDAO {
	/**
	 * 全件表示
	 *
	 * @return {@code List<Employee>} 全社員エンティティリスト
	 * @throws SystemErrorException : {@code ClassNotFoundException | SQLException }をキャッチしてスローする
	 */
	public List<Employee> findAll() throws SystemErrorException {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		Employee employee = null;
		List<Employee> employees = new ArrayList<>();
		try {
			try {
				// DBに接続
				connection = DBManager.getConnection();

				// ステートメントを作成
				preparedStatement = connection.prepareStatement(ConstantSQL.SQL_ALL_SELECT);

				// SQL文を実行
				resultSet = preparedStatement.executeQuery();

				//resultSetの結果Setがない場合はfalse
				if (!resultSet.isBeforeFirst()) {
					System.out.println("該当者はいませんでした");
					return null;
				}

				//DTO への格納
				while (resultSet.next()) {
					employee = new Employee();
					employee.setEmpId(resultSet.getInt("emp_id"));
					employee.setEmpName(resultSet.getString("emp_name"));
					employee.setGender(resultSet.getInt("gender"));
					employee.setBirthday(resultSet.getString("birthday"));
					employee.setDepartment(new Department());
					employee.getDepartment().setDeptName(resultSet.getString("dept_name"));
					employees.add(employee);
				}
			} finally {
				// ResultSetをクローズ
				DBManager.close(resultSet);
				// Statementをクローズ
				DBManager.close(preparedStatement);
				// DBとの接続を切断
				DBManager.close(connection);
			}
		} catch (ClassNotFoundException | SQLException e) {
			return null;
		}
		return employees;
	}

	/**
	 * 社員名検索
	 * 
	 * @param searchName 検索社員名 
	 * @return {@code List<Employee>} 検索社員名を含むエンティティリスト
	 * @throws SystemErrorException : {@code ClassNotFoundException | SQLException }をキャッチしてスローする
	 */
	public List<Employee> findByEmployeeName(String searchName) throws SystemErrorException {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		Employee employee = null;
		List<Employee> employees = new ArrayList<>();
		try {
			try {
				// DBに接続
				connection = DBManager.getConnection();

				// SQL文を準備
				StringBuffer sql = new StringBuffer(ConstantSQL.SQL_SELECT_BASIC);
				sql.append(ConstantSQL.SQL_SELECT_BY_EMP_NAME);
				
				// ステートメントを作成
				preparedStatement = connection.prepareStatement(sql.toString());

				// 検索条件となる値をバインド
				preparedStatement.setString(1, "%" + searchName + "%");
				
				// SQL文を実行
				resultSet = preparedStatement.executeQuery();

				//resultSetの結果Setがない場合はfalse
				if (!resultSet.isBeforeFirst()) {
					System.out.println("該当者はいませんでした");
					return null;
				}

				//DTO への格納
				while (resultSet.next()) {
					employee = new Employee();
					employee.setEmpId(resultSet.getInt("emp_id"));
					employee.setEmpName(resultSet.getString("emp_name"));
					employee.setGender(resultSet.getInt("gender"));
					employee.setBirthday(resultSet.getString("birthday"));
					employee.setDepartment(new Department());
					employee.getDepartment().setDeptName(resultSet.getString("dept_name"));
					employees.add(employee);
				}
			} finally {
				// ResultSetをクローズ
				DBManager.close(resultSet);
				// Statementをクローズ
				DBManager.close(preparedStatement);
				// DBとの接続を切断
				DBManager.close(connection);
			}
		} catch (ClassNotFoundException | SQLException e) {
			return null;
		}
		return employees;
	}

	/**
	 * 部署ID検索
	 * 
	 * @param deptId 部署ID
	 * @return {@code List<Employee>} 検索部署IDを含むエンティティリスト
	 * @throws SystemErrorException : {@code ClassNotFoundException | SQLException }をキャッチしてスローする
	 */
	public List<Employee> findByDeptId(int deptId) throws SystemErrorException {
		return null;
	}

	/**
	 * 登録
	 * <br>引数のEmployeeから社員名、性別、生年月日、部署番号を取得し新たな社員情報を生成する。
	 * <br>社員IDは自動採番機能を用いること
	 * 
	 * @param employee
	 * @throws SystemErrorException : {@code ClassNotFoundException | SQLException }をキャッチしてスローする
	 */
	public void insert(Employee employee) throws SystemErrorException {
	}

	/**
	 * 社員情報を1件更新する
	 * <br>引数のEmployeeから社員ID、社員名、性別、生年月日、部署番号を取得し社員情報を更新する。
	 * 
	 * @param employee
	 * @throws SystemErrorException : {@code ClassNotFoundException | SQLException }をキャッチしてスローする
	 */
	public Integer update(Employee employee) throws SystemErrorException {
		return null;
	}

	/**
	 * 社員情報を1件削除する
	 * <br>引数のEmployeeから社員IDから社員情報を削除する。
	 * 
	 * @param empId 
	 * @throws SystemErrorException : {@code ClassNotFoundException | SQLException }をキャッチしてスローする
	 */
	public Integer delete(Integer empId) throws SystemErrorException {
		return null;
	}
}
