package com.soojin.a2022_qna

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.soojin.a2022_qna.databinding.ActivityMainBinding
import com.soojin.a2022_qna.databinding.ActivityQnaBinding

class qna_Activity : AppCompatActivity() {

    private lateinit var binding : ActivityQnaBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_qna)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_qna)

        //openroom 게시판으로 액티비티 전환
        binding.openBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}