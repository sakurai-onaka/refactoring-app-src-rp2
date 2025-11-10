package jp.co.sss.crud.exception;

/**
 * 入力チェック失敗時に実行される独自例外クラス
 *
 * @author 櫻井宝生
 *
 */
public class IllegalInputException extends Exception{
	/**
	 * エラーメッセージを受け取るコンストラクタ
	 */
	public IllegalInputException(String msg) {
		super(msg);
	}
}