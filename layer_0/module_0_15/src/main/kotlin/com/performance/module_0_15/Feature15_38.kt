package com.performance.module_0_15

class Feature15UseCase2(
    private val repository: Feature15Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
