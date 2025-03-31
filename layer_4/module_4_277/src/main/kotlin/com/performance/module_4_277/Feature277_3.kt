package com.performance.module_4_277

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_4_277.R
import kotlinx.coroutines.launch
import com.performance.module_3_249.Feature249Repository
import com.performance.module_3_268.Feature268Repository
import com.performance.module_3_247.Feature247Repository
import com.performance.module_3_252.Feature252Repository

class Feature277Fragment : Fragment() {
    private lateinit var viewModel: Feature277ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_277, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature277ViewModel::class.java]
        
        val repository0 = Feature249Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature268Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature247Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature252Repository()
        lifecycleScope.launch {
            repository3.getData()
        }

    }
}
