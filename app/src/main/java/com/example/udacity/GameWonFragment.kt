package com.example.udacity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.udacity.databinding.FragmentGameWonBinding

class GameWonFragment : Fragment() {
   private var binding: FragmentGameWonBinding? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentGameWonBinding.inflate(inflater, container, false)
        binding?.btnCongrats?.setOnClickListener {
            view?.findNavController()?.navigate(R.id.action_gameWonFragment_to_gameFragment)
        }
        return binding?.root
    }
}