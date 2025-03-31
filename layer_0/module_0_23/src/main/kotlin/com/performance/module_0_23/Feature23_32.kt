package com.performance.module_0_23

class Feature23UseCase0(
    private val repository: Feature23Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
