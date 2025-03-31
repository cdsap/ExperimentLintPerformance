package com.performance.module_3_163

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_3_163.R
import kotlinx.coroutines.launch
import com.performance.module_2_154.Feature154Repository
import com.performance.module_2_158.Feature158Repository
import com.performance.module_2_135.Feature135Repository
import com.performance.module_2_156.Feature156Repository
import com.performance.module_2_162.Feature162Repository
import com.performance.module_2_153.Feature153Repository
import com.performance.module_2_151.Feature151Repository
import com.performance.module_2_140.Feature140Repository
import com.performance.module_2_148.Feature148Repository
import com.performance.module_2_155.Feature155Repository
import com.performance.module_2_145.Feature145Repository
import com.performance.module_2_160.Feature160Repository

class Feature163Fragment : Fragment() {
    private lateinit var viewModel: Feature163ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_163, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature163ViewModel::class.java]
        
        val repository0 = Feature154Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature158Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature135Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature156Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature162Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature153Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature151Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature140Repository()
        lifecycleScope.launch {
            repository7.getData()
        }
        val repository8 = Feature148Repository()
        lifecycleScope.launch {
            repository8.getData()
        }
        val repository9 = Feature155Repository()
        lifecycleScope.launch {
            repository9.getData()
        }
        val repository10 = Feature145Repository()
        lifecycleScope.launch {
            repository10.getData()
        }
        val repository11 = Feature160Repository()
        lifecycleScope.launch {
            repository11.getData()
        }

    }
}
