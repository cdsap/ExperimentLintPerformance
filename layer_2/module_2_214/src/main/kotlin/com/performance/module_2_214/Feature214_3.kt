package com.performance.module_2_214

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_2_214.R
import kotlinx.coroutines.launch
import com.performance.module_1_197.Feature197Repository
import com.performance.module_1_198.Feature198Repository
import com.performance.module_1_154.Feature154Repository
import com.performance.module_1_187.Feature187Repository
import com.performance.module_1_156.Feature156Repository
import com.performance.module_1_183.Feature183Repository
import com.performance.module_1_142.Feature142Repository
import com.performance.module_1_138.Feature138Repository
import com.performance.module_1_163.Feature163Repository
import com.performance.module_1_167.Feature167Repository
import com.performance.module_1_196.Feature196Repository

class Feature214Fragment : Fragment() {
    private lateinit var viewModel: Feature214ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_214, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature214ViewModel::class.java]
        
        val repository0 = Feature197Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature198Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature154Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature187Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature156Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature183Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature142Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature138Repository()
        lifecycleScope.launch {
            repository7.getData()
        }
        val repository8 = Feature163Repository()
        lifecycleScope.launch {
            repository8.getData()
        }
        val repository9 = Feature167Repository()
        lifecycleScope.launch {
            repository9.getData()
        }
        val repository10 = Feature196Repository()
        lifecycleScope.launch {
            repository10.getData()
        }

    }
}
