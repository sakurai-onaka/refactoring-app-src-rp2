package jp.co.sss.crud.util;

/**
 * メッセージをまとめたクラス
 *
 * @author 櫻井宝生
 *
 */
public class ConstantMsg {
	//メニュー画面タイトル用メッセージ
	public static final String MSG_MENU_TITLE = "=== 社員管理システム ===";
	//メニュー画面全件表示用メッセージ
	public static final String MSG_MENU_ALL_FIND = "1.全件表示";
	//メニュー画面社員名検索用メッセージ
	public static final String MSG_MENU_FIND_BY_EMP_NAME = "2.社員名検索";
	//メニュー画面部署ID検索用メッセージ
	public static final String MSG_MENU_FIND_BY_DEPT_ID = "3.部署ID検索";
	//メニュー画面新規登録用メッセージ
	public static final String MSG_MENU_REGIST = "4.新規登録";
	//メニュー画面更新用メッセージ
	public static final String MSG_MENU_UPDATE = "5.更新";
	//メニュー画面削除用メッセージ
	public static final String MSG_MENU_DELETE = "6.削除";
	//メニュー画面終了用メッセージ
	public static final String MSG_MENU_END = "7.終了";
	//メニュー画面入力要求用メッセージ
	public static final String MSG_MENU_INPUT_REQUEST = "メニュー番号を入力してください：";
	//社員一覧ヘッダー用メッセージ
	public static final String MSG_TABLE_HEADER = "社員ID\t社員名\t性別\t生年月日\t部署名";
	//タブ用メッセージ
	public static final String MSG_TABLE_TAB = "\t";
	//性別回答なし用メッセージ
	public static final String MSG_TABLE_GENDER_NO_ANSER = "回答なし";
	//性別男性用メッセージ
	public static final String MSG_TABLE_GENDER_MEN = "男性";
	//性別女性用メッセージ
	public static final String MSG_TABLE_GENDER_WOMEN = "女性";
	//性別その他用メッセージ
	public static final String MSG_TABLE_GENDER_ANOTHER = "その他";
	//検索件数0件用メッセージ
	public static final String MSG_TABLE_NO_HIT = "該当者はいませんでした";
	//更新用社員ID入力件用メッセージ
	public static final String MSG_REQUEST_UPDATE_EMP_ID = "更新する社員の社員IDを入力してください:";
	//削除用社員ID入力件用メッセージ
	public static final String MSG_REQUEST_DELETE_EMP_ID = "削除する社員の社員IDを入力してください:";
	//社員名入力件用メッセージ
	public static final String MSG_REQUEST_EMP_NAME = "社員名:";
	//性別件用メッセージ
	public static final String MSG_REQUEST_EMP_GENDER = "性別(0:その他, 1:男性, 2:女性, 9:回答なし):";
	//部署ID用メッセージパターン1
	public static final String MSG_REQUEST_DEPT_ID_PATTERN_ONE = "部署ID(1：営業部、2：経理部、3：総務部)を入力してください:";
	//部署ID用メッセージパターン2
	public static final String MSG_REQUEST_DEPT_ID_PATTERN_TWO = "部署ID(1：営業部、2：経理部、3：総務部):";
	//部署ID用メッセージパターン2
	public static final String MSG_REQUEST_BIRTHDAY = "生年月日（西暦年/月/日）:";
	//登録完了メッセージ
	public static final String MSG_VIEW_REGIST = "社員情報を登録しました";
	//更新完了メッセージ
	public static final String MSG_VIEW_UPDATE = "社員情報を更新しました";
	//削除完了メッセージ
	public static final String MSG_VIEW_DELETE = "社員情報を削除しました";
	//該当者なしメッセージ
	public static final String MSG_SEARCH_NO_HIT = "対象者がいませんでした";
	//改行メッセージ
	public static final String MSG_VIEW_NEW_LINE = "";
	//システム終了メッセージ
	public static final String MSG_VIEW_END = "システムを終了します。";

	public static final String MSG_SYSTEM_ERROR = "システムエラーです。";
	//メニュー画面用エラーメッセージ
	public static final String MSG_MENU_ERROR = "1以上7以下の整数を入力してください：";
	//部署ID用エラーメッセージ
	public static final String MSG_DEPT_ID_ERROR = "1以上3以下の整数を入力してください：";
	//社員ID用エラーメッセージ
	public static final String MSG_EMP_ID_ERROR = "1以上9999以下の整数を入力してください：";
	//性別用エラーメッセージ
	public static final String MSG_GENDER_ERROR = "不正な入力値です。再度入力してください：";
	//社員名用エラーメッセージ
	public static final String MSG_EMP_NAME_ERROR = "1文字以上30文字以下の文字列を入力してください：";
	//生年月日用エラーメッセージ
	public static final String MSG_EMP_BIRTHDAY_ERROR = "正しい形式(西暦年/月/日)で日付を入力してください：";
}
