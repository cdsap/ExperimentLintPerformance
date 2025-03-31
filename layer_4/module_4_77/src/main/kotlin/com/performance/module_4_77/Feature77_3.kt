package com.performance.module_4_77

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_4_77.R
import kotlinx.coroutines.launch
import com.performance.module_3_65.Feature65Repository
import com.performance.module_3_50.Feature50Repository
import com.performance.module_3_61.Feature61Repository
import com.performance.module_3_72.Feature72Repository
import com.performance.module_3_49.Feature49Repository

class Feature77Fragment : Fragment() {
    private lateinit var viewModel: Feature77ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_77, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature77ViewModel::class.java]
        
        val repository0 = Feature65Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature50Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature61Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature72Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature49Repository()
        lifecycleScope.launch {
            repository4.getData()
        }

    }
}
