package com.performance.module_4_297

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_4_297.R
import kotlinx.coroutines.launch
import com.performance.module_3_261.Feature261Repository
import com.performance.module_3_273.Feature273Repository
import com.performance.module_3_263.Feature263Repository
import com.performance.module_3_266.Feature266Repository
import com.performance.module_3_247.Feature247Repository
import com.performance.module_3_270.Feature270Repository
import com.performance.module_3_264.Feature264Repository
import com.performance.module_3_259.Feature259Repository
import com.performance.module_3_253.Feature253Repository
import com.performance.module_3_251.Feature251Repository
import com.performance.module_3_245.Feature245Repository

class Feature297Fragment : Fragment() {
    private lateinit var viewModel: Feature297ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_297, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature297ViewModel::class.java]
        
        val repository0 = Feature261Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature273Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature263Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature266Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature247Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature270Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature264Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature259Repository()
        lifecycleScope.launch {
            repository7.getData()
        }
        val repository8 = Feature253Repository()
        lifecycleScope.launch {
            repository8.getData()
        }
        val repository9 = Feature251Repository()
        lifecycleScope.launch {
            repository9.getData()
        }
        val repository10 = Feature245Repository()
        lifecycleScope.launch {
            repository10.getData()
        }

    }
}
