package com.drcosu.ndileber.tools.log;

import android.util.Log;

import com.drcosu.ndileber.app.BaseConfiger;
import com.drcosu.ndileber.tools.HJson;
import com.drcosu.ndileber.tools.HString;

import static com.drcosu.ndileber.app.BaseConfiger.BUG_STATIC;
import static com.drcosu.ndileber.app.BaseConfiger.DEFAULT_TAG;

/**
 * Created by WaTaNaBe on 2017/8/19.
 */

public class ULog{

    private static ILog iLog = new OrhanobutLogImpl();

    public static void init() {
        iLog.init(DEFAULT_TAG,BUG_STATIC);
    }

    public static void d(Object... message) {
        iLog.d(message);
    }

    public static void e(Object... message) {
        iLog.e(message);
    }

    public static void e(Throwable throwable, Object... message) {
        iLog.e(throwable,message);
    }

    public static void w(Object... message) {
        iLog.w(message);
    }

    public static void i(Object... message) {
        iLog.i(message);
    }

    public static void v(Object... message) {
        iLog.v(message);
    }

    public static void wtf(Object... message) {
        iLog.wtf(message);
    }

    public static void dm(String message, Object... args) {
        iLog.dm(message,args);
    }

    public static void em(String message, Object... args) {
        iLog.em(message,args);
    }

    public static void em(Throwable throwable, String message, Object... args) {
        iLog.em(throwable,message,args);
    }

    public static void wm(String message, Object... args) {
        iLog.wm(message,args);
    }

    public static void im(String message, Object... args) {
        iLog.im(message,args);
    }

    public static void vm(String message, Object... args) {
        iLog.vm(message,args);
    }

    public static void wtfm(String message, Object... args) {
        iLog.wtfm(message,args);

    }

    public static void json(String json) {
        iLog.json(json);

    }

    public static void xml(String xml) {
        iLog.xml(xml);

    }

    public static void o(Object o) {
        iLog.o(o);

    }


    public static void dt(String tag,Object... message) {
        iLog.dt(tag,message);
    }

    public static void et(String tag,Object... message) {
        iLog.et(tag,message);
    }

    public static void et(String tag,Throwable throwable, Object... message) {
        iLog.et(tag,throwable,message);
    }

    public static void wt(String tag,Object... message) {
        iLog.wt(tag,message);
    }

    public static void it(String tag,Object... message) {
        iLog.it(tag,message);
    }

    public static void vt(String tag,Object... message) {
        iLog.vt(tag,message);
    }

    public static void wtft(String tag,Object... message) {
        iLog.wtft(tag,message);
    }

    public static void dmt(String tag,String message, Object... args) {
        iLog.dmt(tag,message,args);
    }

    public static void emt(String tag,String message, Object... args) {
        iLog.emt(tag,message,args);
    }

    public static void emt(String tag,Throwable throwable, String message, Object... args) {
        iLog.emt(tag,throwable,message,args);
    }

    public static void wmt(String tag,String message, Object... args) {
        iLog.wmt(tag,message,args);
    }

    public static void imt(String tag,String message, Object... args) {
        iLog.imt(tag,message,args);
    }

    public static void vmt(String tag,String message, Object... args) {
        iLog.vmt(tag,message,args);
    }

    public static void wtfmt(String tag,String message, Object... args) {
        iLog.wtfmt(tag,message,args);

    }

    public static void jsont(String tag,String json) {
        iLog.jsont(tag,json);

    }

    public static void xmlt(String tag,String xml) {
        iLog.xmlt(tag,xml);

    }

    public static void ot(String tag,Object o) {
        iLog.ot(tag,o);

    }

}
