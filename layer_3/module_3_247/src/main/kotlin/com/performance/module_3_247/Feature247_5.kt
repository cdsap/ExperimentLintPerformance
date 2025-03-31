package com.performance.module_3_247

import android.app.Service
import android.content.Intent
import android.os.IBinder
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry
import com.performance.module_2_219.Feature219Worker
import com.performance.module_2_203.Feature203Worker
import com.performance.module_2_201.Feature201Worker
import com.performance.module_2_236.Feature236Worker
import com.performance.module_2_232.Feature232Worker
import com.performance.module_2_199.Feature199Worker
import com.performance.module_2_242.Feature242Worker

class Feature247Service : Service(), LifecycleOwner {
    private val lifecycleRegistry = LifecycleRegistry(this)

    
        private val worker0 = Feature219Worker()
        private val worker1 = Feature203Worker()
        private val worker2 = Feature201Worker()
        private val worker3 = Feature236Worker()
        private val worker4 = Feature232Worker()
        private val worker5 = Feature199Worker()
        private val worker6 = Feature242Worker()


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

class Feature247Worker {
    fun doWork(): String {
        return "Work from Feature 247 Worker"
    }
}
