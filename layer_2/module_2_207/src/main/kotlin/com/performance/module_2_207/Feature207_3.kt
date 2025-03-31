package com.performance.module_2_207

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_2_207.R
import kotlinx.coroutines.launch
import com.performance.module_1_191.Feature191Repository
import com.performance.module_1_176.Feature176Repository
import com.performance.module_1_157.Feature157Repository
import com.performance.module_1_148.Feature148Repository
import com.performance.module_1_136.Feature136Repository
import com.performance.module_1_182.Feature182Repository
import com.performance.module_1_193.Feature193Repository
import com.performance.module_1_141.Feature141Repository
import com.performance.module_1_178.Feature178Repository

class Feature207Fragment : Fragment() {
    private lateinit var viewModel: Feature207ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_207, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature207ViewModel::class.java]
        
        val repository0 = Feature191Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature176Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature157Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature148Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature136Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature182Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature193Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature141Repository()
        lifecycleScope.launch {
            repository7.getData()
        }
        val repository8 = Feature178Repository()
        lifecycleScope.launch {
            repository8.getData()
        }

    }
}
