package com.performance.module_1_22

class Feature22UseCase0(
    private val repository: Feature22Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
