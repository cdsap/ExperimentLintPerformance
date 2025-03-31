package com.performance.module_0_5

class Feature5UseCase0(
    private val repository: Feature5Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
