package com.performance.module_4_292

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_4_292.R
import kotlinx.coroutines.launch
import com.performance.module_3_260.Feature260Repository
import com.performance.module_3_251.Feature251Repository
import com.performance.module_3_243.Feature243Repository
import com.performance.module_3_246.Feature246Repository
import com.performance.module_3_267.Feature267Repository
import com.performance.module_3_269.Feature269Repository

class Feature292Fragment : Fragment() {
    private lateinit var viewModel: Feature292ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_292, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature292ViewModel::class.java]
        
        val repository0 = Feature260Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature251Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature243Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature246Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature267Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature269Repository()
        lifecycleScope.launch {
            repository5.getData()
        }

    }
}
