package com.performance.module_0_51

class Feature51UseCase1(
    private val repository: Feature51Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
