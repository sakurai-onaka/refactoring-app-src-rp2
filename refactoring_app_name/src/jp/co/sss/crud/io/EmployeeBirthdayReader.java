package jp.co.sss.crud.io;

import static jp.co.sss.crud.util.ConstantMsg.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class EmployeeBirthdayReader implements IConsoleReader {
	/**
	 * エラーメッセージを返すメソッド
	 * 
	 * @return 入力条件のエラーメッセージ
	 * ex "正しい形式(西暦年/月/日)で日付を入力してください："
	 */
	@Override
	public String getErrorMsg() {
		String errorMsg = MSG_EMP_BIRTHDAY_ERROR;
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
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		try {
			sdf.setLenient(false);
			sdf.parse(inputString);
		} catch (ParseException e) {
			return false;
		}
		return true;
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
