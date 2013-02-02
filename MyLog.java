package utils;

import android.util.Log;

/**
 * 通常のログの欠点
 * ・null文字のラップ
 * ・LogCatの表示切替
 * @author ginsyama
 *
 */
public final class MyLog {
    /**true:表示 false:非表示*/
    private static Boolean DebugMode = true;
    
    /**
     * デバッグログ
     * @param obj 実行クラス
     * @param msg メッセージ
     */
    public static void d(Object obj, final String msg){
        if(!DebugMode)
            return;
        Log.d(obj == null ? "null" : obj.getClass().getSimpleName(), msg == null ? "null" : msg);
    }
    
    /**
     * 冗長ログ
     * @param obj 実行クラス
     * @param msg メッセージ
     */
    public static void v(Object obj, final String msg){
        if(!DebugMode)
            return;
        Log.v(obj == null ? "null" : obj.getClass().getSimpleName(), msg == null ? "null" : msg);
    }
    
    /**
     * 情報ログ
     * @param obj 実行クラス
     * @param msg メッセージ
     */
    public static void i(Object obj, final String msg){
        if(!DebugMode)
            return;
        Log.i(obj == null ? "null" : obj.getClass().getSimpleName(), msg == null ? "null" : msg);
    }
    
    /**
     * 警告ログ
     * @param obj 実行クラス
     * @param msg メッセージ
     */
    public static void w(Object obj, final String msg){   
        if(!DebugMode)
            return;
        Log.w(obj == null ? "null" : obj.getClass().getSimpleName(), msg == null ? "null" : msg);
    }
    
    /**
     * エラーログ
     * @param obj 実行クラス
     * @param msg　メッセージ
     */
    public static void e(Object obj, final String msg){
        if(!DebugMode)
            return;
        Log.e(obj == null ? "null" : obj.getClass().getSimpleName(), msg == null ? "null" : msg);
    }
}
