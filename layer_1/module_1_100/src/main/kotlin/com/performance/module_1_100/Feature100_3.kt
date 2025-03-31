package com.performance.module_1_100

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_1_100.R
import kotlinx.coroutines.launch
import com.performance.module_0_80.Feature80Repository
import com.performance.module_0_17.Feature17Repository
import com.performance.module_0_1.Feature1Repository
import com.performance.module_0_65.Feature65Repository
import com.performance.module_0_64.Feature64Repository
import com.performance.module_0_83.Feature83Repository
import com.performance.module_0_12.Feature12Repository
import com.performance.module_0_32.Feature32Repository
import com.performance.module_0_44.Feature44Repository
import com.performance.module_0_25.Feature25Repository
import com.performance.module_0_37.Feature37Repository
import com.performance.module_0_34.Feature34Repository

class Feature100Fragment : Fragment() {
    private lateinit var viewModel: Feature100ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_100, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature100ViewModel::class.java]
        
        val repository0 = Feature80Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature17Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature1Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature65Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature64Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature83Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature12Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature32Repository()
        lifecycleScope.launch {
            repository7.getData()
        }
        val repository8 = Feature44Repository()
        lifecycleScope.launch {
            repository8.getData()
        }
        val repository9 = Feature25Repository()
        lifecycleScope.launch {
            repository9.getData()
        }
        val repository10 = Feature37Repository()
        lifecycleScope.launch {
            repository10.getData()
        }
        val repository11 = Feature34Repository()
        lifecycleScope.launch {
            repository11.getData()
        }

    }
}
