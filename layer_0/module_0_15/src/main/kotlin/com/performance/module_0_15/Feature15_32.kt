package com.performance.module_0_15

class Feature15UseCase0(
    private val repository: Feature15Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
