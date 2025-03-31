package com.performance.module_2_204

import android.app.Service
import android.content.Intent
import android.os.IBinder
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry
import com.performance.module_1_147.Feature147Worker
import com.performance.module_1_187.Feature187Worker
import com.performance.module_1_154.Feature154Worker
import com.performance.module_1_178.Feature178Worker
import com.performance.module_1_143.Feature143Worker
import com.performance.module_1_163.Feature163Worker
import com.performance.module_1_173.Feature173Worker
import com.performance.module_1_196.Feature196Worker
import com.performance.module_1_138.Feature138Worker
import com.performance.module_1_134.Feature134Worker

class Feature204Service : Service(), LifecycleOwner {
    private val lifecycleRegistry = LifecycleRegistry(this)

    
        private val worker0 = Feature147Worker()
        private val worker1 = Feature187Worker()
        private val worker2 = Feature154Worker()
        private val worker3 = Feature178Worker()
        private val worker4 = Feature143Worker()
        private val worker5 = Feature163Worker()
        private val worker6 = Feature173Worker()
        private val worker7 = Feature196Worker()
        private val worker8 = Feature138Worker()
        private val worker9 = Feature134Worker()


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

class Feature204Worker {
    fun doWork(): String {
        return "Work from Feature 204 Worker"
    }
}
