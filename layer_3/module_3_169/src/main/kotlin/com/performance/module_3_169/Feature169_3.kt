package com.performance.module_3_169

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_3_169.R
import kotlinx.coroutines.launch
import com.performance.module_2_148.Feature148Repository
import com.performance.module_2_133.Feature133Repository
import com.performance.module_2_147.Feature147Repository
import com.performance.module_2_160.Feature160Repository
import com.performance.module_2_150.Feature150Repository
import com.performance.module_2_134.Feature134Repository
import com.performance.module_2_137.Feature137Repository
import com.performance.module_2_155.Feature155Repository

class Feature169Fragment : Fragment() {
    private lateinit var viewModel: Feature169ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_169, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature169ViewModel::class.java]
        
        val repository0 = Feature148Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature133Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature147Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature160Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature150Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature134Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature137Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature155Repository()
        lifecycleScope.launch {
            repository7.getData()
        }

    }
}
