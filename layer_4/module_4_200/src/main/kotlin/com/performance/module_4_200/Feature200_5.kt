package com.performance.module_4_200

import android.app.Service
import android.content.Intent
import android.os.IBinder
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry
import com.performance.module_3_172.Feature172Worker
import com.performance.module_3_164.Feature164Worker
import com.performance.module_3_173.Feature173Worker
import com.performance.module_3_177.Feature177Worker
import com.performance.module_3_176.Feature176Worker
import com.performance.module_3_167.Feature167Worker
import com.performance.module_3_168.Feature168Worker
import com.performance.module_3_171.Feature171Worker
import com.performance.module_3_170.Feature170Worker
import com.performance.module_3_174.Feature174Worker

class Feature200Service : Service(), LifecycleOwner {
    private val lifecycleRegistry = LifecycleRegistry(this)

    
        private val worker0 = Feature172Worker()
        private val worker1 = Feature164Worker()
        private val worker2 = Feature173Worker()
        private val worker3 = Feature177Worker()
        private val worker4 = Feature176Worker()
        private val worker5 = Feature167Worker()
        private val worker6 = Feature168Worker()
        private val worker7 = Feature171Worker()
        private val worker8 = Feature170Worker()
        private val worker9 = Feature174Worker()


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
        worker9.doWork()
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

class Feature200Worker {
    fun doWork(): String {
        return "Work from Feature 200 Worker"
    }
}
