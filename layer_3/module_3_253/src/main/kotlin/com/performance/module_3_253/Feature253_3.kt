package com.performance.module_3_253

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_3_253.R
import kotlinx.coroutines.launch
import com.performance.module_2_222.Feature222Repository
import com.performance.module_2_236.Feature236Repository
import com.performance.module_2_218.Feature218Repository
import com.performance.module_2_238.Feature238Repository
import com.performance.module_2_231.Feature231Repository
import com.performance.module_2_201.Feature201Repository
import com.performance.module_2_220.Feature220Repository
import com.performance.module_2_210.Feature210Repository
import com.performance.module_2_217.Feature217Repository
import com.performance.module_2_219.Feature219Repository
import com.performance.module_2_240.Feature240Repository
import com.performance.module_2_223.Feature223Repository
import com.performance.module_2_204.Feature204Repository

class Feature253Fragment : Fragment() {
    private lateinit var viewModel: Feature253ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_253, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature253ViewModel::class.java]
        
        val repository0 = Feature222Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature236Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature218Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature238Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature231Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature201Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature220Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature210Repository()
        lifecycleScope.launch {
            repository7.getData()
        }
        val repository8 = Feature217Repository()
        lifecycleScope.launch {
            repository8.getData()
        }
        val repository9 = Feature219Repository()
        lifecycleScope.launch {
            repository9.getData()
        }
        val repository10 = Feature240Repository()
        lifecycleScope.launch {
            repository10.getData()
        }
        val repository11 = Feature223Repository()
        lifecycleScope.launch {
            repository11.getData()
        }
        val repository12 = Feature204Repository()
        lifecycleScope.launch {
            repository12.getData()
        }

    }
}
