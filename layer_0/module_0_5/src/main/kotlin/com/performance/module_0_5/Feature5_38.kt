package com.performance.module_0_5

class Feature5UseCase2(
    private val repository: Feature5Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
