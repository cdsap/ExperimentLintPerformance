package com.performance.module_3_249

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_3_249.R
import kotlinx.coroutines.launch
import com.performance.module_2_215.Feature215Repository
import com.performance.module_2_237.Feature237Repository

class Feature249Fragment : Fragment() {
    private lateinit var viewModel: Feature249ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_249, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature249ViewModel::class.java]
        
        val repository0 = Feature215Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature237Repository()
        lifecycleScope.launch {
            repository1.getData()
        }

    }
}
