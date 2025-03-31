package com.performance.module_1_150

class Feature150UseCase1(
    private val repository: Feature150Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
