package com.performance.module_2_155

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_2_155.R
import kotlinx.coroutines.launch
import com.performance.module_1_129.Feature129Repository
import com.performance.module_1_102.Feature102Repository
import com.performance.module_1_103.Feature103Repository
import com.performance.module_1_124.Feature124Repository
import com.performance.module_1_117.Feature117Repository
import com.performance.module_1_110.Feature110Repository
import com.performance.module_1_100.Feature100Repository
import com.performance.module_1_132.Feature132Repository
import com.performance.module_1_115.Feature115Repository

class Feature155Fragment : Fragment() {
    private lateinit var viewModel: Feature155ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_155, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature155ViewModel::class.java]
        
        val repository0 = Feature129Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature102Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature103Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature124Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature117Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature110Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature100Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature132Repository()
        lifecycleScope.launch {
            repository7.getData()
        }
        val repository8 = Feature115Repository()
        lifecycleScope.launch {
            repository8.getData()
        }

    }
}
