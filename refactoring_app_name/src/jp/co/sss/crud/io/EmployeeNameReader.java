package jp.co.sss.crud.io;

import static jp.co.sss.crud.util.ConstantMsg.*;
import static jp.co.sss.crud.util.ConstantValue.*;
/**
 * 従業員名入力クラス
 *
 * @author 櫻井宝生
 */
public class EmployeeNameReader implements IConsoleReader{
	/**
	 * エラーメッセージを返すメソッド
	 * 
	 * @return 入力条件のエラーメッセージ
	 * ex "1文字以上30文字以下の文字列を入力してください："
	 */
	@Override
	public String getErrorMsg() {
		String errorMsg = MSG_EMP_NAME_ERROR;
		return errorMsg;
	}
	
	/**
	 * 入力文字列のバリデーションメソッド
	 * 
	 * @param inputString コンソール入力した文字列
	 * @return inputStringが適正な値であるときはtrue、そうでないときはfalseを返す。
	 */
	@Override
	public boolean isValid(String inputString) {
		//判定するパターンを生成
		if(inputString.length() >= INPUT_NAME_LENGTH_MIN && INPUT_NAME_LENGTH_MAX >= inputString.length()) {
			if(!inputString.isBlank()) {
				return true;
			}
		}
		return false;
	}

	/**
	 * コンソール入力した文字列をintに変換するかどうかを返す。
	 * 
	 * @return inputをint型へ変換する必要があるときはtrue、そうでないときはfalseを返す。
	 */
	@Override
	public boolean isParseInt() {
		return false;
	}
}
