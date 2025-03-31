package com.performance.module_1_146

import android.app.Service
import android.content.Intent
import android.os.IBinder
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry
import com.performance.module_0_81.Feature81Worker
import com.performance.module_0_90.Feature90Worker
import com.performance.module_0_103.Feature103Worker
import com.performance.module_0_125.Feature125Worker
import com.performance.module_0_91.Feature91Worker
import com.performance.module_0_24.Feature24Worker
import com.performance.module_0_88.Feature88Worker

class Feature146Service : Service(), LifecycleOwner {
    private val lifecycleRegistry = LifecycleRegistry(this)

    
        private val worker0 = Feature81Worker()
        private val worker1 = Feature90Worker()
        private val worker2 = Feature103Worker()
        private val worker3 = Feature125Worker()
        private val worker4 = Feature91Worker()
        private val worker5 = Feature24Worker()
        private val worker6 = Feature88Worker()


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

class Feature146Worker {
    fun doWork(): String {
        return "Work from Feature 146 Worker"
    }
}
