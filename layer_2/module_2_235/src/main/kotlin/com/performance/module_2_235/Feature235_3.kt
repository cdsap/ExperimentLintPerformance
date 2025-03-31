package com.performance.module_2_235

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_2_235.R
import kotlinx.coroutines.launch
import com.performance.module_1_193.Feature193Repository
import com.performance.module_1_192.Feature192Repository
import com.performance.module_1_165.Feature165Repository
import com.performance.module_1_154.Feature154Repository
import com.performance.module_1_139.Feature139Repository
import com.performance.module_1_147.Feature147Repository
import com.performance.module_1_148.Feature148Repository
import com.performance.module_1_159.Feature159Repository
import com.performance.module_1_152.Feature152Repository
import com.performance.module_1_144.Feature144Repository
import com.performance.module_1_160.Feature160Repository
import com.performance.module_1_137.Feature137Repository
import com.performance.module_1_170.Feature170Repository

class Feature235Fragment : Fragment() {
    private lateinit var viewModel: Feature235ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_235, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature235ViewModel::class.java]
        
        val repository0 = Feature193Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature192Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature165Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature154Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature139Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature147Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature148Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature159Repository()
        lifecycleScope.launch {
            repository7.getData()
        }
        val repository8 = Feature152Repository()
        lifecycleScope.launch {
            repository8.getData()
        }
        val repository9 = Feature144Repository()
        lifecycleScope.launch {
            repository9.getData()
        }
        val repository10 = Feature160Repository()
        lifecycleScope.launch {
            repository10.getData()
        }
        val repository11 = Feature137Repository()
        lifecycleScope.launch {
            repository11.getData()
        }
        val repository12 = Feature170Repository()
        lifecycleScope.launch {
            repository12.getData()
        }

    }
}
