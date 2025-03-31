package com.performance.module_3_268

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_3_268.R
import kotlinx.coroutines.launch
import com.performance.module_2_241.Feature241Repository
import com.performance.module_2_213.Feature213Repository
import com.performance.module_2_239.Feature239Repository
import com.performance.module_2_233.Feature233Repository
import com.performance.module_2_217.Feature217Repository
import com.performance.module_2_218.Feature218Repository

class Feature268Fragment : Fragment() {
    private lateinit var viewModel: Feature268ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_268, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature268ViewModel::class.java]
        
        val repository0 = Feature241Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature213Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature239Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature233Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature217Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature218Repository()
        lifecycleScope.launch {
            repository5.getData()
        }

    }
}
