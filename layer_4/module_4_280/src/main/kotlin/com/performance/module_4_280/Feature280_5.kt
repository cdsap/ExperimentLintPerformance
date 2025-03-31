package com.performance.module_4_280

import android.app.Service
import android.content.Intent
import android.os.IBinder
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry
import com.performance.module_3_271.Feature271Worker
import com.performance.module_3_262.Feature262Worker
import com.performance.module_3_268.Feature268Worker
import com.performance.module_3_244.Feature244Worker
import com.performance.module_3_243.Feature243Worker
import com.performance.module_3_247.Feature247Worker
import com.performance.module_3_264.Feature264Worker
import com.performance.module_3_252.Feature252Worker

class Feature280Service : Service(), LifecycleOwner {
    private val lifecycleRegistry = LifecycleRegistry(this)

    
        private val worker0 = Feature271Worker()
        private val worker1 = Feature262Worker()
        private val worker2 = Feature268Worker()
        private val worker3 = Feature244Worker()
        private val worker4 = Feature243Worker()
        private val worker5 = Feature247Worker()
        private val worker6 = Feature264Worker()
        private val worker7 = Feature252Worker()


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

class Feature280Worker {
    fun doWork(): String {
        return "Work from Feature 280 Worker"
    }
}
