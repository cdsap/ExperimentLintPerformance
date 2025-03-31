package com.performance.module_2_48

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_2_48.R
import kotlinx.coroutines.launch
import com.performance.module_1_26.Feature26Repository
import com.performance.module_1_18.Feature18Repository
import com.performance.module_1_40.Feature40Repository
import com.performance.module_1_21.Feature21Repository
import com.performance.module_1_20.Feature20Repository
import com.performance.module_1_39.Feature39Repository
import com.performance.module_1_33.Feature33Repository
import com.performance.module_1_24.Feature24Repository
import com.performance.module_1_38.Feature38Repository
import com.performance.module_1_47.Feature47Repository
import com.performance.module_1_44.Feature44Repository
import com.performance.module_1_29.Feature29Repository
import com.performance.module_1_16.Feature16Repository
import com.performance.module_1_25.Feature25Repository
import com.performance.module_1_30.Feature30Repository
import com.performance.module_1_31.Feature31Repository

class Feature48Fragment : Fragment() {
    private lateinit var viewModel: Feature48ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_48, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature48ViewModel::class.java]
        
        val repository0 = Feature26Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature18Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature40Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature21Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature20Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature39Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature33Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature24Repository()
        lifecycleScope.launch {
            repository7.getData()
        }
        val repository8 = Feature38Repository()
        lifecycleScope.launch {
            repository8.getData()
        }
        val repository9 = Feature47Repository()
        lifecycleScope.launch {
            repository9.getData()
        }
        val repository10 = Feature44Repository()
        lifecycleScope.launch {
            repository10.getData()
        }
        val repository11 = Feature29Repository()
        lifecycleScope.launch {
            repository11.getData()
        }
        val repository12 = Feature16Repository()
        lifecycleScope.launch {
            repository12.getData()
        }
        val repository13 = Feature25Repository()
        lifecycleScope.launch {
            repository13.getData()
        }
        val repository14 = Feature30Repository()
        lifecycleScope.launch {
            repository14.getData()
        }
        val repository15 = Feature31Repository()
        lifecycleScope.launch {
            repository15.getData()
        }

    }
}
