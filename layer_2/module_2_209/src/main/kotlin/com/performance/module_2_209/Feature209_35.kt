package com.performance.module_2_209

class Feature209UseCase1(
    private val repository: Feature209Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
