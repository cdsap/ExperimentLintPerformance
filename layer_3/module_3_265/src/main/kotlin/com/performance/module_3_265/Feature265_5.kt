package com.performance.module_3_265

import android.app.Service
import android.content.Intent
import android.os.IBinder
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry
import com.performance.module_2_210.Feature210Worker
import com.performance.module_2_207.Feature207Worker
import com.performance.module_2_221.Feature221Worker
import com.performance.module_2_217.Feature217Worker
import com.performance.module_2_219.Feature219Worker
import com.performance.module_2_215.Feature215Worker
import com.performance.module_2_212.Feature212Worker
import com.performance.module_2_234.Feature234Worker
import com.performance.module_2_205.Feature205Worker

class Feature265Service : Service(), LifecycleOwner {
    private val lifecycleRegistry = LifecycleRegistry(this)

    
        private val worker0 = Feature210Worker()
        private val worker1 = Feature207Worker()
        private val worker2 = Feature221Worker()
        private val worker3 = Feature217Worker()
        private val worker4 = Feature219Worker()
        private val worker5 = Feature215Worker()
        private val worker6 = Feature212Worker()
        private val worker7 = Feature234Worker()
        private val worker8 = Feature205Worker()


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

class Feature265Worker {
    fun doWork(): String {
        return "Work from Feature 265 Worker"
    }
}
