package com.performance.module_1_21

import android.app.Service
import android.content.Intent
import android.os.IBinder
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry
import com.performance.module_0_5.Feature5Worker
import com.performance.module_0_12.Feature12Worker
import com.performance.module_0_14.Feature14Worker
import com.performance.module_0_3.Feature3Worker
import com.performance.module_0_7.Feature7Worker
import com.performance.module_0_2.Feature2Worker
import com.performance.module_0_15.Feature15Worker

class Feature21Service : Service(), LifecycleOwner {
    private val lifecycleRegistry = LifecycleRegistry(this)

    
        private val worker0 = Feature5Worker()
        private val worker1 = Feature12Worker()
        private val worker2 = Feature14Worker()
        private val worker3 = Feature3Worker()
        private val worker4 = Feature7Worker()
        private val worker5 = Feature2Worker()
        private val worker6 = Feature15Worker()


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

class Feature21Worker {
    fun doWork(): String {
        return "Work from Feature 21 Worker"
    }
}
