package com.performance.module_2_153

import android.app.Service
import android.content.Intent
import android.os.IBinder
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry
import com.performance.module_1_110.Feature110Worker
import com.performance.module_1_132.Feature132Worker
import com.performance.module_1_99.Feature99Worker
import com.performance.module_1_126.Feature126Worker
import com.performance.module_1_109.Feature109Worker
import com.performance.module_1_89.Feature89Worker
import com.performance.module_1_95.Feature95Worker
import com.performance.module_1_115.Feature115Worker
import com.performance.module_1_121.Feature121Worker
import com.performance.module_1_122.Feature122Worker

class Feature153Service : Service(), LifecycleOwner {
    private val lifecycleRegistry = LifecycleRegistry(this)

    
        private val worker0 = Feature110Worker()
        private val worker1 = Feature132Worker()
        private val worker2 = Feature99Worker()
        private val worker3 = Feature126Worker()
        private val worker4 = Feature109Worker()
        private val worker5 = Feature89Worker()
        private val worker6 = Feature95Worker()
        private val worker7 = Feature115Worker()
        private val worker8 = Feature121Worker()
        private val worker9 = Feature122Worker()


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

class Feature153Worker {
    fun doWork(): String {
        return "Work from Feature 153 Worker"
    }
}
