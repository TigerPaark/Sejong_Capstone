package com.example.test30.domain.util

import android.view.View


/**
 * Created by VMac on 06/01/17.
 */
interface ClickListener {
    fun onClick(view: View?, position: Int)
    fun onLongClick(view: View?, position: Int)
}