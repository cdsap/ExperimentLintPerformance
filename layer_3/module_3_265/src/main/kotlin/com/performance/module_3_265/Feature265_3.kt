package com.performance.module_3_265

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_3_265.R
import kotlinx.coroutines.launch
import com.performance.module_2_215.Feature215Repository
import com.performance.module_2_207.Feature207Repository
import com.performance.module_2_224.Feature224Repository
import com.performance.module_2_210.Feature210Repository
import com.performance.module_2_234.Feature234Repository
import com.performance.module_2_205.Feature205Repository
import com.performance.module_2_227.Feature227Repository
import com.performance.module_2_225.Feature225Repository
import com.performance.module_2_238.Feature238Repository

class Feature265Fragment : Fragment() {
    private lateinit var viewModel: Feature265ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_265, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature265ViewModel::class.java]
        
        val repository0 = Feature215Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature207Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature224Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature210Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature234Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature205Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature227Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature225Repository()
        lifecycleScope.launch {
            repository7.getData()
        }
        val repository8 = Feature238Repository()
        lifecycleScope.launch {
            repository8.getData()
        }

    }
}
