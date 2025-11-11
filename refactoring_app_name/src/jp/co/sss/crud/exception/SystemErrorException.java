package jp.co.sss.crud.exception;

/**
 * 独自例外[ClassNotFoundException | SQLException]時に実行クラス
 *
 * @author 櫻井宝生
 *
 */
public class SystemErrorException extends Exception{
	/**
	 * エラーメッセージを受け取るコンストラクタ
	 */
	public SystemErrorException(String msg,Exception e) {
		super(msg);
	}
}
