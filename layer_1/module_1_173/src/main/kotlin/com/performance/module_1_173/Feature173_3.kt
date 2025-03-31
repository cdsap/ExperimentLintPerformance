package com.performance.module_1_173

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_1_173.R
import kotlinx.coroutines.launch
import com.performance.module_0_112.Feature112Repository
import com.performance.module_0_124.Feature124Repository
import com.performance.module_0_107.Feature107Repository
import com.performance.module_0_42.Feature42Repository
import com.performance.module_0_95.Feature95Repository
import com.performance.module_0_78.Feature78Repository

class Feature173Fragment : Fragment() {
    private lateinit var viewModel: Feature173ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_173, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature173ViewModel::class.java]
        
        val repository0 = Feature112Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature124Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature107Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature42Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature95Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature78Repository()
        lifecycleScope.launch {
            repository5.getData()
        }

    }
}
