package com.performance.module_0_44

class Feature44UseCase2(
    private val repository: Feature44Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
