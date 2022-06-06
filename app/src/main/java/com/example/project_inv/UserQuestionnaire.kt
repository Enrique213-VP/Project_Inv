package com.example.project_inv

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.view.inputmethod.InputMethodManager
import android.widget.RadioGroup
import android.widget.Toast
import com.example.project_inv.databinding.ActivityMainBinding
import com.example.project_inv.databinding.ActivityUserQuestionnaireBinding

class UserQuestionnaire : AppCompatActivity(), RadioGroup.OnCheckedChangeListener {
    private lateinit var binding: ActivityUserQuestionnaireBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserQuestionnaireBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        binding.secondAsk.setOnCheckedChangeListener(this)


        binding.backBottom.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }


    override fun onCheckedChanged(p0: RadioGroup?, idSecondAsk: Int) {
        when(idSecondAsk) {
            binding.firstSolution?.id -> Toast.makeText(this, "mujer", Toast.LENGTH_LONG).show()
            binding.SecondSolution?.id -> Toast.makeText(this, "Hombre", Toast.LENGTH_LONG).show()
            binding.thirdSolution?.id -> Toast.makeText(this, "Prefiero no decirlo", Toast.LENGTH_LONG).show()

        }
    }


}