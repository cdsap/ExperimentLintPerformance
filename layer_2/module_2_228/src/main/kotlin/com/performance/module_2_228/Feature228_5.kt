package com.performance.module_2_228

import android.app.Service
import android.content.Intent
import android.os.IBinder
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry
import com.performance.module_1_144.Feature144Worker
import com.performance.module_1_137.Feature137Worker
import com.performance.module_1_138.Feature138Worker
import com.performance.module_1_183.Feature183Worker
import com.performance.module_1_165.Feature165Worker
import com.performance.module_1_196.Feature196Worker
import com.performance.module_1_175.Feature175Worker
import com.performance.module_1_136.Feature136Worker
import com.performance.module_1_162.Feature162Worker

class Feature228Service : Service(), LifecycleOwner {
    private val lifecycleRegistry = LifecycleRegistry(this)

    
        private val worker0 = Feature144Worker()
        private val worker1 = Feature137Worker()
        private val worker2 = Feature138Worker()
        private val worker3 = Feature183Worker()
        private val worker4 = Feature165Worker()
        private val worker5 = Feature196Worker()
        private val worker6 = Feature175Worker()
        private val worker7 = Feature136Worker()
        private val worker8 = Feature162Worker()


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

class Feature228Worker {
    fun doWork(): String {
        return "Work from Feature 228 Worker"
    }
}
