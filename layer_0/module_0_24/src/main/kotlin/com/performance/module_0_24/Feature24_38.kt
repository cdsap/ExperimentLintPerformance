package com.performance.module_0_24

class Feature24UseCase2(
    private val repository: Feature24Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
