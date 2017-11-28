package com.fadsel.recylerviewclicks;

import android.view.View;

/**
 * Created by Fahad Kassim Local on 11/28/2017.
 */

public interface ClickListener {
    void onClick(View view, int position);

    void onLongClick(View view, int position);
}
