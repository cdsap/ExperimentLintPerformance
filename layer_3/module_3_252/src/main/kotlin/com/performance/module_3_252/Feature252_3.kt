package com.performance.module_3_252

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_3_252.R
import kotlinx.coroutines.launch
import com.performance.module_2_238.Feature238Repository
import com.performance.module_2_234.Feature234Repository

class Feature252Fragment : Fragment() {
    private lateinit var viewModel: Feature252ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_252, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature252ViewModel::class.java]
        
        val repository0 = Feature238Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature234Repository()
        lifecycleScope.launch {
            repository1.getData()
        }

    }
}
