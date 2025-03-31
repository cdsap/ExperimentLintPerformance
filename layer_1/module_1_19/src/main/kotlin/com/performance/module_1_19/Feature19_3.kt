package com.performance.module_1_19

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_1_19.R
import kotlinx.coroutines.launch
import com.performance.module_0_4.Feature4Repository
import com.performance.module_0_15.Feature15Repository
import com.performance.module_0_12.Feature12Repository
import com.performance.module_0_11.Feature11Repository
import com.performance.module_0_14.Feature14Repository
import com.performance.module_0_1.Feature1Repository

class Feature19Fragment : Fragment() {
    private lateinit var viewModel: Feature19ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_19, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature19ViewModel::class.java]
        
        val repository0 = Feature4Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature15Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature12Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature11Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature14Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature1Repository()
        lifecycleScope.launch {
            repository5.getData()
        }

    }
}
