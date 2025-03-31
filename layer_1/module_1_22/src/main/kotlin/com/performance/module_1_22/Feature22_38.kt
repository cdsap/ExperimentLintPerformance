package com.performance.module_1_22

class Feature22UseCase2(
    private val repository: Feature22Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
