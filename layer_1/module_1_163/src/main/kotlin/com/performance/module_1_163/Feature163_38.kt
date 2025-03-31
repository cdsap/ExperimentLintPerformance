package com.performance.module_1_163

class Feature163UseCase2(
    private val repository: Feature163Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
