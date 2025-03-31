package com.performance.module_3_167

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_3_167.R
import kotlinx.coroutines.launch
import com.performance.module_2_143.Feature143Repository
import com.performance.module_2_133.Feature133Repository
import com.performance.module_2_140.Feature140Repository
import com.performance.module_2_149.Feature149Repository
import com.performance.module_2_147.Feature147Repository

class Feature167Fragment : Fragment() {
    private lateinit var viewModel: Feature167ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_167, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature167ViewModel::class.java]
        
        val repository0 = Feature143Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature133Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature140Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature149Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature147Repository()
        lifecycleScope.launch {
            repository4.getData()
        }

    }
}
