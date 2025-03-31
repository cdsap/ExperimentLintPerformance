package com.performance.module_3_257

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_3_257.R
import kotlinx.coroutines.launch
import com.performance.module_2_206.Feature206Repository
import com.performance.module_2_213.Feature213Repository
import com.performance.module_2_231.Feature231Repository
import com.performance.module_2_208.Feature208Repository
import com.performance.module_2_238.Feature238Repository
import com.performance.module_2_240.Feature240Repository
import com.performance.module_2_242.Feature242Repository
import com.performance.module_2_210.Feature210Repository

class Feature257Fragment : Fragment() {
    private lateinit var viewModel: Feature257ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_257, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature257ViewModel::class.java]
        
        val repository0 = Feature206Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature213Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature231Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature208Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature238Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature240Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature242Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature210Repository()
        lifecycleScope.launch {
            repository7.getData()
        }

    }
}
