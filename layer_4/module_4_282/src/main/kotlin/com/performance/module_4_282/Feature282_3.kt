package com.performance.module_4_282

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_4_282.R
import kotlinx.coroutines.launch
import com.performance.module_3_254.Feature254Repository
import com.performance.module_3_244.Feature244Repository
import com.performance.module_3_264.Feature264Repository
import com.performance.module_3_263.Feature263Repository
import com.performance.module_3_268.Feature268Repository
import com.performance.module_3_261.Feature261Repository
import com.performance.module_3_246.Feature246Repository
import com.performance.module_3_243.Feature243Repository
import com.performance.module_3_266.Feature266Repository
import com.performance.module_3_245.Feature245Repository
import com.performance.module_3_269.Feature269Repository
import com.performance.module_3_251.Feature251Repository

class Feature282Fragment : Fragment() {
    private lateinit var viewModel: Feature282ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_282, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature282ViewModel::class.java]
        
        val repository0 = Feature254Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature244Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature264Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature263Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature268Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature261Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature246Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature243Repository()
        lifecycleScope.launch {
            repository7.getData()
        }
        val repository8 = Feature266Repository()
        lifecycleScope.launch {
            repository8.getData()
        }
        val repository9 = Feature245Repository()
        lifecycleScope.launch {
            repository9.getData()
        }
        val repository10 = Feature269Repository()
        lifecycleScope.launch {
            repository10.getData()
        }
        val repository11 = Feature251Repository()
        lifecycleScope.launch {
            repository11.getData()
        }

    }
}
