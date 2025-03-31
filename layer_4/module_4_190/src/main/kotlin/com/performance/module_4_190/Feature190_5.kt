package com.performance.module_4_190

import android.app.Service
import android.content.Intent
import android.os.IBinder
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry
import com.performance.module_3_174.Feature174Worker
import com.performance.module_3_171.Feature171Worker
import com.performance.module_3_175.Feature175Worker
import com.performance.module_3_177.Feature177Worker
import com.performance.module_3_179.Feature179Worker
import com.performance.module_3_166.Feature166Worker
import com.performance.module_3_164.Feature164Worker
import com.performance.module_3_169.Feature169Worker
import com.performance.module_3_176.Feature176Worker

class Feature190Service : Service(), LifecycleOwner {
    private val lifecycleRegistry = LifecycleRegistry(this)

    
        private val worker0 = Feature174Worker()
        private val worker1 = Feature171Worker()
        private val worker2 = Feature175Worker()
        private val worker3 = Feature177Worker()
        private val worker4 = Feature179Worker()
        private val worker5 = Feature166Worker()
        private val worker6 = Feature164Worker()
        private val worker7 = Feature169Worker()
        private val worker8 = Feature176Worker()


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

class Feature190Worker {
    fun doWork(): String {
        return "Work from Feature 190 Worker"
    }
}
