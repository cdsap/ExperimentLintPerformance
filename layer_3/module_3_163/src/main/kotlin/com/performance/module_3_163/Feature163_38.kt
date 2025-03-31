package com.performance.module_3_163

class Feature163UseCase2(
    private val repository: Feature163Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
