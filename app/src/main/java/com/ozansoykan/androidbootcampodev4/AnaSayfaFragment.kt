package com.ozansoykan.androidbootcampodev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.ozansoykan.androidbootcampodev4.databinding.FragmentAnaSayfaBinding


class AnaSayfaFragment : Fragment() {

    private lateinit var tasarim : FragmentAnaSayfaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        tasarim = FragmentAnaSayfaBinding.inflate(inflater, container, false)
        tasarim.buttonGitA.setOnClickListener {

            val gecis = AnaSayfaFragmentDirections.gecisA()
            Navigation.findNavController(it).navigate(gecis)
        }
        tasarim.buttonGitX.setOnClickListener {

            val gecis = AnaSayfaFragmentDirections.gecisX()
            Navigation.findNavController(it).navigate(gecis)
        }
        return tasarim.root


    }


}