package com.performance.module_2_226

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_2_226.R
import kotlinx.coroutines.launch
import com.performance.module_1_159.Feature159Repository
import com.performance.module_1_184.Feature184Repository
import com.performance.module_1_162.Feature162Repository
import com.performance.module_1_188.Feature188Repository
import com.performance.module_1_134.Feature134Repository
import com.performance.module_1_144.Feature144Repository

class Feature226Fragment : Fragment() {
    private lateinit var viewModel: Feature226ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_226, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature226ViewModel::class.java]
        
        val repository0 = Feature159Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature184Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature162Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature188Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature134Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature144Repository()
        lifecycleScope.launch {
            repository5.getData()
        }

    }
}
