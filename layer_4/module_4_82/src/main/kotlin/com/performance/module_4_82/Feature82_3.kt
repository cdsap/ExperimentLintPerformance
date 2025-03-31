package com.performance.module_4_82

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_4_82.R
import kotlinx.coroutines.launch
import com.performance.module_3_74.Feature74Repository
import com.performance.module_3_50.Feature50Repository
import com.performance.module_3_54.Feature54Repository
import com.performance.module_3_63.Feature63Repository
import com.performance.module_3_68.Feature68Repository
import com.performance.module_3_70.Feature70Repository
import com.performance.module_3_72.Feature72Repository
import com.performance.module_3_61.Feature61Repository
import com.performance.module_3_67.Feature67Repository
import com.performance.module_3_66.Feature66Repository
import com.performance.module_3_65.Feature65Repository
import com.performance.module_3_52.Feature52Repository

class Feature82Fragment : Fragment() {
    private lateinit var viewModel: Feature82ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_82, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature82ViewModel::class.java]
        
        val repository0 = Feature74Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature50Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature54Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature63Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature68Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature70Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature72Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature61Repository()
        lifecycleScope.launch {
            repository7.getData()
        }
        val repository8 = Feature67Repository()
        lifecycleScope.launch {
            repository8.getData()
        }
        val repository9 = Feature66Repository()
        lifecycleScope.launch {
            repository9.getData()
        }
        val repository10 = Feature65Repository()
        lifecycleScope.launch {
            repository10.getData()
        }
        val repository11 = Feature52Repository()
        lifecycleScope.launch {
            repository11.getData()
        }

    }
}
