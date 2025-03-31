package com.performance.module_4_287

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_4_287.R
import kotlinx.coroutines.launch
import com.performance.module_3_260.Feature260Repository
import com.performance.module_3_243.Feature243Repository
import com.performance.module_3_254.Feature254Repository
import com.performance.module_3_258.Feature258Repository
import com.performance.module_3_259.Feature259Repository
import com.performance.module_3_269.Feature269Repository
import com.performance.module_3_266.Feature266Repository
import com.performance.module_3_248.Feature248Repository
import com.performance.module_3_262.Feature262Repository
import com.performance.module_3_255.Feature255Repository
import com.performance.module_3_245.Feature245Repository
import com.performance.module_3_251.Feature251Repository
import com.performance.module_3_273.Feature273Repository
import com.performance.module_3_247.Feature247Repository

class Feature287Fragment : Fragment() {
    private lateinit var viewModel: Feature287ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_287, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature287ViewModel::class.java]
        
        val repository0 = Feature260Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature243Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature254Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature258Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature259Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature269Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature266Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature248Repository()
        lifecycleScope.launch {
            repository7.getData()
        }
        val repository8 = Feature262Repository()
        lifecycleScope.launch {
            repository8.getData()
        }
        val repository9 = Feature255Repository()
        lifecycleScope.launch {
            repository9.getData()
        }
        val repository10 = Feature245Repository()
        lifecycleScope.launch {
            repository10.getData()
        }
        val repository11 = Feature251Repository()
        lifecycleScope.launch {
            repository11.getData()
        }
        val repository12 = Feature273Repository()
        lifecycleScope.launch {
            repository12.getData()
        }
        val repository13 = Feature247Repository()
        lifecycleScope.launch {
            repository13.getData()
        }

    }
}
