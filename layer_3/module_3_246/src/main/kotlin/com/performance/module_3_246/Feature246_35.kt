package com.performance.module_3_246

class Feature246UseCase1(
    private val repository: Feature246Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
