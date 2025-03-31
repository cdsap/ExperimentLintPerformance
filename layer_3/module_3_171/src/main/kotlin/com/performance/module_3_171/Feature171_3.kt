package com.performance.module_3_171

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_3_171.R
import kotlinx.coroutines.launch
import com.performance.module_2_140.Feature140Repository
import com.performance.module_2_153.Feature153Repository
import com.performance.module_2_143.Feature143Repository
import com.performance.module_2_158.Feature158Repository
import com.performance.module_2_148.Feature148Repository
import com.performance.module_2_154.Feature154Repository
import com.performance.module_2_151.Feature151Repository

class Feature171Fragment : Fragment() {
    private lateinit var viewModel: Feature171ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_171, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature171ViewModel::class.java]
        
        val repository0 = Feature140Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature153Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature143Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature158Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature148Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature154Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature151Repository()
        lifecycleScope.launch {
            repository6.getData()
        }

    }
}
