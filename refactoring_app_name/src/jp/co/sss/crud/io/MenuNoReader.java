package jp.co.sss.crud.io;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import jp.co.sss.crud.util.ConstantMsg;

/**
 * メニュー番号入力用クラス
 * 
 * @author 櫻井宝生
 */

public class MenuNoReader implements IConsoleReader{
	/**
	 * エラーメッセージを返すメソッド
	 * 
	 * @return 入力条件のエラーメッセージ
	 * ex "1以上7以下の整数を入力してください："
	 */
	@Override
	public String getErrorMsg() {
		String errorMsg = ConstantMsg.MSG_MENU_ERROR;
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
		Pattern p = Pattern.compile("^[1-7１-７]{1}$");
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
