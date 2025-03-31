package com.performance.module_4_290

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_4_290.R
import kotlinx.coroutines.launch
import com.performance.module_3_265.Feature265Repository
import com.performance.module_3_260.Feature260Repository
import com.performance.module_3_247.Feature247Repository
import com.performance.module_3_264.Feature264Repository
import com.performance.module_3_255.Feature255Repository
import com.performance.module_3_273.Feature273Repository
import com.performance.module_3_251.Feature251Repository
import com.performance.module_3_246.Feature246Repository
import com.performance.module_3_249.Feature249Repository
import com.performance.module_3_261.Feature261Repository
import com.performance.module_3_274.Feature274Repository
import com.performance.module_3_262.Feature262Repository
import com.performance.module_3_263.Feature263Repository
import com.performance.module_3_257.Feature257Repository

class Feature290Fragment : Fragment() {
    private lateinit var viewModel: Feature290ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_290, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature290ViewModel::class.java]
        
        val repository0 = Feature265Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature260Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature247Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature264Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature255Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature273Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature251Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature246Repository()
        lifecycleScope.launch {
            repository7.getData()
        }
        val repository8 = Feature249Repository()
        lifecycleScope.launch {
            repository8.getData()
        }
        val repository9 = Feature261Repository()
        lifecycleScope.launch {
            repository9.getData()
        }
        val repository10 = Feature274Repository()
        lifecycleScope.launch {
            repository10.getData()
        }
        val repository11 = Feature262Repository()
        lifecycleScope.launch {
            repository11.getData()
        }
        val repository12 = Feature263Repository()
        lifecycleScope.launch {
            repository12.getData()
        }
        val repository13 = Feature257Repository()
        lifecycleScope.launch {
            repository13.getData()
        }

    }
}
