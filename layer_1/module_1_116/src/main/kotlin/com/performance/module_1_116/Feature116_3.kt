package com.performance.module_1_116

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_1_116.R
import kotlinx.coroutines.launch
import com.performance.module_0_56.Feature56Repository
import com.performance.module_0_69.Feature69Repository
import com.performance.module_0_54.Feature54Repository
import com.performance.module_0_41.Feature41Repository
import com.performance.module_0_2.Feature2Repository
import com.performance.module_0_46.Feature46Repository
import com.performance.module_0_67.Feature67Repository
import com.performance.module_0_61.Feature61Repository

class Feature116Fragment : Fragment() {
    private lateinit var viewModel: Feature116ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_116, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature116ViewModel::class.java]
        
        val repository0 = Feature56Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature69Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature54Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature41Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature2Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature46Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature67Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature61Repository()
        lifecycleScope.launch {
            repository7.getData()
        }

    }
}
