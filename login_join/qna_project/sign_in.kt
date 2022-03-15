package org.techtown.qna_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import org.techtown.qna_project.databinding.ActivitySignInBinding

class sign_in : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    private lateinit var binding : ActivitySignInBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        auth = Firebase.auth

        binding = DataBindingUtil.setContentView(this, R.layout.activity_sign_in)

        binding.backbtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


        binding.joinbtn.setOnClickListener {

            var isGoToJoin = true

            val email = binding.emailArea.text.toString()
            val pwd1 = binding.pwdArea1.text.toString()
            val pwd2 = binding.pwdArea2.text.toString()

            //값이 비어있는지 확인
            if(email.isEmpty()) {
                Toast.makeText(this, "이메일을 입력해주세요", Toast.LENGTH_SHORT).show()
                isGoToJoin = false
            }
            if(pwd1.isEmpty()) {
                Toast.makeText(this, "비밀번호를 입력해주세요", Toast.LENGTH_SHORT).show()
                isGoToJoin = false
            }
            if(pwd2.isEmpty()) {
                Toast.makeText(this, "비밀번호를 입력해주세요", Toast.LENGTH_SHORT).show()
                isGoToJoin = false
            }

            // 비밀번호 확인
            if(!pwd1.equals(pwd2)) {
                Toast.makeText(this, "비밀번호를 동일하게 입력해주세요", Toast.LENGTH_SHORT).show()
                isGoToJoin = false
            }

            // 비밀번호 자리수 확인
            if(pwd1.length < 6) {
                Toast.makeText(this, "비밀번호를 6자리 이상으로 작성해주세요", Toast.LENGTH_SHORT).show()
                isGoToJoin = false
            }

            isGoToJoin = true

            if(isGoToJoin) {

                auth.createUserWithEmailAndPassword(email, pwd1)
                    .addOnCompleteListener(this) { task ->
                        // 로그인 성공시
                        if (task.isSuccessful) {

                            Toast.makeText(this, "로그인 성공", Toast.LENGTH_SHORT).show()

                            // QnA main 으로 이동
                            val intent = Intent(this, QnAmain::class.java)
                            // 로그인 성공하면 뒤로가기 눌러도 다시 로그인 화면 진입 못하도록
                            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP
                            startActivity(intent)

                        }
                        else { // 로그인 실패시

                            Toast.makeText(this,"로그인 실패", Toast.LENGTH_SHORT).show()

                        }
                    }
            }






        }






    }
}