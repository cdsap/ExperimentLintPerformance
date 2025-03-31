package com.performance.module_2_135

class Feature135UseCase2(
    private val repository: Feature135Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
