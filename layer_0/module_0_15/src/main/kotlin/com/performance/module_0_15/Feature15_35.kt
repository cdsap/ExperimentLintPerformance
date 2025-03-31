package com.performance.module_0_15

class Feature15UseCase1(
    private val repository: Feature15Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
