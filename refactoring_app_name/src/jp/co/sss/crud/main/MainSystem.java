package jp.co.sss.crud.main;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;

import jp.co.sss.crud.exception.IllegalInputException;
import jp.co.sss.crud.exception.SystemErrorException;
import jp.co.sss.crud.io.ConsoleWriter;
import jp.co.sss.crud.io.MenuNoReader;
import jp.co.sss.crud.service.IEmployeeService;
import jp.co.sss.crud.util.ConstantValue;

/**
 * 社員情報管理システム開始クラス 社員情報管理システムはこのクラスから始まる。<br/>
 * メニュー画面を表示する。
 *
 * @author System Shared
 *
 */
public class MainSystem {
	/**
	 * 社員管理システムを起動
	 *
	 * @throws IOException 
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException, ParseException {
		Integer inputMenuNum = 0;

		do {
			// メニューの表示
			ConsoleWriter.viewMenu();

			// メニュー番号の入力
			MenuNoReader menuNoReader = new MenuNoReader();
			try {
				inputMenuNum = (Integer) menuNoReader.input();
				// 機能の呼出
				IEmployeeService iEmployeeService = IEmployeeService.getInstanceByMenuNo(inputMenuNum);
				if (iEmployeeService != null) {
					iEmployeeService.execute();
				}
			} catch (IllegalInputException | SystemErrorException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		} while (inputMenuNum != ConstantValue.MENU_END);
		ConsoleWriter.viewEnd();
	}
}
