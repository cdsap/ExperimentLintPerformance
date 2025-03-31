package com.performance.module_3_246

class Feature246UseCase0(
    private val repository: Feature246Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
