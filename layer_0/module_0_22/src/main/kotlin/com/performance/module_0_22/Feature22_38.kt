package com.performance.module_0_22

class Feature22UseCase2(
    private val repository: Feature22Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
