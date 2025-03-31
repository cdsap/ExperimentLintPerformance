package com.performance.module_2_199

class Feature199UseCase0(
    private val repository: Feature199Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
