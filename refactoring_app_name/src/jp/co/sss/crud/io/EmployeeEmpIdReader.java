package jp.co.sss.crud.io;

import static jp.co.sss.crud.util.ConstantMsg.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmployeeEmpIdReader implements IConsoleReader{
	/**
	 * エラーメッセージを返すメソッド
	 * 
	 * @return 入力条件のエラーメッセージ
	 * ex "test："
	 */
	@Override
	public String getErrorMsg() {
		String errorMsg = MSG_EMP_ID_ERROR;
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
		Pattern p = Pattern.compile("^[1-9１-９]{1}[0-9１-９]{0,3}$");
		Matcher m = p.matcher(inputString);
		return m.find();
	}

	/**
	 * コンソール入力した文字列をintに変換するかどうかを返す。
	 * 
	 * @return inputをint型へ変換する必要があるときはtrue、そうでないときはfalseを返す。
	 */
	@Override
	public boolean isParseInt() {
		return true;
	}
}
