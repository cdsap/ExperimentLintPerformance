package com.performance.module_2_241

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_2_241.R
import kotlinx.coroutines.launch
import com.performance.module_1_193.Feature193Repository
import com.performance.module_1_153.Feature153Repository
import com.performance.module_1_155.Feature155Repository
import com.performance.module_1_174.Feature174Repository
import com.performance.module_1_178.Feature178Repository
import com.performance.module_1_158.Feature158Repository
import com.performance.module_1_135.Feature135Repository
import com.performance.module_1_163.Feature163Repository

class Feature241Fragment : Fragment() {
    private lateinit var viewModel: Feature241ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_241, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature241ViewModel::class.java]
        
        val repository0 = Feature193Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature153Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature155Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature174Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature178Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature158Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature135Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature163Repository()
        lifecycleScope.launch {
            repository7.getData()
        }

    }
}
