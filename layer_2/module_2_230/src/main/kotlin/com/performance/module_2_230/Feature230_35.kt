package com.performance.module_2_230

class Feature230UseCase1(
    private val repository: Feature230Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
