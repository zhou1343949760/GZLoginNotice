package com.hzgzsoft.gzloginnotice

import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.hzgzsoft.gz_login_notice.LoginNotice_java
import com.hzgzsoft.gz_login_notice.ShowWebView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val linear_notice: LinearLayout = findViewById(R.id.linear_notice)



        LoginNotice_java.initNotice(this,linear_notice,
        "http://192.168.2.9:90/Mobile/Online/notice/",
            ShowWebView {
                Toast.makeText(this, "  $it",Toast.LENGTH_SHORT).show()
            })

    }

    override fun onStop() {
        super.onStop()
        LoginNotice_java.textbanner_stopViewAnimator()
    }

    override fun onResume() {
        super.onResume()
        LoginNotice_java.textbanner_startViewAnimator()
    }
}