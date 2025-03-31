package com.performance.module_4_195

class Feature195UseCase0(
    private val repository: Feature195Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
