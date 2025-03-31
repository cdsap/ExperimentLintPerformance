package com.performance.module_4_199

class Feature199UseCase2(
    private val repository: Feature199Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
