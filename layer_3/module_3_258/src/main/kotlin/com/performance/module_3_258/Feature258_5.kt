package com.performance.module_3_258

import android.app.Service
import android.content.Intent
import android.os.IBinder
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry
import com.performance.module_2_238.Feature238Worker
import com.performance.module_2_202.Feature202Worker
import com.performance.module_2_226.Feature226Worker
import com.performance.module_2_232.Feature232Worker
import com.performance.module_2_227.Feature227Worker
import com.performance.module_2_204.Feature204Worker
import com.performance.module_2_222.Feature222Worker
import com.performance.module_2_219.Feature219Worker
import com.performance.module_2_225.Feature225Worker

class Feature258Service : Service(), LifecycleOwner {
    private val lifecycleRegistry = LifecycleRegistry(this)

    
        private val worker0 = Feature238Worker()
        private val worker1 = Feature202Worker()
        private val worker2 = Feature226Worker()
        private val worker3 = Feature232Worker()
        private val worker4 = Feature227Worker()
        private val worker5 = Feature204Worker()
        private val worker6 = Feature222Worker()
        private val worker7 = Feature219Worker()
        private val worker8 = Feature225Worker()


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

class Feature258Worker {
    fun doWork(): String {
        return "Work from Feature 258 Worker"
    }
}
