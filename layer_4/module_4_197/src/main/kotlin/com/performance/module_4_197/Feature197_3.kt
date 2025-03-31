package com.performance.module_4_197

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_4_197.R
import kotlinx.coroutines.launch
import com.performance.module_3_175.Feature175Repository
import com.performance.module_3_177.Feature177Repository
import com.performance.module_3_179.Feature179Repository
import com.performance.module_3_171.Feature171Repository
import com.performance.module_3_178.Feature178Repository
import com.performance.module_3_173.Feature173Repository
import com.performance.module_3_180.Feature180Repository
import com.performance.module_3_181.Feature181Repository

class Feature197Fragment : Fragment() {
    private lateinit var viewModel: Feature197ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_197, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature197ViewModel::class.java]
        
        val repository0 = Feature175Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature177Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature179Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature171Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature178Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature173Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature180Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature181Repository()
        lifecycleScope.launch {
            repository7.getData()
        }

    }
}
