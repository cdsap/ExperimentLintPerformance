package com.performance.module_1_177

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_1_177.R
import kotlinx.coroutines.launch
import com.performance.module_0_102.Feature102Repository
import com.performance.module_0_59.Feature59Repository
import com.performance.module_0_23.Feature23Repository
import com.performance.module_0_6.Feature6Repository
import com.performance.module_0_119.Feature119Repository
import com.performance.module_0_17.Feature17Repository
import com.performance.module_0_56.Feature56Repository
import com.performance.module_0_27.Feature27Repository
import com.performance.module_0_3.Feature3Repository
import com.performance.module_0_80.Feature80Repository
import com.performance.module_0_125.Feature125Repository

class Feature177Fragment : Fragment() {
    private lateinit var viewModel: Feature177ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_177, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature177ViewModel::class.java]
        
        val repository0 = Feature102Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature59Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature23Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature6Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature119Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature17Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature56Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature27Repository()
        lifecycleScope.launch {
            repository7.getData()
        }
        val repository8 = Feature3Repository()
        lifecycleScope.launch {
            repository8.getData()
        }
        val repository9 = Feature80Repository()
        lifecycleScope.launch {
            repository9.getData()
        }
        val repository10 = Feature125Repository()
        lifecycleScope.launch {
            repository10.getData()
        }

    }
}
