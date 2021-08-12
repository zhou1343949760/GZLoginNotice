package com.hzgzsoft.gzloginnotice

import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.hzgzsoft.gz_login_notice.LoginNotice_java

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val LinearLayout: LinearLayout = findViewById(R.id.linear)



        LoginNotice_java.initNotice(this,LinearLayout,
        "http://192.168.2.9:90/Mobile/Online/notice/",
            "http://slzyjc.lyj.zj.gov.cn/slzy/admin/NoticeShow.aspx?Id=9")


    }
}