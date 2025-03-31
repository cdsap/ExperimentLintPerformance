package com.performance.module_3_261

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_3_261.R
import kotlinx.coroutines.launch
import com.performance.module_2_222.Feature222Repository
import com.performance.module_2_227.Feature227Repository
import com.performance.module_2_210.Feature210Repository

class Feature261Fragment : Fragment() {
    private lateinit var viewModel: Feature261ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_261, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature261ViewModel::class.java]
        
        val repository0 = Feature222Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature227Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature210Repository()
        lifecycleScope.launch {
            repository2.getData()
        }

    }
}
