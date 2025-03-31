package com.performance.module_0_23

class Feature23UseCase1(
    private val repository: Feature23Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
