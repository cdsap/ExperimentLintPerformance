package com.performance.module_3_273

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_3_273.R
import kotlinx.coroutines.launch
import com.performance.module_2_226.Feature226Repository
import com.performance.module_2_231.Feature231Repository
import com.performance.module_2_206.Feature206Repository
import com.performance.module_2_227.Feature227Repository
import com.performance.module_2_202.Feature202Repository
import com.performance.module_2_215.Feature215Repository
import com.performance.module_2_238.Feature238Repository
import com.performance.module_2_232.Feature232Repository
import com.performance.module_2_216.Feature216Repository
import com.performance.module_2_205.Feature205Repository
import com.performance.module_2_242.Feature242Repository
import com.performance.module_2_237.Feature237Repository
import com.performance.module_2_212.Feature212Repository
import com.performance.module_2_213.Feature213Repository

class Feature273Fragment : Fragment() {
    private lateinit var viewModel: Feature273ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_273, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature273ViewModel::class.java]
        
        val repository0 = Feature226Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature231Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature206Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature227Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature202Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature215Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature238Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature232Repository()
        lifecycleScope.launch {
            repository7.getData()
        }
        val repository8 = Feature216Repository()
        lifecycleScope.launch {
            repository8.getData()
        }
        val repository9 = Feature205Repository()
        lifecycleScope.launch {
            repository9.getData()
        }
        val repository10 = Feature242Repository()
        lifecycleScope.launch {
            repository10.getData()
        }
        val repository11 = Feature237Repository()
        lifecycleScope.launch {
            repository11.getData()
        }
        val repository12 = Feature212Repository()
        lifecycleScope.launch {
            repository12.getData()
        }
        val repository13 = Feature213Repository()
        lifecycleScope.launch {
            repository13.getData()
        }

    }
}
