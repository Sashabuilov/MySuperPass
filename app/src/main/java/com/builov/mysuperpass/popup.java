package com.builov.mysuperpass;

import android.content.Context;
import android.widget.Toast;

public class popup {

    popup(Context context, String text){
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
    }
}
