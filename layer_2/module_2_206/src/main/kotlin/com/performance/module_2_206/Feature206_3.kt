package com.performance.module_2_206

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_2_206.R
import kotlinx.coroutines.launch
import com.performance.module_1_144.Feature144Repository
import com.performance.module_1_143.Feature143Repository
import com.performance.module_1_151.Feature151Repository
import com.performance.module_1_152.Feature152Repository
import com.performance.module_1_149.Feature149Repository
import com.performance.module_1_158.Feature158Repository
import com.performance.module_1_188.Feature188Repository
import com.performance.module_1_157.Feature157Repository
import com.performance.module_1_147.Feature147Repository
import com.performance.module_1_194.Feature194Repository
import com.performance.module_1_177.Feature177Repository
import com.performance.module_1_173.Feature173Repository
import com.performance.module_1_170.Feature170Repository

class Feature206Fragment : Fragment() {
    private lateinit var viewModel: Feature206ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_206, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature206ViewModel::class.java]
        
        val repository0 = Feature144Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature143Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature151Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature152Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature149Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature158Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature188Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature157Repository()
        lifecycleScope.launch {
            repository7.getData()
        }
        val repository8 = Feature147Repository()
        lifecycleScope.launch {
            repository8.getData()
        }
        val repository9 = Feature194Repository()
        lifecycleScope.launch {
            repository9.getData()
        }
        val repository10 = Feature177Repository()
        lifecycleScope.launch {
            repository10.getData()
        }
        val repository11 = Feature173Repository()
        lifecycleScope.launch {
            repository11.getData()
        }
        val repository12 = Feature170Repository()
        lifecycleScope.launch {
            repository12.getData()
        }

    }
}
