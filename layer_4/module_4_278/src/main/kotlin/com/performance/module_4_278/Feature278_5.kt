package com.performance.module_4_278

import android.app.Service
import android.content.Intent
import android.os.IBinder
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry
import com.performance.module_3_257.Feature257Worker
import com.performance.module_3_259.Feature259Worker
import com.performance.module_3_251.Feature251Worker
import com.performance.module_3_262.Feature262Worker
import com.performance.module_3_254.Feature254Worker
import com.performance.module_3_270.Feature270Worker
import com.performance.module_3_271.Feature271Worker
import com.performance.module_3_263.Feature263Worker
import com.performance.module_3_244.Feature244Worker
import com.performance.module_3_249.Feature249Worker
import com.performance.module_3_272.Feature272Worker

class Feature278Service : Service(), LifecycleOwner {
    private val lifecycleRegistry = LifecycleRegistry(this)

    
        private val worker0 = Feature257Worker()
        private val worker1 = Feature259Worker()
        private val worker2 = Feature251Worker()
        private val worker3 = Feature262Worker()
        private val worker4 = Feature254Worker()
        private val worker5 = Feature270Worker()
        private val worker6 = Feature271Worker()
        private val worker7 = Feature263Worker()
        private val worker8 = Feature244Worker()
        private val worker9 = Feature249Worker()
        private val worker10 = Feature272Worker()


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
        worker10.doWork()
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

class Feature278Worker {
    fun doWork(): String {
        return "Work from Feature 278 Worker"
    }
}
