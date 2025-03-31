package com.performance.module_1_135

class Feature135UseCase1(
    private val repository: Feature135Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
