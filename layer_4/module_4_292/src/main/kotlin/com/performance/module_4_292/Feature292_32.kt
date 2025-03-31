package com.performance.module_4_292

class Feature292UseCase0(
    private val repository: Feature292Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
