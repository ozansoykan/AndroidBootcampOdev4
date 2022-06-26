package com.ozansoykan.androidbootcampodev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.ozansoykan.androidbootcampodev4.databinding.FragmentAnaSayfaBinding
import com.ozansoykan.androidbootcampodev4.databinding.FragmentSayfaBBinding

class SayfaBFragment : Fragment() {

    private lateinit var tasarim : FragmentSayfaBBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        tasarim = FragmentSayfaBBinding.inflate(inflater, container, false)
        tasarim.buttonGitY.setOnClickListener {
            val gecis = SayfaBFragmentDirections.gecisY()
            Navigation.findNavController(it).navigate(gecis)
        }
        return tasarim.root
    }



}