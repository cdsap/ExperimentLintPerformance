package com.performance.module_4_288

import android.app.Service
import android.content.Intent
import android.os.IBinder
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry
import com.performance.module_3_272.Feature272Worker
import com.performance.module_3_246.Feature246Worker
import com.performance.module_3_244.Feature244Worker
import com.performance.module_3_248.Feature248Worker
import com.performance.module_3_267.Feature267Worker
import com.performance.module_3_265.Feature265Worker
import com.performance.module_3_258.Feature258Worker
import com.performance.module_3_264.Feature264Worker
import com.performance.module_3_266.Feature266Worker

class Feature288Service : Service(), LifecycleOwner {
    private val lifecycleRegistry = LifecycleRegistry(this)

    
        private val worker0 = Feature272Worker()
        private val worker1 = Feature246Worker()
        private val worker2 = Feature244Worker()
        private val worker3 = Feature248Worker()
        private val worker4 = Feature267Worker()
        private val worker5 = Feature265Worker()
        private val worker6 = Feature258Worker()
        private val worker7 = Feature264Worker()
        private val worker8 = Feature266Worker()


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

class Feature288Worker {
    fun doWork(): String {
        return "Work from Feature 288 Worker"
    }
}
