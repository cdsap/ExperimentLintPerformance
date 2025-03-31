package com.performance.module_2_230

class Feature230UseCase0(
    private val repository: Feature230Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
