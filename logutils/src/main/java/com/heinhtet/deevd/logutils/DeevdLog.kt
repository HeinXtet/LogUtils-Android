package com.heinhtet.deevd.logutils

import android.util.Log

/**
 * Created by heinhtet on 1/9/18.
 */

class DeevdLog {

    companion object Instance {

        var TAG: String = "DeevDLog"

        fun d(message: String) {
            Log.d(TAG, message)
        }


    }
}