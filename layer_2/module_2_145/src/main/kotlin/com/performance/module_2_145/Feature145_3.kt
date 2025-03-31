package com.performance.module_2_145

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_2_145.R
import kotlinx.coroutines.launch
import com.performance.module_1_107.Feature107Repository
import com.performance.module_1_118.Feature118Repository
import com.performance.module_1_132.Feature132Repository
import com.performance.module_1_122.Feature122Repository
import com.performance.module_1_106.Feature106Repository
import com.performance.module_1_98.Feature98Repository
import com.performance.module_1_94.Feature94Repository
import com.performance.module_1_120.Feature120Repository
import com.performance.module_1_110.Feature110Repository
import com.performance.module_1_123.Feature123Repository
import com.performance.module_1_125.Feature125Repository
import com.performance.module_1_129.Feature129Repository

class Feature145Fragment : Fragment() {
    private lateinit var viewModel: Feature145ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_145, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature145ViewModel::class.java]
        
        val repository0 = Feature107Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature118Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature132Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature122Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature106Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature98Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature94Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature120Repository()
        lifecycleScope.launch {
            repository7.getData()
        }
        val repository8 = Feature110Repository()
        lifecycleScope.launch {
            repository8.getData()
        }
        val repository9 = Feature123Repository()
        lifecycleScope.launch {
            repository9.getData()
        }
        val repository10 = Feature125Repository()
        lifecycleScope.launch {
            repository10.getData()
        }
        val repository11 = Feature129Repository()
        lifecycleScope.launch {
            repository11.getData()
        }

    }
}
