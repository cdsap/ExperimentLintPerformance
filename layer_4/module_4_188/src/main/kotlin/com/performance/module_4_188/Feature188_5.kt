package com.performance.module_4_188

import android.app.Service
import android.content.Intent
import android.os.IBinder
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry
import com.performance.module_3_178.Feature178Worker
import com.performance.module_3_180.Feature180Worker
import com.performance.module_3_163.Feature163Worker
import com.performance.module_3_173.Feature173Worker
import com.performance.module_3_181.Feature181Worker
import com.performance.module_3_182.Feature182Worker
import com.performance.module_3_171.Feature171Worker
import com.performance.module_3_177.Feature177Worker

class Feature188Service : Service(), LifecycleOwner {
    private val lifecycleRegistry = LifecycleRegistry(this)

    
        private val worker0 = Feature178Worker()
        private val worker1 = Feature180Worker()
        private val worker2 = Feature163Worker()
        private val worker3 = Feature173Worker()
        private val worker4 = Feature181Worker()
        private val worker5 = Feature182Worker()
        private val worker6 = Feature171Worker()
        private val worker7 = Feature177Worker()


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

class Feature188Worker {
    fun doWork(): String {
        return "Work from Feature 188 Worker"
    }
}
