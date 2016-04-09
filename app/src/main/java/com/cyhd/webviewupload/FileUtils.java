package com.cyhd.webviewupload;

import android.content.Context;
import android.os.Environment;
import android.widget.Toast;

/**
 * Created by huzhimin on 16/3/11.
 */
public class FileUtils {


    /**
     * 检查SD卡是否挂载
     *
     * @return
     */
    public static boolean checkSDcard(Context context){
        boolean flag = Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED);
        if (!flag) {
            Toast.makeText(context, "请插入手机存储卡再使用本功能", Toast.LENGTH_SHORT).show();
        }
        return flag;
    }
}
