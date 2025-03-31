package com.performance.module_0_24

class Feature24UseCase1(
    private val repository: Feature24Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
