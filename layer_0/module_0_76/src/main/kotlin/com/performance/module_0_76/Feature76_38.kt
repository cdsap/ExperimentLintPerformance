package com.performance.module_0_76

class Feature76UseCase2(
    private val repository: Feature76Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
