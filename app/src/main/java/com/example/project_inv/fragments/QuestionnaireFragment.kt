package com.example.project_inv.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.project_inv.R
import com.example.project_inv.UserQuestionnaire


class QuestionnaireFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_questionnaire, container, false)
        val btn = view.findViewById<Button>(R.id.classcx)
        btn.setOnClickListener {
            val intent = Intent(context, UserQuestionnaire::class.java)
            startActivity(intent)
        }
        return view
    }

}