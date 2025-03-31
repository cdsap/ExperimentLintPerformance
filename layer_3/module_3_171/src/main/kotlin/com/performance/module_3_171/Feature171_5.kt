package com.performance.module_3_171

import android.app.Service
import android.content.Intent
import android.os.IBinder
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry
import com.performance.module_2_140.Feature140Worker
import com.performance.module_2_145.Feature145Worker
import com.performance.module_2_156.Feature156Worker
import com.performance.module_2_148.Feature148Worker
import com.performance.module_2_151.Feature151Worker
import com.performance.module_2_160.Feature160Worker
import com.performance.module_2_143.Feature143Worker

class Feature171Service : Service(), LifecycleOwner {
    private val lifecycleRegistry = LifecycleRegistry(this)

    
        private val worker0 = Feature140Worker()
        private val worker1 = Feature145Worker()
        private val worker2 = Feature156Worker()
        private val worker3 = Feature148Worker()
        private val worker4 = Feature151Worker()
        private val worker5 = Feature160Worker()
        private val worker6 = Feature143Worker()


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

class Feature171Worker {
    fun doWork(): String {
        return "Work from Feature 171 Worker"
    }
}
