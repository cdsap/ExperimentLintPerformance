package com.performance.module_0_24

class Feature24UseCase0(
    private val repository: Feature24Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
