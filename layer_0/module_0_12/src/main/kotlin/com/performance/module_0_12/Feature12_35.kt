package com.performance.module_0_12

class Feature12UseCase1(
    private val repository: Feature12Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
