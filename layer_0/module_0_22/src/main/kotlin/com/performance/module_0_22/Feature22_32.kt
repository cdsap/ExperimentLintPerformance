package com.performance.module_0_22

class Feature22UseCase0(
    private val repository: Feature22Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
