package com.performance.module_3_163

class Feature163UseCase0(
    private val repository: Feature163Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
