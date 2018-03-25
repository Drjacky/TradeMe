package ir.hosseinabbasi.trademe.utils

import android.app.ProgressDialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import ir.hosseinabbasi.trademe.R

/**
 * Created by Dr.jacky on 2018/03/25.
 */
class CommonUtils constructor() {

    companion object {
        fun showLoadingDialog(context : Context) : ProgressDialog{
            val progressDialog = ProgressDialog(context)
            progressDialog.show()
            if (progressDialog.window != null) {
                progressDialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            }
            progressDialog.setContentView(R.layout.progress_dialog)
            progressDialog.isIndeterminate = true
            progressDialog.setCancelable(true)
            progressDialog.setCanceledOnTouchOutside(false)
            return progressDialog
        }
    }
}