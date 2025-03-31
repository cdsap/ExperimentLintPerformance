package com.performance.module_3_246

class Feature246UseCase2(
    private val repository: Feature246Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
