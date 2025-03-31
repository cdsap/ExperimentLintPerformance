package com.performance.module_0_12

class Feature12UseCase2(
    private val repository: Feature12Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
