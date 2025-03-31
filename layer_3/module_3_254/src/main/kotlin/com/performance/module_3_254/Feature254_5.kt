package com.performance.module_3_254

import android.app.Service
import android.content.Intent
import android.os.IBinder
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry
import com.performance.module_2_203.Feature203Worker
import com.performance.module_2_214.Feature214Worker
import com.performance.module_2_237.Feature237Worker
import com.performance.module_2_232.Feature232Worker
import com.performance.module_2_200.Feature200Worker
import com.performance.module_2_211.Feature211Worker
import com.performance.module_2_223.Feature223Worker

class Feature254Service : Service(), LifecycleOwner {
    private val lifecycleRegistry = LifecycleRegistry(this)

    
        private val worker0 = Feature203Worker()
        private val worker1 = Feature214Worker()
        private val worker2 = Feature237Worker()
        private val worker3 = Feature232Worker()
        private val worker4 = Feature200Worker()
        private val worker5 = Feature211Worker()
        private val worker6 = Feature223Worker()


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

class Feature254Worker {
    fun doWork(): String {
        return "Work from Feature 254 Worker"
    }
}
