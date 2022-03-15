package com.soojin.a2022_qna

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.soojin.a2022_qna.board.Write_Activity
import com.soojin.a2022_qna.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        //QnA 게시판으로 액티비티 전환
        binding.qnaBtn.setOnClickListener {
            val intent = Intent(this, qna_Activity::class.java)
            startActivity(intent)
        }

        //글쓰기 페이지로 액티비티 전환
        binding.writeBtn.setOnClickListener {
            val intent = Intent(this, Write_Activity::class.java)
            startActivity(intent)
        }

    }
}