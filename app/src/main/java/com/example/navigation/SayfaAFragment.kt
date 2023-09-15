package com.example.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigation.databinding.FragmentASayfasiBinding
import com.example.navigation.databinding.FragmentAnasayfaBinding
import com.example.navigation.databinding.FragmentSayfaBBinding

class SayfaAFragment : Fragment() {
 private lateinit var binding: FragmentASayfasiBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentASayfasiBinding.inflate(inflater, container, false)

        binding.buttonB.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.bGecisY)

        }
        return binding.root
    }

}