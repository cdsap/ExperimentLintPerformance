package com.performance.module_2_135

class Feature135UseCase0(
    private val repository: Feature135Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
