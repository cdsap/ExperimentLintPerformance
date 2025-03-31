package com.performance.module_4_295

import android.app.Service
import android.content.Intent
import android.os.IBinder
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry
import com.performance.module_3_270.Feature270Worker
import com.performance.module_3_250.Feature250Worker
import com.performance.module_3_252.Feature252Worker
import com.performance.module_3_249.Feature249Worker
import com.performance.module_3_245.Feature245Worker
import com.performance.module_3_266.Feature266Worker
import com.performance.module_3_254.Feature254Worker
import com.performance.module_3_271.Feature271Worker
import com.performance.module_3_264.Feature264Worker
import com.performance.module_3_248.Feature248Worker

class Feature295Service : Service(), LifecycleOwner {
    private val lifecycleRegistry = LifecycleRegistry(this)

    
        private val worker0 = Feature270Worker()
        private val worker1 = Feature250Worker()
        private val worker2 = Feature252Worker()
        private val worker3 = Feature249Worker()
        private val worker4 = Feature245Worker()
        private val worker5 = Feature266Worker()
        private val worker6 = Feature254Worker()
        private val worker7 = Feature271Worker()
        private val worker8 = Feature264Worker()
        private val worker9 = Feature248Worker()


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

class Feature295Worker {
    fun doWork(): String {
        return "Work from Feature 295 Worker"
    }
}
