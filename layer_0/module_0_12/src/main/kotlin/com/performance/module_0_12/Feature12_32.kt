package com.performance.module_0_12

class Feature12UseCase0(
    private val repository: Feature12Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
