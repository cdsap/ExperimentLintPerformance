package com.performance.module_3_180

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_3_180.R
import kotlinx.coroutines.launch
import com.performance.module_2_149.Feature149Repository
import com.performance.module_2_137.Feature137Repository
import com.performance.module_2_144.Feature144Repository

class Feature180Fragment : Fragment() {
    private lateinit var viewModel: Feature180ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_180, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature180ViewModel::class.java]
        
        val repository0 = Feature149Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature137Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature144Repository()
        lifecycleScope.launch {
            repository2.getData()
        }

    }
}
