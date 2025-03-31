package com.performance.module_2_146

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_2_146.R
import kotlinx.coroutines.launch
import com.performance.module_1_118.Feature118Repository
import com.performance.module_1_128.Feature128Repository
import com.performance.module_1_127.Feature127Repository
import com.performance.module_1_95.Feature95Repository
import com.performance.module_1_109.Feature109Repository
import com.performance.module_1_96.Feature96Repository
import com.performance.module_1_98.Feature98Repository
import com.performance.module_1_93.Feature93Repository

class Feature146Fragment : Fragment() {
    private lateinit var viewModel: Feature146ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_146, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature146ViewModel::class.java]
        
        val repository0 = Feature118Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature128Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature127Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature95Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature109Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature96Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature98Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature93Repository()
        lifecycleScope.launch {
            repository7.getData()
        }

    }
}
