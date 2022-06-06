package com.example.project_inv

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.project_inv.databinding.ActivityMainBinding
import com.example.project_inv.fragments.ProjectFragment
import com.example.project_inv.fragments.QuestionnaireFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private val questionnaireFragment = QuestionnaireFragment()
    private val projectFragment = ProjectFragment()
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        replaceFragment(projectFragment)

        binding.bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.questionnaire -> replaceFragment(questionnaireFragment)
                R.id.project -> replaceFragment(projectFragment)
            }
            true
        }

    }

    private fun replaceFragment(fragment: Fragment) {
        if(fragment != null) {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.frameLayout, fragment)
            transaction.commit()
        }
    }

}