package com.performance.module_2_153

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_2_153.R
import kotlinx.coroutines.launch
import com.performance.module_1_122.Feature122Repository
import com.performance.module_1_115.Feature115Repository
import com.performance.module_1_101.Feature101Repository
import com.performance.module_1_131.Feature131Repository
import com.performance.module_1_95.Feature95Repository
import com.performance.module_1_99.Feature99Repository
import com.performance.module_1_113.Feature113Repository
import com.performance.module_1_109.Feature109Repository
import com.performance.module_1_91.Feature91Repository
import com.performance.module_1_130.Feature130Repository

class Feature153Fragment : Fragment() {
    private lateinit var viewModel: Feature153ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_153, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature153ViewModel::class.java]
        
        val repository0 = Feature122Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature115Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature101Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature131Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature95Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature99Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature113Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature109Repository()
        lifecycleScope.launch {
            repository7.getData()
        }
        val repository8 = Feature91Repository()
        lifecycleScope.launch {
            repository8.getData()
        }
        val repository9 = Feature130Repository()
        lifecycleScope.launch {
            repository9.getData()
        }

    }
}
