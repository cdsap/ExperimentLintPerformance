package com.performance.module_2_150

class Feature150UseCase0(
    private val repository: Feature150Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
