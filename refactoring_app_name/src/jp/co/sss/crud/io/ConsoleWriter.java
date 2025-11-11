package jp.co.sss.crud.io;

import java.util.List;

import jp.co.sss.crud.dto.Employee;
import jp.co.sss.crud.util.ConstantMsg;

/**
 * コンソール出力クラス
 *
 * @author 櫻井宝生
 */
public class ConsoleWriter {
	/** インスタンス化を禁止 */
	private ConsoleWriter() {
	}

	/**
	 * メニュー表示
	 */
	public static void viewMenu() {
		System.out.println(ConstantMsg.MSG_MENU_TITLE);
		System.out.println(ConstantMsg.MSG_MENU_ALL_FIND);
		System.out.println(ConstantMsg.MSG_MENU_FIND_BY_EMP_NAME);
		System.out.println(ConstantMsg.MSG_MENU_FIND_BY_DEPT_ID);
		System.out.println(ConstantMsg.MSG_MENU_REGIST);
		System.out.println(ConstantMsg.MSG_MENU_UPDATE);
		System.out.println(ConstantMsg.MSG_MENU_DELETE);
		System.out.println(ConstantMsg.MSG_MENU_END);
		System.out.print(ConstantMsg.MSG_MENU_INPUT_REQUEST);
	}

	/**
	 * 社員表出力処理
	 * @param employee
	 */
	public static void viewEmpTable(List<Employee> employees) {
		System.out.println(ConstantMsg.MSG_TABLE_HEADER);
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}

	/**
	 * 検索件数0件時出力
	 */
	public static void viewNoEmp() {
		System.out.print(ConstantMsg.MSG_TABLE_NO_HIT);
	}

	/**
	 * 「更新する社員の社員IDを入力してください:」出力
	 */
	public static void reqInputUpdateEmpId() {
		System.out.print(ConstantMsg.MSG_REQUEST_UPDATE_EMP_ID);
	}

	/**
	 * 「削除する社員の社員IDを入力してください:」出力
	 */
	public static void reqInputDeleteEmpId() {
		System.out.print(ConstantMsg.MSG_REQUEST_DELETE_EMP_ID);
	}

	/**
	 * 「社員名:」出力
	 */
	public static void reqInputEmpName() {
		System.out.print(ConstantMsg.MSG_REQUEST_EMP_NAME);
	}

	/**
	 *「 性別(0:その他, 1:男性, 2:女性, 9:回答なし):」出力
	 */
	public static void reqInputGender() {
		System.out.print(ConstantMsg.MSG_REQUEST_EMP_GENDER);
	}

	/**
	 *「 部署ID(1：営業部、2：経理部、3：総務部):」出力
	 */
	public static void reqDeptId(boolean type) {
		if (type) {
			System.out.print(ConstantMsg.MSG_REQUEST_DEPT_ID_PATTERN_ONE);
		} else {
			System.out.print(ConstantMsg.MSG_REQUEST_DEPT_ID_PATTERN_TWO);
		}
	}

	/**
	 *「 生年月日（西暦年/月/日）:」出力
	 */
	public static void reqBirthday() {
		System.out.print(ConstantMsg.MSG_REQUEST_BIRTHDAY);
	}

	/**
	 *登録処理終了後メッセージ出力
	 */
	public static void viewRegistMag() {
		System.out.println(ConstantMsg.MSG_VIEW_REGIST);
	}

	/**
	 *更新処理終了後メッセージ出力
	 */
	public static void viewUpdateMag(Integer updateCount) {
		if (updateCount != 0) {
			System.out.println(ConstantMsg.MSG_VIEW_UPDATE);
		} else {
			System.out.println(ConstantMsg.MSG_SEARCH_NO_HIT);
		}
	}

	/**
	 *削除処理終了後メッセージ出力
	 */
	public static void viewDeleteMag(Integer deleteCount) {
		if (deleteCount != 0) {
			System.out.println(ConstantMsg.MSG_VIEW_DELETE);
		} else {
			System.out.println(ConstantMsg.MSG_SEARCH_NO_HIT);
		}
	}

	/**
	 * 改行
	 */
	public static void viewNewLine() {
		System.out.println(ConstantMsg.MSG_VIEW_NEW_LINE);
	}

	/**
	 * 「7.終了」押下時処理
	 */
	public static void viewEnd() {
		System.out.println(ConstantMsg.MSG_VIEW_END);
	}
}
