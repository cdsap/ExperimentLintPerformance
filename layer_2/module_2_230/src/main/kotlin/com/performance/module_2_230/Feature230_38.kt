package com.performance.module_2_230

class Feature230UseCase2(
    private val repository: Feature230Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
