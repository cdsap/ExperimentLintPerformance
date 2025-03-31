package com.performance.module_1_163

class Feature163UseCase1(
    private val repository: Feature163Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
