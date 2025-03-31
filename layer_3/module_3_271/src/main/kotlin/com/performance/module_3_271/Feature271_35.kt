package com.performance.module_3_271

class Feature271UseCase1(
    private val repository: Feature271Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
