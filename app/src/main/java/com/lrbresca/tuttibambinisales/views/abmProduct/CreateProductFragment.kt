package com.lrbresca.tuttibambinisales.views.abmProduct

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.lrbresca.tuttibambinisales.R
import com.lrbresca.tuttibambinisales.databinding.FragmentCreateProductBinding

class CreateProductFragment: Fragment() {


    private var _binding: FragmentCreateProductBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCreateProductBinding.inflate(inflater, container, false)
        return binding.root
    }
}