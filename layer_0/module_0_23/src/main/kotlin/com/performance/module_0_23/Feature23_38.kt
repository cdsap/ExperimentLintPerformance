package com.performance.module_0_23

class Feature23UseCase2(
    private val repository: Feature23Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
