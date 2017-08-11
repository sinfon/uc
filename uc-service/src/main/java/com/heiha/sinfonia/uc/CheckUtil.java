package com.heiha.sinfonia.uc;

import java.util.List;

/**
 * <br>
 * <b>Project:</b> uc<br>
 * <b>Date:</b> 2017/8/10 15:17<br>
 * <b>Author:</b> heiha<br>
 */
public class CheckUtil {
    public static boolean isNotNull(Object object) {
        return object != null;
    }

    public static boolean isNotEmpty(List list) {
        return !(list == null || list.isEmpty());
    }

    public static boolean isNotEmpty(String value) {
        return !(value == null || "".equals(value.trim()));
    }
}
