package com.example.udacity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.udacity.databinding.FragmentGameOverBinding


class GameOverFragment : Fragment() {
   private var binding: FragmentGameOverBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentGameOverBinding.inflate(inflater, container, false)
        binding?.tryBtn?.setOnClickListener {
            view?.findNavController()?.navigate(R.id.action_gameOverFragment_to_gameFragment)
        }
        return binding?.root
    }

}