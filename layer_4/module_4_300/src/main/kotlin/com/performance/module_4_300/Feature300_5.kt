package com.performance.module_4_300

import android.app.Service
import android.content.Intent
import android.os.IBinder
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry
import com.performance.module_3_264.Feature264Worker
import com.performance.module_3_243.Feature243Worker
import com.performance.module_3_269.Feature269Worker
import com.performance.module_3_259.Feature259Worker
import com.performance.module_3_252.Feature252Worker
import com.performance.module_3_263.Feature263Worker
import com.performance.module_3_249.Feature249Worker
import com.performance.module_3_267.Feature267Worker
import com.performance.module_3_268.Feature268Worker
import com.performance.module_3_261.Feature261Worker
import com.performance.module_3_246.Feature246Worker
import com.performance.module_3_254.Feature254Worker
import com.performance.module_3_247.Feature247Worker

class Feature300Service : Service(), LifecycleOwner {
    private val lifecycleRegistry = LifecycleRegistry(this)

    
        private val worker0 = Feature264Worker()
        private val worker1 = Feature243Worker()
        private val worker2 = Feature269Worker()
        private val worker3 = Feature259Worker()
        private val worker4 = Feature252Worker()
        private val worker5 = Feature263Worker()
        private val worker6 = Feature249Worker()
        private val worker7 = Feature267Worker()
        private val worker8 = Feature268Worker()
        private val worker9 = Feature261Worker()
        private val worker10 = Feature246Worker()
        private val worker11 = Feature254Worker()
        private val worker12 = Feature247Worker()


    override fun onBind(intent: Intent?): IBinder? = null

    override fun onCreate() {
        super.onCreate()
        lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_CREATE)
        lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_START)
        startWork()
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_RESUME)
        worker0.doWork()
        worker1.doWork()
        worker2.doWork()
        worker3.doWork()
        worker4.doWork()
        worker5.doWork()
        worker6.doWork()
        worker7.doWork()
        worker8.doWork()
        worker9.doWork()
        worker10.doWork()
        worker11.doWork()
        worker12.doWork()
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {
        lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE)
        lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_STOP)
        lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY)
        super.onDestroy()
    }

    override val lifecycle: Lifecycle
        get() = lifecycleRegistry

    private fun startWork() {
        // Service work implementation
    }
}

class Feature300Worker {
    fun doWork(): String {
        return "Work from Feature 300 Worker"
    }
}
