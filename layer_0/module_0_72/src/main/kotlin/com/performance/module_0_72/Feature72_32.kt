package com.performance.module_0_72

class Feature72UseCase0(
    private val repository: Feature72Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
