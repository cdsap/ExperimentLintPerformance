package com.performance.module_4_197

import android.app.Service
import android.content.Intent
import android.os.IBinder
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry
import com.performance.module_3_173.Feature173Worker
import com.performance.module_3_164.Feature164Worker
import com.performance.module_3_165.Feature165Worker
import com.performance.module_3_166.Feature166Worker
import com.performance.module_3_180.Feature180Worker
import com.performance.module_3_167.Feature167Worker
import com.performance.module_3_177.Feature177Worker
import com.performance.module_3_169.Feature169Worker

class Feature197Service : Service(), LifecycleOwner {
    private val lifecycleRegistry = LifecycleRegistry(this)

    
        private val worker0 = Feature173Worker()
        private val worker1 = Feature164Worker()
        private val worker2 = Feature165Worker()
        private val worker3 = Feature166Worker()
        private val worker4 = Feature180Worker()
        private val worker5 = Feature167Worker()
        private val worker6 = Feature177Worker()
        private val worker7 = Feature169Worker()


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

class Feature197Worker {
    fun doWork(): String {
        return "Work from Feature 197 Worker"
    }
}
