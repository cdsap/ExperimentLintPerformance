package com.performance.module_2_212

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_2_212.R
import kotlinx.coroutines.launch
import com.performance.module_1_176.Feature176Repository
import com.performance.module_1_148.Feature148Repository
import com.performance.module_1_175.Feature175Repository
import com.performance.module_1_180.Feature180Repository
import com.performance.module_1_142.Feature142Repository
import com.performance.module_1_193.Feature193Repository
import com.performance.module_1_158.Feature158Repository
import com.performance.module_1_197.Feature197Repository
import com.performance.module_1_163.Feature163Repository
import com.performance.module_1_195.Feature195Repository
import com.performance.module_1_150.Feature150Repository
import com.performance.module_1_135.Feature135Repository
import com.performance.module_1_190.Feature190Repository
import com.performance.module_1_165.Feature165Repository

class Feature212Fragment : Fragment() {
    private lateinit var viewModel: Feature212ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_212, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature212ViewModel::class.java]
        
        val repository0 = Feature176Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature148Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature175Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature180Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature142Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature193Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature158Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature197Repository()
        lifecycleScope.launch {
            repository7.getData()
        }
        val repository8 = Feature163Repository()
        lifecycleScope.launch {
            repository8.getData()
        }
        val repository9 = Feature195Repository()
        lifecycleScope.launch {
            repository9.getData()
        }
        val repository10 = Feature150Repository()
        lifecycleScope.launch {
            repository10.getData()
        }
        val repository11 = Feature135Repository()
        lifecycleScope.launch {
            repository11.getData()
        }
        val repository12 = Feature190Repository()
        lifecycleScope.launch {
            repository12.getData()
        }
        val repository13 = Feature165Repository()
        lifecycleScope.launch {
            repository13.getData()
        }

    }
}
