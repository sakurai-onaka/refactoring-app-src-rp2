package jp.co.sss.crud.io;

import java.util.List;

import jp.co.sss.crud.dto.Employee;

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
		System.out.println("=== 社員管理システム ===");
		System.out.println("1.全件表示");
		System.out.println("2.社員名検索");
		System.out.println("3.部署ID検索");
		System.out.println("4.新規登録");
		System.out.println("5.更新");
		System.out.println("6.削除");
		System.out.println("7.終了");
		System.out.print("メニュー番号を入力してください：");
	}

	/**
	 * 社員表出力処理
	 * @param employee
	 */
	public static void viewEmpTable(List<Employee> employees) {
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
	
	/**
	 * 検索件数0件時出力
	 */
	public static void viewNoEmp() {
		System.out.print("該当者はいませんでした");
	}

	/**
	 * 「更新する社員の社員IDを入力してください:」出力
	 */
	public static void reqInputUpdateEmpId() {
		System.out.print("更新する社員の社員IDを入力してください:");
	}

	/**
	 * 「削除する社員の社員IDを入力してください:」出力
	 */
	public static void reqInputDeleteEmpId() {
		System.out.print("削除する社員の社員IDを入力してください:");
	}

	/**
	 * 「社員名:」出力
	 */
	public static void reqInputEmpName() {
		System.out.println("社員名:");
	}

	/**
	 *「 性別(0:その他, 1:男性, 2:女性, 9:回答なし):」出力
	 */
	public static void reqInputGender() {
		System.out.print("性別(0:その他, 1:男性, 2:女性, 9:回答なし):");
	}

	/**
	 *「 部署ID(1：営業部、2：経理部、3：総務部):」出力
	 */
	public static void reqDeptId(boolean type) {
		if (type) {
			System.out.print("部署ID(1：営業部、2：経理部、3：総務部)を入力してください:");
		} else {
			System.out.print("部署ID(1：営業部、2：経理部、3：総務部):");
		}
	}

	/**
	 *「 生年月日（西暦年/月/日）:」出力
	 */
	public static void reqBirthday() {
		System.out.print("生年月日（西暦年/月/日）:");
	}

	/**
	 *登録処理終了後メッセージ出力
	 */
	public static void viewRegistMag() {
			System.out.println("社員情報を登録しました");
	}
	
	/**
	 *更新処理終了後メッセージ出力
	 */
	public static void viewUpdateMag(Integer updateCount) {
		if (updateCount != 0) {
			System.out.println("社員情報を更新しました");
		} else {
			System.out.println("対象者がいませんでした");
		}
	}
	
	/**
	 *削除処理終了後メッセージ出力
	 */
	public static void viewDeleteMag(Integer deleteCount) {
		if (deleteCount != 0) {
			System.out.println("社員情報を削除しました");
		} else {
			System.out.println("対象者がいませんでした");
		}
	}

	/**
	 * 改行
	 */
	public static void viewNewLine() {
		System.out.println("");
	}

	/**
	 * 「7.終了」押下時処理
	 */
	public static void viewEnd() {
		System.out.println("システムを終了します。");
	}
}
