package com.performance.module_3_258

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_3_258.R
import kotlinx.coroutines.launch
import com.performance.module_2_238.Feature238Repository
import com.performance.module_2_204.Feature204Repository
import com.performance.module_2_230.Feature230Repository
import com.performance.module_2_214.Feature214Repository
import com.performance.module_2_225.Feature225Repository
import com.performance.module_2_228.Feature228Repository
import com.performance.module_2_223.Feature223Repository
import com.performance.module_2_226.Feature226Repository
import com.performance.module_2_231.Feature231Repository

class Feature258Fragment : Fragment() {
    private lateinit var viewModel: Feature258ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_258, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature258ViewModel::class.java]
        
        val repository0 = Feature238Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature204Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature230Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature214Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature225Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature228Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature223Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature226Repository()
        lifecycleScope.launch {
            repository7.getData()
        }
        val repository8 = Feature231Repository()
        lifecycleScope.launch {
            repository8.getData()
        }

    }
}
