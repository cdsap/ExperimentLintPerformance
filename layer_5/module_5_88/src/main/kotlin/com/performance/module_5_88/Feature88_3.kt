package com.performance.module_5_88

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_5_88.R
import kotlinx.coroutines.launch
import com.performance.module_4_76.Feature76Repository
import com.performance.module_4_78.Feature78Repository
import com.performance.module_4_81.Feature81Repository
import com.performance.module_4_85.Feature85Repository
import com.performance.module_4_82.Feature82Repository
import com.performance.module_4_83.Feature83Repository

class Feature88Fragment : Fragment() {
    private lateinit var viewModel: Feature88ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_88, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature88ViewModel::class.java]
        
        val repository0 = Feature76Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature78Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature81Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature85Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature82Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature83Repository()
        lifecycleScope.launch {
            repository5.getData()
        }

    }
}
