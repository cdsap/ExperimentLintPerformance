package com.performance.module_1_107

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_1_107.R
import kotlinx.coroutines.launch
import com.performance.module_0_56.Feature56Repository
import com.performance.module_0_21.Feature21Repository
import com.performance.module_0_35.Feature35Repository
import com.performance.module_0_64.Feature64Repository
import com.performance.module_0_48.Feature48Repository
import com.performance.module_0_69.Feature69Repository
import com.performance.module_0_36.Feature36Repository
import com.performance.module_0_2.Feature2Repository
import com.performance.module_0_76.Feature76Repository
import com.performance.module_0_61.Feature61Repository
import com.performance.module_0_12.Feature12Repository
import com.performance.module_0_27.Feature27Repository

class Feature107Fragment : Fragment() {
    private lateinit var viewModel: Feature107ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_107, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature107ViewModel::class.java]
        
        val repository0 = Feature56Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature21Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature35Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature64Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature48Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature69Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature36Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature2Repository()
        lifecycleScope.launch {
            repository7.getData()
        }
        val repository8 = Feature76Repository()
        lifecycleScope.launch {
            repository8.getData()
        }
        val repository9 = Feature61Repository()
        lifecycleScope.launch {
            repository9.getData()
        }
        val repository10 = Feature12Repository()
        lifecycleScope.launch {
            repository10.getData()
        }
        val repository11 = Feature27Repository()
        lifecycleScope.launch {
            repository11.getData()
        }

    }
}
