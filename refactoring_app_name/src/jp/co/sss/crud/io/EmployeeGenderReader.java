package jp.co.sss.crud.io;

import static jp.co.sss.crud.util.ConstantMsg.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * 性別入力クラス
 *
 * @author 櫻井宝生
 */
public class EmployeeGenderReader implements IConsoleReader{
	/**
	 * エラーメッセージを返すメソッド
	 * 
	 * @return 入力条件のエラーメッセージ
	 * ex "不正な入力値です。再度入力してください："
	 */
	@Override
	public String getErrorMsg() {
		String errorMsg = MSG_GENDER_ERROR;
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
		Pattern p = Pattern.compile("^[0129０１２９]{1}$");
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
