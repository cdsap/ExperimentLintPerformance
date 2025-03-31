package com.performance.module_2_138

import android.app.Service
import android.content.Intent
import android.os.IBinder
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry
import com.performance.module_1_111.Feature111Worker
import com.performance.module_1_93.Feature93Worker
import com.performance.module_1_116.Feature116Worker
import com.performance.module_1_124.Feature124Worker
import com.performance.module_1_90.Feature90Worker
import com.performance.module_1_128.Feature128Worker
import com.performance.module_1_132.Feature132Worker
import com.performance.module_1_114.Feature114Worker
import com.performance.module_1_120.Feature120Worker

class Feature138Service : Service(), LifecycleOwner {
    private val lifecycleRegistry = LifecycleRegistry(this)

    
        private val worker0 = Feature111Worker()
        private val worker1 = Feature93Worker()
        private val worker2 = Feature116Worker()
        private val worker3 = Feature124Worker()
        private val worker4 = Feature90Worker()
        private val worker5 = Feature128Worker()
        private val worker6 = Feature132Worker()
        private val worker7 = Feature114Worker()
        private val worker8 = Feature120Worker()


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

class Feature138Worker {
    fun doWork(): String {
        return "Work from Feature 138 Worker"
    }
}
