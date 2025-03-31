package com.performance.module_2_237

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_2_237.R
import kotlinx.coroutines.launch
import com.performance.module_1_136.Feature136Repository
import com.performance.module_1_188.Feature188Repository
import com.performance.module_1_155.Feature155Repository
import com.performance.module_1_180.Feature180Repository
import com.performance.module_1_157.Feature157Repository
import com.performance.module_1_185.Feature185Repository
import com.performance.module_1_183.Feature183Repository

class Feature237Fragment : Fragment() {
    private lateinit var viewModel: Feature237ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_237, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature237ViewModel::class.java]
        
        val repository0 = Feature136Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature188Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature155Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature180Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature157Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature185Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature183Repository()
        lifecycleScope.launch {
            repository6.getData()
        }

    }
}
