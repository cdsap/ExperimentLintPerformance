package com.performance.module_3_163

class Feature163UseCase1(
    private val repository: Feature163Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
