package com.performance.module_1_181

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_1_181.R
import kotlinx.coroutines.launch
import com.performance.module_0_127.Feature127Repository
import com.performance.module_0_107.Feature107Repository
import com.performance.module_0_4.Feature4Repository
import com.performance.module_0_100.Feature100Repository
import com.performance.module_0_14.Feature14Repository
import com.performance.module_0_77.Feature77Repository
import com.performance.module_0_101.Feature101Repository
import com.performance.module_0_108.Feature108Repository
import com.performance.module_0_99.Feature99Repository

class Feature181Fragment : Fragment() {
    private lateinit var viewModel: Feature181ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_181, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature181ViewModel::class.java]
        
        val repository0 = Feature127Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature107Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature4Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature100Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature14Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature77Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature101Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature108Repository()
        lifecycleScope.launch {
            repository7.getData()
        }
        val repository8 = Feature99Repository()
        lifecycleScope.launch {
            repository8.getData()
        }

    }
}
