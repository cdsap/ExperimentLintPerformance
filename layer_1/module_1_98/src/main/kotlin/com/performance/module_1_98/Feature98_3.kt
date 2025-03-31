package com.performance.module_1_98

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_1_98.R
import kotlinx.coroutines.launch
import com.performance.module_0_22.Feature22Repository
import com.performance.module_0_58.Feature58Repository
import com.performance.module_0_40.Feature40Repository
import com.performance.module_0_63.Feature63Repository
import com.performance.module_0_68.Feature68Repository
import com.performance.module_0_17.Feature17Repository
import com.performance.module_0_33.Feature33Repository
import com.performance.module_0_77.Feature77Repository

class Feature98Fragment : Fragment() {
    private lateinit var viewModel: Feature98ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_98, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature98ViewModel::class.java]
        
        val repository0 = Feature22Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature58Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature40Repository()
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
        val repository5 = Feature17Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature33Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature77Repository()
        lifecycleScope.launch {
            repository7.getData()
        }

    }
}
