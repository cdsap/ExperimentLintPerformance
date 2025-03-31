package com.performance.module_2_150

class Feature150UseCase1(
    private val repository: Feature150Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
