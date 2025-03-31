package com.performance.module_3_173

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_3_173.R
import kotlinx.coroutines.launch
import com.performance.module_2_140.Feature140Repository

class Feature173Fragment : Fragment() {
    private lateinit var viewModel: Feature173ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_173, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature173ViewModel::class.java]
        
        val repository0 = Feature140Repository()
        lifecycleScope.launch {
            repository0.getData()
        }

    }
}
