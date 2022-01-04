package com.android.unittestjava;

import android.content.Context;
import android.content.Intent;
public class IntentUtils {

    public static Intent createQuery(Context context, String query, String value) {
        // 简单起见，重用MainActivity
        Intent i = new Intent(context, MainActivity.class);
        i.putExtra("QUERY", query);
        i.putExtra("VALUE", value);
        return i;
    }
}
