package com.performance.module_1_132

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_1_132.R
import kotlinx.coroutines.launch
import com.performance.module_0_2.Feature2Repository
import com.performance.module_0_15.Feature15Repository
import com.performance.module_0_26.Feature26Repository
import com.performance.module_0_79.Feature79Repository
import com.performance.module_0_72.Feature72Repository
import com.performance.module_0_48.Feature48Repository
import com.performance.module_0_60.Feature60Repository
import com.performance.module_0_59.Feature59Repository
import com.performance.module_0_65.Feature65Repository
import com.performance.module_0_54.Feature54Repository
import com.performance.module_0_53.Feature53Repository
import com.performance.module_0_25.Feature25Repository
import com.performance.module_0_7.Feature7Repository
import com.performance.module_0_82.Feature82Repository
import com.performance.module_0_5.Feature5Repository

class Feature132Fragment : Fragment() {
    private lateinit var viewModel: Feature132ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_132, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature132ViewModel::class.java]
        
        val repository0 = Feature2Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature15Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature26Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature79Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature72Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature48Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature60Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature59Repository()
        lifecycleScope.launch {
            repository7.getData()
        }
        val repository8 = Feature65Repository()
        lifecycleScope.launch {
            repository8.getData()
        }
        val repository9 = Feature54Repository()
        lifecycleScope.launch {
            repository9.getData()
        }
        val repository10 = Feature53Repository()
        lifecycleScope.launch {
            repository10.getData()
        }
        val repository11 = Feature25Repository()
        lifecycleScope.launch {
            repository11.getData()
        }
        val repository12 = Feature7Repository()
        lifecycleScope.launch {
            repository12.getData()
        }
        val repository13 = Feature82Repository()
        lifecycleScope.launch {
            repository13.getData()
        }
        val repository14 = Feature5Repository()
        lifecycleScope.launch {
            repository14.getData()
        }

    }
}
