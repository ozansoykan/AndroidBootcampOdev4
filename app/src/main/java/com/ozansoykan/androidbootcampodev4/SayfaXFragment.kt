package com.ozansoykan.androidbootcampodev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.ozansoykan.androidbootcampodev4.databinding.FragmentSayfaXBinding

class SayfaXFragment : Fragment() {
    private lateinit var tasarim : FragmentSayfaXBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        tasarim = FragmentSayfaXBinding.inflate(inflater, container, false)
        tasarim.buttonGitY2.setOnClickListener {
            val gecis = SayfaXFragmentDirections.gecisY1()
            Navigation.findNavController(it).navigate(gecis)
        }
        return tasarim.root
    }

}