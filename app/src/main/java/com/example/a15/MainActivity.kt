package com.example.a15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        class Solution {
            fun solution(n: Int): Int {
                var answer: Int = 0
                for(i in n downTo  1 ){
                    if(n%i==1) answer = i
                }
                return answer
            }
        }
        val a = Solution()
        a.solution(10)
        a.solution(12)
    }
}