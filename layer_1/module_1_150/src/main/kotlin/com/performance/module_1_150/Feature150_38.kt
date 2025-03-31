package com.performance.module_1_150

class Feature150UseCase2(
    private val repository: Feature150Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
