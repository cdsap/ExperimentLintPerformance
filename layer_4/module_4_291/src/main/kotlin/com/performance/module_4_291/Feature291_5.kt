package com.performance.module_4_291

import android.app.Service
import android.content.Intent
import android.os.IBinder
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry
import com.performance.module_3_253.Feature253Worker
import com.performance.module_3_269.Feature269Worker
import com.performance.module_3_271.Feature271Worker
import com.performance.module_3_250.Feature250Worker
import com.performance.module_3_258.Feature258Worker
import com.performance.module_3_254.Feature254Worker
import com.performance.module_3_266.Feature266Worker
import com.performance.module_3_259.Feature259Worker

class Feature291Service : Service(), LifecycleOwner {
    private val lifecycleRegistry = LifecycleRegistry(this)

    
        private val worker0 = Feature253Worker()
        private val worker1 = Feature269Worker()
        private val worker2 = Feature271Worker()
        private val worker3 = Feature250Worker()
        private val worker4 = Feature258Worker()
        private val worker5 = Feature254Worker()
        private val worker6 = Feature266Worker()
        private val worker7 = Feature259Worker()


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

class Feature291Worker {
    fun doWork(): String {
        return "Work from Feature 291 Worker"
    }
}
