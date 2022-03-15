package com.soojin.a2022_qna.board

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.soojin.a2022_qna.R
import com.soojin.a2022_qna.databinding.ActivityWriteBinding

class Write_Activity : AppCompatActivity() {

    private lateinit var binding : ActivityWriteBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_write)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_write)



    }
}