package com.performance.module_4_186

class Feature186UseCase0(
    private val repository: Feature186Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
