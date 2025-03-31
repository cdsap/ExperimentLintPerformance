package com.performance.module_1_117

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_1_117.R
import kotlinx.coroutines.launch
import com.performance.module_0_56.Feature56Repository
import com.performance.module_0_61.Feature61Repository
import com.performance.module_0_57.Feature57Repository
import com.performance.module_0_63.Feature63Repository
import com.performance.module_0_8.Feature8Repository
import com.performance.module_0_6.Feature6Repository
import com.performance.module_0_10.Feature10Repository
import com.performance.module_0_18.Feature18Repository
import com.performance.module_0_78.Feature78Repository
import com.performance.module_0_85.Feature85Repository
import com.performance.module_0_53.Feature53Repository
import com.performance.module_0_81.Feature81Repository
import com.performance.module_0_88.Feature88Repository

class Feature117Fragment : Fragment() {
    private lateinit var viewModel: Feature117ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_117, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature117ViewModel::class.java]
        
        val repository0 = Feature56Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature61Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature57Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature63Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature8Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature6Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature10Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature18Repository()
        lifecycleScope.launch {
            repository7.getData()
        }
        val repository8 = Feature78Repository()
        lifecycleScope.launch {
            repository8.getData()
        }
        val repository9 = Feature85Repository()
        lifecycleScope.launch {
            repository9.getData()
        }
        val repository10 = Feature53Repository()
        lifecycleScope.launch {
            repository10.getData()
        }
        val repository11 = Feature81Repository()
        lifecycleScope.launch {
            repository11.getData()
        }
        val repository12 = Feature88Repository()
        lifecycleScope.launch {
            repository12.getData()
        }

    }
}
