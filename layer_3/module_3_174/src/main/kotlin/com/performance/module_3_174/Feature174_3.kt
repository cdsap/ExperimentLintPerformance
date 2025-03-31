package com.performance.module_3_174

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_3_174.R
import kotlinx.coroutines.launch
import com.performance.module_2_148.Feature148Repository
import com.performance.module_2_149.Feature149Repository
import com.performance.module_2_134.Feature134Repository
import com.performance.module_2_150.Feature150Repository
import com.performance.module_2_142.Feature142Repository
import com.performance.module_2_137.Feature137Repository
import com.performance.module_2_133.Feature133Repository
import com.performance.module_2_154.Feature154Repository

class Feature174Fragment : Fragment() {
    private lateinit var viewModel: Feature174ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_174, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature174ViewModel::class.java]
        
        val repository0 = Feature148Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature149Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature134Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature150Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature142Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature137Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature133Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature154Repository()
        lifecycleScope.launch {
            repository7.getData()
        }

    }
}
