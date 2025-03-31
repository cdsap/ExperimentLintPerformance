package com.performance.module_0_27

class Feature27UseCase1(
    private val repository: Feature27Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
