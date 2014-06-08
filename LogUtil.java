package utils;

import android.util.Log;

/**
 * wrap a null character</br>
 * Display log switch</br>
 * 
 * @author ginsyama
 *
 */
public final class LogUtil {
    /**true:show false:hidden*/
    private static Boolean DebugMode = true;
    
    /**
     * debug log
     * @param obj class
     * @param msg message
     */
    public static void d(Object obj, final String msg){
        if(!DebugMode)
            return;
        Log.d(obj == null ? "null" : obj.getClass().getSimpleName(), msg == null ? "null" : msg);
    }
    
    /**
     * verbose log
     * @param obj class
     * @param msg message
     */
    public static void v(Object obj, final String msg){
        if(!DebugMode)
            return;
        Log.v(obj == null ? "null" : obj.getClass().getSimpleName(), msg == null ? "null" : msg);
    }
    
    /**
     * info log
     * @param obj class
     * @param msg message
     */
    public static void i(Object obj, final String msg){
        if(!DebugMode)
            return;
        Log.i(obj == null ? "null" : obj.getClass().getSimpleName(), msg == null ? "null" : msg);
    }
    
    /**
     * warring log
     * @param obj class
     * @param msg message
     */
    public static void w(Object obj, final String msg){   
        if(!DebugMode)
            return;
        Log.w(obj == null ? "null" : obj.getClass().getSimpleName(), msg == null ? "null" : msg);
    }
    
    /**
     * error log
     * @param obj class
     * @param msg message
     */
    public static void e(Object obj, final String msg){
        if(!DebugMode)
            return;
        Log.e(obj == null ? "null" : obj.getClass().getSimpleName(), msg == null ? "null" : msg);
    }
}
