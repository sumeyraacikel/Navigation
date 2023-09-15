package com.example.navigation

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import com.example.navigation.databinding.FragmentSayfaYBinding
import com.google.android.material.snackbar.Snackbar

class SayfaYFragment : Fragment() {
    private lateinit var binding: FragmentSayfaYBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSayfaYBinding.inflate(inflater, container, false)
        binding.textView3.text = "Sayfa Y"

        val geriTusu = object : OnBackPressedCallback(true){//true: geri dönüş aktif değil
        override fun handleOnBackPressed() {

            Snackbar.make(binding.textView3, "Geri dönmek istiyor musunuz?", Snackbar.LENGTH_SHORT)
                .setAction("EVET"){
                    isEnabled = false
                    val intent = Intent(requireContext(), AnasayfaFragment::class.java)
                    startActivity(intent)
                    requireActivity().onBackPressedDispatcher.onBackPressed()

                }.show()
        }
        }

        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, geriTusu)
        return binding.root

            }
}